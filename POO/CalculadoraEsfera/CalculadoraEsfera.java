package POO.CalculadoraEsfera;

public class CalculadoraEsfera {

    public static final double PI = 3.14159;

    // se a constante fosse nome composto ... o certo seria: "MEDIA_ALUNO"   como por exemplo ...

    public static double circunferencia(double raio) {
        return 2 * PI * raio;
    }

    public static double volume(double raio) {
        return 4.0 / 3.0 * PI * Math.pow(raio, 3);
    }

}
