package EstruturaSequencial;

public class Casting {
    public static void main(String[] args) {

        int a, b, c;
        double resultado;

        a = 5;
        b = 2;

        resultado = (double) a / b;

        System.out.println(resultado);

        // ==========================================================

        c = (int) resultado;

        System.out.println(c);

    }
}
