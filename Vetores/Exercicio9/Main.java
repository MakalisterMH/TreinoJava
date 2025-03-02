package Vetores.Exercicio9;

import Vetores.Exercicio8.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantas pessoas voce vai digitar: ");
        int quantidadeVetor = sc.nextInt();

        Pessoa[] vetorPessoa = new Pessoa[quantidadeVetor];

        for (int i = 0; i < vetorPessoa.length; i++) {

            System.out.printf("Digite o nome da pessoa na posicao %d: ", i);
            String nome = sc.next();

            System.out.printf("Digite a idade da pessoa na posicao %d: ", i);
            int idade = sc.nextInt();

            vetorPessoa[i] = new Pessoa(nome, idade);

        }

        Pessoa pessoaMaisVelha = new Pessoa();

        for (int i = 0; i < vetorPessoa.length; i++) {

            if (vetorPessoa[i].getIdade() > pessoaMaisVelha.getIdade()) {
                pessoaMaisVelha = vetorPessoa[i];
            }

        }

        System.out.println("Mais velho do vetor tem o " + pessoaMaisVelha);



        
        System.out.println("\n \n Sem POO");

        System.out.println("Digite quantas pessoas voce vai digitar: ");
        int quantidadeVetores = sc.nextInt();

        String[] vetorNomePessoa = new String[quantidadeVetores];
        int[] vetorIdadePessoa = new int[quantidadeVetores];


        for (int i = 0; i < vetorIdadePessoa.length; i++) {

            System.out.printf("Digite o nome da pessoa na posicao %d: ", i);
            vetorNomePessoa[i] = sc.next();

            System.out.printf("Digite a idade da pessoa na posicao %d: ", i);
            vetorIdadePessoa[i] = sc.nextInt();

        }

        int idadeMaisVelho = 0;
        int posicaoMaisVelho = 0;

        for (int i = 0; i < vetorIdadePessoa.length; i++) {

            if (idadeMaisVelho < vetorIdadePessoa[i]) {
                idadeMaisVelho = vetorIdadePessoa[i];
                posicaoMaisVelho = i;
            }

        }

        System.out.println("a pessoa mais velha é: " + vetorNomePessoa[posicaoMaisVelho] + ", com idade: " + vetorIdadePessoa[posicaoMaisVelho] + ".");

    }
}
