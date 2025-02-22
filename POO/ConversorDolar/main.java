package POO.ConversorDolar;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o valor do Dolar atual: ");
        double dolarAtual = sc.nextDouble();

        System.out.println("Qual o valor que deseja comprar em Reais: ");
        double valorDesejado = sc.nextDouble();

        System.out.printf("O valor que voce deve pagar é de %.2f",Dolar.conversorDolar(dolarAtual,valorDesejado));

    }
}
