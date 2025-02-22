package POO.CalculadoraEsfera;

import java.util.Locale;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio: ");
        double raio = sc.nextDouble();

        System.out.printf("Raio: %.2f \n", raio);
        System.out.printf("Circunferencia: %.2f \n", CalculadoraEsfera.circunferencia(raio));
        System.out.printf("Volume: %.2f \n", CalculadoraEsfera.volume(raio));

    }

}
