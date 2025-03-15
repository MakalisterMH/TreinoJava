package Composicao.Exercicio;

public class PedidoItem {

    private Integer quantidade;
    private double preco;

    //Composição
    Produto produto = new Produto();

    public PedidoItem() {
    }

    public PedidoItem(Integer quantidade, double preco, Produto produto) {
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }

    public double subTotal() {
        return quantidade * preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("Produto: " + produto + ", \n");
        sb.append("Quantidade: " + quantidade + ", \n");
        sb.append("Preco: " + preco + " \n");
        sb.append("Total: " + subTotal() + " \n");

        return sb.toString();
    }


}
