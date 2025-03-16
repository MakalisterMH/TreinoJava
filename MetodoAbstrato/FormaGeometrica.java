package MetodoAbstrato;

public abstract class FormaGeometrica {

    private Cor cor;

    public FormaGeometrica() {
    }

    public FormaGeometrica(Cor cor) {
        this.cor = cor;
    }

    public abstract double calcularArea();

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "FormaGeometrica{" +
                "cor=" + cor +
                '}';
    }
}
