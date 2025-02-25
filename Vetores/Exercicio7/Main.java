package Vetores.Exercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quanto numeros vai ter o vetor: ");
        int quantidadeNumeros = sc.nextInt();

        double[] vetor = new double[quantidadeNumeros];

        for (int i = 0; i < vetor.length; i++) {

            System.out.printf("Digite o numero na posição %d: ", i);
            vetor[i] = sc.nextDouble();
        }

        double soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        System.out.printf("Media do Vetor: %.3f \n", soma / vetor.length);

        System.out.println("Elementos abaixo da média: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < (soma / vetor.length)) {
                System.out.println(vetor[i]);

            }
        }

    }
}
