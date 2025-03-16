package Polimorfismo.Exercicio2;

public class ProdutoImportado extends Produto {

    private double custoImportacao;

    public ProdutoImportado() {
        super();
    }

    public ProdutoImportado(String nome, double preco, double custoImportacao) {
        super(nome, preco);
        this.custoImportacao = custoImportacao;
    }

    public double total() {
        return getPreco() + custoImportacao;
    }

    public double getCustoImportacao() {
        return custoImportacao;
    }

    public void setCustoImportacao(double custoImportacao) {
        this.custoImportacao = custoImportacao;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + getNome() + '\'' +
                ", preco=" + total() +
                ", custoImportacao=" + custoImportacao +
                '}';
    }
}
