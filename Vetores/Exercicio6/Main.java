package Vetores.Exercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quanto numeros vai ter em cada vetor: ");
        int quantidadeNumeros = sc.nextInt();

        int[] vetor1 = new int[quantidadeNumeros];
        int[] vetor2 = new int[quantidadeNumeros];

        for (int i = 0; i < vetor1.length; i++) {
            System.out.printf("Digite o numero para a posição %d do vetor 1: ", i);
            vetor1[i] = sc.nextInt();
        }

        for (int i = 0; i < vetor2.length; i++) {
            System.out.printf("Digite o numero para a posição %d do vetor 2: ", i);
            vetor2[i] = sc.nextInt();
        }

        int[] vetor3 = new int[vetor1.length];

        for (int i = 0; i < vetor1.length; i++) {
            vetor3[i] = vetor1[i] + vetor2[i];
        }

        System.out.println("Vetor Resultante:");

        for (int i = 0; i < vetor1.length; i++) {
            System.out.println(vetor3[i]);
        }

    }
}
