package Composicao.Exercicio3;

public class Veiculo {

    private String modelo;
    private String marca;
    private int ano;
    private CategoriaVeiculo categoriaVeiculo;
    private double precoDiario;

    public Veiculo() {
    }

    public Veiculo(String modelo, String marca, int ano, CategoriaVeiculo categoriaVeiculo, double precoDiario) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.categoriaVeiculo = categoriaVeiculo;
        this.precoDiario = precoDiario;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public CategoriaVeiculo getCategoriaVeiculo() {
        return categoriaVeiculo;
    }

    public void setCategoriaVeiculo(CategoriaVeiculo categoriaVeiculo) {
        this.categoriaVeiculo = categoriaVeiculo;
    }

    public double getPrecoDiario() {
        return precoDiario;
    }

    public void setPrecoDiario(double precoDiario) {
        this.precoDiario = precoDiario;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", ano=" + ano +
                ", categoriaVeiculo=" + categoriaVeiculo +
                ", precoDiario=" + precoDiario +
                '}';
    }
}
