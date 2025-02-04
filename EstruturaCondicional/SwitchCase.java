package EstruturaCondicional;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero de 1 a 7");
        int valor = sc.nextInt();

        String dia;

        switch (valor) {
            case 1:
                dia = "Domingo";
                break;

            case 2:
                dia = "Segunda";
                break;

            case 3:
                dia = "Terça";
                break;

            case 4:
                dia = "Quarta";
                break;

            case 5:
                dia = "Quinta";
                break;

            case 6:
                dia = "Sexta";
                break;

            case 7:
                dia = "Sabado";
                break;

            default:
                dia = "valor invalido";
                break;
        }

        System.out.println(dia);

    }

}
