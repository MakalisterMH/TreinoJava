package EstruturaCondicional;

import java.util.Scanner;

public class CalculadoraSwitchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite: ");
        System.out.println("1 Para Soma");
        System.out.println("2 Para Subtração");
        System.out.println("3 Para Multiplicação");
        System.out.println("4 Para Divisão");

        int numeroUsuario = sc.nextInt();

        System.out.println("Digite o primeiro numero: ");
        double numero1 = sc.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double numero2 = sc.nextDouble();

        switch (numeroUsuario) {
            case 1:
                System.out.println(numero1 + numero2);
                break;
            case 2:
                System.out.println(numero1 - numero2);
                break;
            case 3:
                System.out.println(numero1 * numero2);
                break;
            case 4:
                System.out.println(numero1 / numero2);
                break;

            default:
                System.out.println("Numero Invalido");
                break;
        }

    }

}
