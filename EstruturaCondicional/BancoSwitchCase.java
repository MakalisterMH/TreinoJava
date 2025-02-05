package EstruturaCondicional;

import java.util.Scanner;

public class BancoSwitchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int usuario = 0;

        double conta = 0;

        System.out.println("\n\nSejam Bem vindo ! \n");

        while (usuario != 4) {

            System.out.println("1: Consulta de Saldo: ");
            System.out.println("2: Depositar: ");
            System.out.println("3: Sacar: ");
            System.out.println("4: Sair: ");
            usuario = sc.nextInt();

            System.out.println("\n");

            switch (usuario) {

                case 1:
                    System.out.println("Valor: " + conta + "\n");
                    break;

                case 2:
                    System.out.println("Digite o valor a ser depositado: ");
                    double deposito = sc.nextDouble();
                    System.out.println("Novo saldo: "+ (conta += deposito)+ "\n");
                    break;

                case 3:
                    System.out.println("Digite o valor a ser sacado: ");
                    double saque = sc.nextDouble();
                    System.out.println("Novo saldo: "+ (conta -= saque)+ "\n");
                    break;

                default:
                    System.out.println("Programa encerrado !");
                    break;
            }

        }

    }

}
