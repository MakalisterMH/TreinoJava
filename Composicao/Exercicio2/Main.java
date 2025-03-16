package Composicao.Exercicio2;

public class Main {
    public static void main(String[] args) {

        Prato pamonha = new Prato("pamonha", 50, CategoriaPrato.ENTRADA);
        Prato churrasco = new Prato("churrasco", 80, CategoriaPrato.PRATO_PRINCIPAL);
        Prato cocaCola = new Prato("cocaCola", 13, CategoriaPrato.BEBIDA);
        Prato acai = new Prato("acai", 20, CategoriaPrato.SOBREMESA);


        ItemPedido item1 = new ItemPedido(pamonha, 3);
        ItemPedido item2 = new ItemPedido(churrasco, 2);
        ItemPedido item3 = new ItemPedido(cocaCola, 1);
        ItemPedido item4 = new ItemPedido(acai, 2);

        Pedido pedido = new Pedido();

        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);
        pedido.adicionarItem(item3);
        pedido.adicionarItem(item4);

        System.out.println(pedido.toString());


    }
}
