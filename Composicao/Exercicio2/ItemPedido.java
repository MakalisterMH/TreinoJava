package Composicao.Exercicio2;

public class ItemPedido {

    private Prato prato;
    private int quantidade;

    public ItemPedido() {
    }

    public ItemPedido(Prato prato, int quantidade) {
        this.prato = prato;
        this.quantidade = quantidade;
    }

    public double totalItemPedido(){
        return prato.getPreco() * quantidade;
    }

    public Prato getPrato() {
        return prato;
    }

    public void setPrato(Prato prato) {
        this.prato = prato;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
