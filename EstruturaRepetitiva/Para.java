package EstruturaRepetitiva;

import java.util.Scanner;

public class Para {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos numeros vc irá digitar para somar: ");
        int quantidade = sc.nextInt();

        int soma = 0;

        for (int i = 1; i <= quantidade; i++) {

            System.out.println("Digite o numero " + i + ":");
            int numero = sc.nextInt();

            soma += numero;
        }

        System.out.println("Soma: " + soma);

    }
}
