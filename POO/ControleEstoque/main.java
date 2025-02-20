package POO.ControleEstoque;

import java.util.Scanner;

import BreakContinue.Continue;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Produto p1 = new Produto("TV", 900, 0);

        while (true) {

            System.out.println(
                    "\n\n Digite \"1\" PARA Imprimir quantidade total - \"2\" PARA adicionar quantidade em estoque - \"3\" Para remover quantidade em estoque");
            int menu = sc.nextInt();

            switch (menu) {

                case 1:
                    System.out.printf("Quantidade total em valor de TV: %.2f", p1.valorTotalEstoque());
                    break;

                case 2:
                    System.out.println("Digite a quantidade que deseja acrescentar ao estoque:");
                    int adicionar = sc.nextInt();
                    p1.adicionarEstoque(adicionar);
                    break;

                case 3:
                    System.out.println("Digite a quantidade que deseja remover ao estoque:");
                    int remover = sc.nextInt();
                    p1.removerEstoque(remover);
                    break;

                default:
                    System.out.println("Menu invalido !");
                    ;
                    break;
            }

        }

    }
}
