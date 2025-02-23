package Vetores.Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Faça um programa que leia um número inteiro positivo N e depois N números inteiros
        e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
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
            if (vetorNumeros[i] < 0) {
                System.out.println("Numero negativo na posição " + i + ": " + vetorNumeros[i]);
            }
        }


    }
}
