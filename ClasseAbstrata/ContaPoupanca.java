package ClasseAbstrata;

public class ContaPoupanca extends ContaComum {

    private double taxaJuros;

    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(int numero, String titular, double saldo, double taxaJuros) {
        super(numero, titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    @Override
    public String toString() {
        return "ContaComum{" +
                "numero=" + getNumero() +
                ", titular='" + getTitular() + '\'' +
                ", saldo=" + getSaldo() +
                ", taxaJuros=" + taxaJuros +
                '}';
    }
}
