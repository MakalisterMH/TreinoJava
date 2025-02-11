package EstruturaRepetitiva;

import java.util.Scanner;

public class Enquanto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int usuario = 1;
        int soma = 0;

        while (usuario != 0) {

            System.out.println("Digite 1 numero para ir somando, caso queria sair digite 0");
            usuario = sc.nextInt();

            soma += usuario;

        }

        System.out.println("Total da soma de todos os numeros digitados: " + soma);

    }
}
