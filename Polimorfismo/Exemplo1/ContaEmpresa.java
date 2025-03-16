package Polimorfismo.Exemplo1;

public class ContaEmpresa extends ContaComum {

    private double limiteSaque;

    public ContaEmpresa(int numero, String titular, double saldo, double limiteSaque) {
        super(numero, titular, saldo);
        this.limiteSaque = limiteSaque;
    }

    @Override
    public void sacarSaldo(double valor) {
        if (getSaldo() >= valor && valor <= limiteSaque) {
            super.sacarSaldo(valor + 10);
            // Obs super para o java n confundir com recursao
        } else {
            System.out.println("ERRO ! lImite de 1000 por saque");
        }
    }

    @Override
    public void depositarSaldo(double valor) {
        super.depositarSaldo(valor);
        // Obs super para o java n confundir com recursao
    }

    public double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }


    @Override
    public String toString() {
        return "ContaComum{" +
                "numero=" + getNumero() +
                ", titular='" + getTitular() + '\'' +
                ", saldo=" + getSaldo() +
                ", saldo=" + limiteSaque +
                '}';
    }

}
