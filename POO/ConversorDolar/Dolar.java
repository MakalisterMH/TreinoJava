package POO.ConversorDolar;

public class Dolar {

    public static final double IOF = 6;

    public static double conversorDolar(double dolar, double valorDesejado) {

        return valorDesejado * dolar + ((valorDesejado * dolar) * (IOF / 100));

    }

}