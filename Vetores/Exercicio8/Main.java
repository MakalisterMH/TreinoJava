package Vetores.Exercicio8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*
        Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
        aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
        digitado, mostrar a mensagem "NENHUM NUMERO PAR"
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos numeros vai ter o vetor: ");
        int quantidadeVetor = sc.nextInt();

        int[] vetor = new int[quantidadeVetor];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o numero para o elemento %d: ", i);
            vetor[i] = sc.nextInt();
        }

        int somaPar = 0;
        int quantidadePar = 0;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                somaPar += vetor[i];
                quantidadePar++;
            }
        }

        if (somaPar != 0) {
            System.out.printf("Média dos numeros pares do vetor é: %.1f: ", (double) somaPar / quantidadePar);
        } else {
            System.out.println("Não tem numeros pares no vetor...");
        }


    }
}
