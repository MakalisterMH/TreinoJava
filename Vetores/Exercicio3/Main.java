package Vetores.Exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
        tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos
         */


        Scanner sc = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Digite a quantidade de Pessoas que irá digitar:");
        int quantidadePessoas = sc.nextInt();


        Pessoa[] vetor = new Pessoa[quantidadePessoas];

        Pessoa pessoa = null;


        for (int i = 0; i < vetor.length; i++) {

            System.out.println("Digite o Nome para a pessoa na posição " + i + ":");
            String nomePessoa = sc.next();

            System.out.println("Digite a Idade para a pessoa na posição " + i + ":");
            int idadePessoa = sc.nextInt();

            System.out.println("Digite a Altura para a pessoa na posição " + i + ":");
            double alturaPessoa = sc.nextDouble();

            pessoa = new Pessoa(nomePessoa, idadePessoa, alturaPessoa);

            vetor[i] = pessoa;

        }

        for (int i = 0; i < vetor.length; i++) {

            System.out.println("Dados da pessoa na posição " + i + ": " + vetor[i]);
        }

        double somaAltura = 0;

        for (int i = 0; i < vetor.length; i++) {

            somaAltura += vetor[i].getAltura();
        }

        System.out.printf("Média de alturas das pessoas no vetor é de: %.2f \n", (somaAltura / vetor.length));

        int menores16 = 0;

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i].getIdade() < 16) {
                menores16 += 1;
            }
        }

        double porcentagem = ((double) menores16 / vetor.length) * 100;

        System.out.printf("porcentagem de pessoas menores de 16 %.2f", porcentagem);

    }
}

