package Composicao.Exercicio;

import java.util.Date;

public class Cliente {

    private String nome;
    private String email;
    private Date Nascimento;

    public Cliente() {
    }

    public Cliente(String nome, String email, Date nascimento) {
        this.nome = nome;
        this.email = email;
        Nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNascimento() {
        return Nascimento;
    }

    public void setNascimento(Date nascimento) {
        Nascimento = nascimento;
    }

    @Override
    public String toString() {
        return  nome + ", email=" + email + ", Nascimento=" + Nascimento;
    }
}
