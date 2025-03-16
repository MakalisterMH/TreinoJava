package Polimorfismo.Exercicio1;

public class Funcionario {

    private String nome;
    private Integer hora;
    private double valorPorHora;

    public Funcionario() {
    }

    public Funcionario(String nome, Integer hora, double valorPorHora) {
        this.nome = nome;
        this.hora = hora;
        this.valorPorHora = valorPorHora;
    }

    public double pagamento() {
        return hora * valorPorHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHora() {
        return hora;
    }

    public void setHora(Integer hora) {
        this.hora = hora;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", hora=" + hora +
                ", valorPorHora=" + valorPorHora +
                '}';
    }
}
