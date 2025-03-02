package Vetores.Exercicio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantide de alunas q será digitado: ");
        int quantidadeAlunos = sc.nextInt();

        Aluno[] vetorAlunos = new Aluno[quantidadeAlunos];


        for (int i = 0; i < vetorAlunos.length; i++) {

            System.out.printf("Digite o nome do aluno na posição %d: ", i);
            String nome = sc.next();

            System.out.printf("Digite o nota 1 do %s: ", nome);
            double n1 = sc.nextDouble();

            System.out.printf("Digite o nota 2 do %s: ", nome);
            double n2 = sc.nextDouble();

            vetorAlunos[i] = new Aluno(nome, n1, n2);

        }

        System.out.println("Imprimindo os aprovados: ");

        for (int i = 0; i < vetorAlunos.length; i++) {

            if (vetorAlunos[i].mediaAluno() >= 6) {
                System.out.println(vetorAlunos[i]);
            }
        }


    }
}
