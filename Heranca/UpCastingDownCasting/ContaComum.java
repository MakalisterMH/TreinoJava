package Heranca.UpCastingDownCasting;

public class ContaComum {

    private int numero;
    private String titular;
    private double saldo;

    public ContaComum() {
    }

    public ContaComum(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public ContaComum(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void sacarSaldo(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        }
    }

    public void depositarSaldo(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }


    @Override
    public String toString() {
        return "ContaComum{" +
                "numero=" + numero +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
