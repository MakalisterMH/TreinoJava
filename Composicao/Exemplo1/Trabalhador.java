package Composicao.Exemplo1;

import java.util.*;

public class Trabalhador {

    private String nome;
    private Level level;
    private double salarioBase;

    // Composições
    private Departamento departamento;
    private List<ContratoHora> contratoHoras = new ArrayList<>();

    public Trabalhador() {
    }

    public Trabalhador(String nome, Level level, double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.level = level;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }


    public void adicionarContrato(ContratoHora contratoHora) {
        contratoHoras.add(contratoHora);
    }

    public void removerContrato(ContratoHora contratoHora) {
        contratoHoras.remove(contratoHora);
    }

    public double ganhos(Integer ano, Integer mes) {

        Calendar calendar = Calendar.getInstance();
        double soma = 0;

        for (ContratoHora contratoHora : contratoHoras) {

            calendar.setTime(contratoHora.getData());

            int anos = calendar.get(calendar.YEAR);
            int meses = 1 + calendar.get(calendar.MONTH);

            if (anos == ano && meses == mes)
                soma += contratoHora.totalValor();
        }

        return salarioBase + soma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoHora> getContratoHoras() {
        return contratoHoras;
    }

}
