package Math;

public class MathRandom {
    public static void main(String[] args) {

        double numero1 = Math.random(); // Nesse caso é um numero aleatorio de 0.0 até 1.0 ...

        System.out.println("Numero aleatorio: " + numero1);

        int numero2 = (int) (Math.random() * 101); // Numero aleatorio de 0 até 100

        System.out.println("Numero aleatorio: " + numero2);

    }
}
