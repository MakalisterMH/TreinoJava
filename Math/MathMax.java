package Math;

public class MathMax {
    public static void main(String[] args) {

        int a = 3, b = 5, c = 7;

        int resultado = Math.max(a, b);

        System.out.println("Numero maior: " + resultado);

        resultado = Math.max(Math.min(a, b), c); // Encadeamento para mais de 2 numeros ...

        System.out.println("Numero maior: " + resultado);
    }
}
