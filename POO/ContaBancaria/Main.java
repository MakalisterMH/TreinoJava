package POO.ContaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ContaBancaria conta1 = null;

        System.out.println("Digite o numero da conta: ");
        int numeroConta = sc.nextInt();

        System.out.println("Digite o nome do titular: ");
        String nomeTitular = sc.next();

        char simOuNao;

        do {
            System.out.println("Haverá depósito inicial ? \"s\" para sim ou \"n\" para não.");
            simOuNao = sc.next().charAt(0);

            switch (Character.toLowerCase(simOuNao)) { //pelo falo de ser sensivel ... devemos fazer a conversão para minuscula para evitar problemas de compartibilidade por conta de sensitive case
                case 's': {
                    System.out.println("Digite o valor do deposito inicial: ");
                    double depositoInicial = sc.nextDouble();
                    conta1 = new ContaBancaria(numeroConta, nomeTitular, depositoInicial);
                    break;
                }
                case 'n': {
                    conta1 = new ContaBancaria(numeroConta, nomeTitular);
                    break;
                }
                default:
                    System.out.println("Opção incorreta ! Digite novamente...");
                    break;
            }
        } while (Character.toLowerCase(simOuNao) != 's' && Character.toLowerCase(simOuNao) != 'n');

        int opcaoUsuario;

        do {

            System.out.println("Digite 1 para depositar, 2 para sacar e 3 para sair do programa");
            opcaoUsuario = sc.nextInt();

            switch (opcaoUsuario) {

                case 1:
                    System.out.println("Digite o valor que deseja depositar: ");
                    double valorDeposito = sc.nextDouble();
                    conta1.deposito(valorDeposito);

                    System.out.println(conta1);

                    break;

                case 2:
                    System.out.println("Digite o valor que deseja sacar: ");
                    double valorSaque = sc.nextDouble();
                    conta1.saque(valorSaque);

                    System.out.println(conta1);

                    break;

                case 3:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente");
                    break;
            }
        }
        while (opcaoUsuario != 3);


    }
}
