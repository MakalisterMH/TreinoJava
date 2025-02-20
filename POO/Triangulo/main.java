package POO.Triangulo;

public class main {
    public static void main(String[] args) {

        Triangulo t1 = new Triangulo(5, 6, 7);

        System.out.printf("\n Perimetro do triangulo: %.2f", t1.perimetro());

        System.out.printf("\n Area do triangulo: %.2f", t1.area());

        System.out.println("\n" + t1.toString());


    }
}
