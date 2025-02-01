package EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class AlterandoLocal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US); // Para alterar de "," para ponto na hora de digitar os doubles ...

        Scanner sc = new Scanner(System.in);

        double a;

        System.out.println("Digite um numero flutuante");
        a = sc.nextDouble();

        System.err.println(a);

    }
}
