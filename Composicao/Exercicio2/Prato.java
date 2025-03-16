package Composicao.Exercicio2;

public class Prato {

    private String nome;
    private double preco;
    private CategoriaPrato categoriaPrato;

    public Prato() {
    }

    public Prato(String nome, double preco, CategoriaPrato categoriaPrato) {
        this.nome = nome;
        this.preco = preco;
        this.categoriaPrato = categoriaPrato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public CategoriaPrato getCategoriaPrato() {
        return categoriaPrato;
    }

    public void setCategoriaPrato(CategoriaPrato categoriaPrato) {
        this.categoriaPrato = categoriaPrato;
    }
}
