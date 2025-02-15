package Metodos;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double somaNumeros = 0;

        System.out.println("Digite a quantidade de numeros que irar digitar: ");
        int quantidadeNumeros = sc.nextInt();

        for (int i = 1; i <= quantidadeNumeros; i++) {
            System.out.printf("Digite o numero %d: ", i);
            double usuarioTeclado = sc.nextDouble();
            somaNumeros += usuarioTeclado;
        }

        System.out.println("Soma de todos os numeros: " + somaNumeros);
        System.out.println("Quantidade de numeros digitados: " + quantidadeNumeros);

        System.out.println("=======================================================================");

        double resultado = MediaAritmetica(somaNumeros, quantidadeNumeros);

        System.out.printf("Resultado da Média Aritmetica: %.2f", resultado);

    }

    public static double MediaAritmetica(double somaNumeros, int quantidadeNumeros) {
        return somaNumeros / quantidadeNumeros;
    }
}
