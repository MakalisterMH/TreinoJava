package POO.ContaBancaria;

public class ContaBancaria {

    private int numeroConta;
    private String nome;
    private double saldo;

    public ContaBancaria(int numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
    }

    public ContaBancaria(int numeroConta, String nome, double valorInicial) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = valorInicial;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double valor) {
        this.saldo += valor;
    }

    public void saque(double valor) {

        if (valor + 5 <= this.saldo) {
            this.saldo -= valor + 5;
        } else {
            System.out.println("Saldo insuficiente");
        }

    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numeroConta=" + numeroConta +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
