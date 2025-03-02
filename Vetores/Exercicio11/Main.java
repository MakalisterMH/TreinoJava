package Vetores.Exercicio11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas: ");
        int quantidadePessoas = sc.nextInt();

        double[] pessoaAltura = new double[quantidadePessoas];
        char[] pessoaSexo = new char[quantidadePessoas];


        for (int i = 0; i < pessoaAltura.length; i++) {

            System.out.printf("Digite a altura da pessoa %d: ", i);
            pessoaAltura[i] = sc.nextDouble();

            System.out.printf("Digite o sexo da pessoa %d: ", i);
            pessoaSexo[i] = sc.next().charAt(0);
        }

        double menorAltura = 2, maiorAltura = 0, somaAlturaMulheres = 0;
        int quantidadeHomens = 0, quantidadeMulheres = 0;

        for (int i = 0; i < pessoaAltura.length; i++) {

            if (pessoaAltura[i] < menorAltura) {
                menorAltura = pessoaAltura[i];
            }
            if (pessoaAltura[i] > maiorAltura) {
                maiorAltura = pessoaAltura[i];
            }
            if (pessoaSexo[i] == 'M' || pessoaSexo[i] == 'm') {
                quantidadeHomens++;
            }
            if (pessoaSexo[i] == 'F' || pessoaSexo[i] == 'f') {
                somaAlturaMulheres += pessoaAltura[i];
                quantidadeMulheres++;
            }
        }

        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Maior altura: " + maiorAltura);
        System.out.printf("Media altura das mulheres: %.2f \n", somaAlturaMulheres / quantidadeMulheres);
        System.out.println("Numero de homens: " + quantidadeHomens);


    }
}
