package EstruturaCondicional;

import java.util.Scanner;

public class MoedaSwitchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor em Reais q deseja converter: ");
        int valor = sc.nextInt();

        System.out.println("1 para converter para Dolar");
        System.out.println("2 para converter para Euro");
        System.out.println("3 para converter para Libra");

        int usuario = sc.nextInt();

        switch (usuario) {
            case 1:
                System.out.print(valor / 5.75);
                break;

            case 2:
                System.out.println(valor / 5.97);
                break;

            case 3:
                System.out.println(valor / 7.18);
                break;

            default:
                System.out.println("Comando Invalido !");
                break;
        }

    }

}
