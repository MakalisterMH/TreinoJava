package Matriz.Exercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a quantidade de linhas: ");
        int quantidadeLinhas = sc.nextInt();

        System.out.println("Digite a quantidade de colunas: ");
        int quantidadeColunas = sc.nextInt();

        int[][] numeros = new int[quantidadeLinhas][quantidadeColunas];


        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.printf("Digite o numero q vai na linha %d e coluna %d: ", i, j);
                numeros[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Digite qual o numero que voce quer olhar as posicões e ver seus vizinhos: ");
        int posicaoNumeros = sc.nextInt();

        for (int i = 0; i < quantidadeLinhas; i++) {
            for (int j = 0; j < quantidadeColunas; j++) {
                if (numeros[i][j] == posicaoNumeros) {
                    System.out.printf("Posição %d,%d \n", i, j);

                    if (j > 0) {
                        System.out.printf("Left: %d \n", numeros[i][j - 1]);
                    }
                    if (j < quantidadeColunas - 1) {
                        System.out.printf("Right %d \n", numeros[i][j + 1]);
                    }

                    if (i > 0) {
                        System.out.printf("Up %d \n", numeros[i - 1][j]);
                    }
                    if (i < quantidadeLinhas - 1) {
                        System.out.printf("Down %d \n", numeros[i + 1][j]);
                    }

                }
            }
        }

    }

}
