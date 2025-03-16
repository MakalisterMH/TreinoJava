package MetodoAbstrato;

public class Retangulo extends FormaGeometrica {

    private double base;
    private double altura;

    public Retangulo() {
        super();
    }

    public Retangulo(Cor cor, double base, double altura) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Retangulo, Cor = " + getCor() +
                ", Base=" + base +
                ", Altura=" + altura +
                ", Area =" + String.format("%.2f", calcularArea());
    }
}
