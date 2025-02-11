package EstruturaRepetitiva;

import java.util.Scanner;

public class Enquanto2 {
    public static void main(String[] args) {

        int x = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de paginas: ");
        int pagina = sc.nextInt();

        while (x <= pagina) {

            System.out.println("##PAG " + x);

            x++;
        }

    }
}
