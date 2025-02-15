package Matrizes_Listas;

import java.util.ArrayList;
import java.util.Scanner;

public class _ArrayList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> frutas = new ArrayList<>(); // O ArrayList pode crescer automaticamente conforme você vai
                                                      // adicionando elementos a ele.

        int numeroUsuario;

        do {
            System.out.println("Digite o nome de uma fruta para adicionar ao ArrayList: ");

            String nome = sc.next();

            frutas.add(nome);

            System.out.println("Digite 1 para continuar inserindo frutas ou 2 para sair do programa: ");
            numeroUsuario = sc.nextInt();

        } while (numeroUsuario == 1);

        for (String listaFrutas : frutas) {
            System.out.println(listaFrutas);
        }

        System.out.println("Deseja remover alguma fruta ? Digite 1 para sim e 2 para não: ");
        numeroUsuario = sc.nextInt();

        while (numeroUsuario == 1) {
            System.out.println("Digite o nome da fruta que deseja remover: ");
            String nome = sc.next();
            frutas.remove(nome);

            for (String frutasComRemocao : frutas) {
                System.out.println(frutasComRemocao);
            }

            System.out.println("Deseja remover mais alguma fruta ? Digite 1 para sim e 2 para não: ");
            numeroUsuario = sc.nextInt();

        }

        System.out.println("Programa encerrado !");

    }
}
