package Composicao.Exercicio2;


import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<ItemPedido> item = new ArrayList<>();

    public void adicionarItem(ItemPedido itemPedido) {
        item.add(itemPedido);
    }

    public void removerItem(ItemPedido itemPedido) {
        item.remove(itemPedido);
    }

    public double calcularTotal() {
        double resultado = 0;
        for (ItemPedido itemPedido : item) {
            resultado += itemPedido.getPrato().getPreco() * itemPedido.getQuantidade();
        }
        return resultado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();


        for (ItemPedido itemPedido : item) {
            sb.append("\n");
            sb.append("==================================================\n");
            sb.append("Detalhes do Pedido: \n\n");
            sb.append("Categoria: " + itemPedido.getPrato().getCategoriaPrato() + ", \n");
            sb.append("Nome: " + itemPedido.getPrato().getNome() + ", \n");
            sb.append("Quantidade: " + itemPedido.getQuantidade() + ", \n");
            sb.append("Preco: " + itemPedido.getPrato().getPreco() + ", \n");
            sb.append("Total item: " + itemPedido.totalItemPedido() + ", \n");
            sb.append("==================================================\n");
            sb.append("\n");

        }
        sb.append("Total pedido: " + calcularTotal() + ", \n");
        sb.append("==================================================\n");

        return sb.toString();
    }
}
