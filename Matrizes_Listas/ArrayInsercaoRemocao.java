package Matrizes_Listas;

import java.util.Scanner;

public class ArrayInsercaoRemocao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[5];

        boolean nomeEncontrado = false;

        for (int i = 0; i < nomes.length; i++) {

            System.out.println("Digite o nome que vai na posição " + i + ": ");

            String nome = sc.next();

            nomes[i] = nome;
        }

        for (String listaNomes : nomes) {
            System.out.println(listaNomes);
        }

        System.out.println("======== REMOVENDO NOMES DA LISTA ========");

        System.out.println("Digite o nome que deseja remover: ");

        String nome = sc.next();

        for (int i = 0; i < nomes.length; i++) {

            if (nome.equals(nomes[i])) { // Define o nome localizado como null
                nomes[i] = null;

                nomeEncontrado = true;

            /* Se achar null no indice ele puxar o valor do proximo indice pro lugar dele ... e assim por diante até o
                penultimo indice ... deixando o ultimo elemento como null */

                if (nomeEncontrado == true) {
                    for (int a = 0; a < nomes.length - 1; a++) {

                        if (nomes[a] == null) {
                            nomes[a] = nomes[a + 1];
                            nomes[a + 1] = null;

                        }
                    }
                }

                nomeEncontrado = false;

            }

        }

        for (String listaNomes : nomes) {
            System.out.println(listaNomes);
        }

    }
}
