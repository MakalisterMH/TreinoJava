package Vetores.Exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
        o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
        considerando a primeira posição como 0 (zero).
         */

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Digite a quantidade de numero que irá digitar:");
        int quantidadeNumeros = sc.nextInt();

        int[] vetor = new int[quantidadeNumeros];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o numero na posição " + i + ": ");
            vetor[i] = sc.nextInt();

        }

        int maiorValor = 0, posicaoMaiorValor = 0;


        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maiorValor) {
                maiorValor = vetor[i];
                posicaoMaiorValor = i;
            }
        }

        System.out.println("Maior numero digitado: " + maiorValor);
        System.out.println("Posição maior valor: " + posicaoMaiorValor);

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == maiorValor) {
                System.out.println("Outra maneira de pegar posição do maior valor ... Maior valor na posição: " + i);
            }
        }


    }
}
