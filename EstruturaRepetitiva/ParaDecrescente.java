package EstruturaRepetitiva;

import java.util.Scanner;

public class ParaDecrescente {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero para fazer a contagem decrescente: ");
        int numero = sc.nextInt();

        System.out.println("=========================================================================");

        for (int i = numero; i >= 1; i--) {
            System.out.println(i);
        }

    }
}
