package Vetores.Exemplo1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Digite a quantidade de alturas que irá digitar:");
        int quantidadeAlturas = sc.nextInt();

        // Declaração do vetor ...
        double[] vetor = new double[quantidadeAlturas];

        // Usando for para preencher vetor através do indice do for...
        for (int i = 0; i < vetor.length; i++) {

            System.out.println("Digite a altura para a posição " + i + ":");
            vetor[i] = sc.nextDouble();
        }

        // Usando for para imprimir vetor através do indice do for...
        for (int i = 0; i < vetor.length; i++) {

            System.out.printf("Posição %d: %.2f \n", i, vetor[i]);
        }

        double soma = 0;

        for (int i = 0; i < vetor.length; i++) {

            soma += vetor[i];
        }

        System.out.printf("A média de altura do vetor é: %.2f", (soma / vetor.length));

        sc.close();

    }
}
