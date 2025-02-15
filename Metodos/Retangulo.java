package Funcoes;

import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double base, altura, area;

        System.out.println("Digite a Base do Retangulo");
        base = sc.nextDouble();

        System.out.println("Digite a Altura do Retangulo");
        altura = sc.nextDouble();

        area = calcularAreaRetangulo(base, altura);

        System.out.println("Area do Retangulo: " + area);

        System.out.printf("Area do Retangulo: %.2f", area);

    }

    public static double calcularAreaRetangulo(double a, double b) {
        return a * b;
    }

}
