package POO.Retangulo;

public class main {
    public static void main(String[] args) {
        
        Retangulo r1 = new Retangulo(3, 4);


        System.out.println("Area: " + r1.calcularArea());
        System.out.println("Perimetro: " + r1.calcularPerimetro());
        System.out.println("Diagonal: " + r1.calcularDiagonal());

    }
}
