package Vetores.Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
          Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida:
          Imprimir todos os elementos do vetor
          Mostrar na tela a soma e a média dos elementos do vetor
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos numeros irá digitar: ");
        int quantidadeNumeros = sc.nextInt();

        int[] vetorNumeros = new int[quantidadeNumeros];

        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.println("Digite o numero na posição " + i + ":");
            vetorNumeros[i] = sc.nextInt();
        }

        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.println("Numero na posição " + i + ": " + vetorNumeros[i]);
        }

        int soma = 0;

        for (int i = 0; i < vetorNumeros.length; i++) {
            soma += vetorNumeros[i];
        }

        System.out.println("Soma dos numeros: "+ soma);
        System.out.printf("Media de todos os numeros do vetor: %d.",(soma / vetorNumeros.length));

    }

}

