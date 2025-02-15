package Funcoes;

import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double base, altura, area;

        System.out.println("Digite a Base do Triangulo");
        base = sc.nextDouble();

        System.out.println("Digite a Altura do Triangulo");
        altura = sc.nextDouble();

        area = calcularAreaTriangulo(base, altura);

        System.out.println("Area do Triangulo: " + area);

        System.out.printf("Area do Triangulo: %.2f", area);

    }

    public static double calcularAreaTriangulo(double a, double b) {
        return (a * b) / 2;
    }
}
