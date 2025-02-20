package POO.Triangulo;

public class Triangulo {

    public double ladoA;
    public double ladoB;
    public double ladoC;
    public double perimetro;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public double perimetro() {
        return this.perimetro = (this.ladoA + this.ladoB + this.ladoC) / 2;
    }

    public double area() {
        double p = perimetro();
        return Math
                .sqrt(p * (p - ladoA) * (p - ladoB) * (p - ladoC));
    }

    public String toString() {
        return "Triangulo [ladoA=" + ladoA + ", ladoB=" + ladoB + ", ladoC=" + ladoC + "]";
    }

}
