package EstruturaCondicional;

import java.util.Scanner;

public class NotasSwitchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma nota de  0 a 10 para saber sua avalição final: ");
        int nota = sc.nextInt();

        switch (nota) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Reprovado");
                break;

            case 5:
            case 6:
                System.out.println("Recuperação");
                break;

            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Aprovado");
                break;

            default:
                System.out.println("Nota invalida");
                break;
        }



    }

}
