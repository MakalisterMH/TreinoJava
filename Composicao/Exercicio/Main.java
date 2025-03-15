package Composicao.Exercicio;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = sc.next();

        System.out.println("Digite o email do cliente: ");
        String emailCliente = sc.next();

        Date nascimentoCliente = new Date();

        Cliente cliente = new Cliente(nomeCliente, emailCliente, nascimentoCliente);

        System.out.println("Digite o status do pedido: ");
        Status status = Status.valueOf(sc.next());

        System.out.println("Quantos itens terá no pedido ? ");
        int quantidadeItemPedido = sc.nextInt();

        Pedido pedido = new Pedido(new Date(), status, cliente);

        for (int i = 1; i <= quantidadeItemPedido; i++) {
            System.out.printf("Digite o nome do produto %d: ", i);
            String nomeProduto = sc.next();
            System.out.printf("Digite o preco de %s: ", nomeProduto);
            double precoProduto = sc.nextDouble();
            System.out.printf("Digite a quantidade de %s: ", nomeProduto);
            int quantidadeProduto = sc.nextInt();


            Produto produto = new Produto(nomeProduto, precoProduto);
            PedidoItem pedidoItem = new PedidoItem(quantidadeProduto, precoProduto, produto);

            pedido.adicionarItem(pedidoItem);

        }

        System.out.println(" ");
        System.out.println(pedido);


    }
}
