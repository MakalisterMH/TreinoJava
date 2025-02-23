package Vetores.Exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
        tela todos os números pares, e também a quantidade de números pares.
         */

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Digite a quantidade de numero que irá digitar:");
        int quantidadeNumeros = sc.nextInt();

        int[] vetor = new int[quantidadeNumeros];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o numero na posição " + i + ": ");
            vetor[i] = sc.nextInt();

        }

        System.out.println("Impressão de numeros pares: ");

        int quantidadePares = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.println(vetor[i]);
                quantidadePares += 1;
            }
        }

        System.out.println("Quantidade de numeros pares: " + quantidadePares);


    }
}
