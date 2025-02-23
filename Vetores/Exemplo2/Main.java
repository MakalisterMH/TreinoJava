package Vetores.Exemplo2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        Produto produto = null;

        System.out.println("Digite a quantidade de produtos que irá digitar: ");
        int quantidadeProdutos = sc.nextInt();

        Produto[] vetorProduto = new Produto[quantidadeProdutos];

        for (int i = 0; i < vetorProduto.length; i++) {

            System.out.println("Digite o nome do Produto: ");
            String nomeProduto = sc.next();

            System.out.println("Digite o preço do Produto: ");
            double precoProduto = sc.nextDouble();

            vetorProduto[i] = new Produto(nomeProduto, precoProduto);

        }

        for (int i = 0; i < vetorProduto.length; i++) {

            System.out.printf("Nome: %s, Preço: %.2f \n", vetorProduto[i].getNome(), vetorProduto[i].getPreco());
        }

        double media = 0;

        for (int i = 0; i < vetorProduto.length; i++) {

            media += vetorProduto[i].getPreco();
        }

        System.out.printf("Media de valor dos produtos do vetor é: %.2f", (media / vetorProduto.length));


    }
}
