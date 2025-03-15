package Matriz.Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o padrao da matriz ...");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Digite o numero q vai na linha " + i + ", e coluna " + j + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Diagonal Principal: ");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println("\n");

        System.out.println("Matriz: ");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int numerosNegativo = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] < 0) {
                    numerosNegativo++;
                }
            }
        }

        System.out.println("Quantidade de Numeros negativos: " + numerosNegativo);

    }
}
