package Listas.Exercicio1;

public class Funcionario {

    private int id;
    private String nome;
    private double salario;

    public Funcionario(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentoSalario(int porcentagem){
        salario += salario / 100 * porcentagem;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public String toString() {
        return "Id: " + id + ", Nome: " + nome + ", Salario: " + salario;
    }


}

