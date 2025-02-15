package Math;

public class MathMin {
    
    public static void main(String[] args) {

        int a = 3, b = 5, c = 2;

        int resultado = Math.min(a, b);

        System.out.println("Numero menor: " + resultado);

        resultado = Math.min(Math.min(a, b), c);  // Encadeamento para mais de 2 numeros ...

        System.out.println("Numero menor: " + resultado);
    }
}
