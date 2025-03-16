package Composicao.Exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String nome;
    private String cpf;

    private List<Locacao> locacao = new ArrayList<>();

    public Cliente() {
    }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void adicionarLocacao(Locacao locacao) {
        this.locacao.add(locacao);
    }

    public void removerLocacao(Locacao locacao) {
        this.locacao.remove(locacao);
    }

    public double calcularTotalGasto() {
        double total = 0;
        for (Locacao locacao : locacao) {
            total += locacao.calcularTotal();
        }
        return total;
    }


    public String listarLocacoes() {
        return locacao.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
