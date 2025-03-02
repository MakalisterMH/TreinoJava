package Vetores.ExercicioPensionato;

import EstruturaCondicional.SwitchCase;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Inquilino[] inquilinos = new Inquilino[10];


        int menuUsuario = 0;

        do {

            System.out.println("Digite 1 para Quartos Disponiveis, 2 para alocar quarto, 3 para desalocar quarto e 4 para imprimir dados do inquilinos atuais e 5 para sair ...");
            menuUsuario = sc.nextInt();

            switch (menuUsuario) {

                case 1:
                    for (int i = 0; i < inquilinos.length; i++) {

                        if (inquilinos[i] == null) {
                            System.out.printf("Quarto Nº %d disponivel. \n", i);
                        }
                    }
                    break;

                case 2:
                    System.out.println("Digite a numeração do quarto q deseja alocar: ");
                    int numeroQuarto = sc.nextInt();

                    if (inquilinos[numeroQuarto] == null) {
                        System.out.println("Digite o nome da pessoa: ");
                        String nome = sc.next();

                        System.out.println("Digite o email da pessoa: ");
                        String email = sc.next();

                        inquilinos[numeroQuarto] = new Inquilino(nome, email);
                    } else {
                        System.out.println("Quarto Ocupado ! selecione outro quarto ... ");
                    }

                    break;


                case 3:

                    System.out.println("Digite qual quarto deseja desocupar: ");
                    int numeroQuarto2 = sc.nextInt();

                    if (inquilinos[numeroQuarto2] != null) {
                        inquilinos[numeroQuarto2] = null;
                        System.out.println("Quarto desocupado com sucesso !");
                    } else {
                        System.out.println("O quarto ja está desocupado !");
                    }

                    break;

                case 4:

                    boolean todosQuartosDesocupados = true;

                    for (int i = 0; i < inquilinos.length; i++) {
                        if (inquilinos[i] != null) {
                            System.out.printf("Quarto %d ocupado por %s \n", i, inquilinos[i].getNome());
                            todosQuartosDesocupados = false;
                        }
                    }
                    if (todosQuartosDesocupados == true) {
                        System.out.println("Todos os quartos estão desocupados ...");
                    }

                    break;

                case 5:
                    System.out.println("Saindo do programa ...");
                    break;


                default:
                    System.out.println("Opção invalida !");
                    break;
            }


        }
        while (menuUsuario != 5);

    }
}
