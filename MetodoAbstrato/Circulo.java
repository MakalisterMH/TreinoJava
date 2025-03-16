package MetodoAbstrato;

public class Circulo extends FormaGeometrica {

    private double raio;

    public Circulo() {
        super();
    }

    @Override
    public double calcularArea() {
        return Math.PI * (raio * raio);
    }

    public Circulo(Cor cor, double raio) {
        super(cor);
        this.raio = raio;
    }


    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "Circulo, Cor = " + getCor() +
                ", raio=" + raio +
                ", Area =" + String.format("%.2f", calcularArea());
    }
}
