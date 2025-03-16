package Composicao.Exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Locacao {

    int diasAluguel;
    Cliente cliente;
    Veiculo veiculo;

    public Locacao() {
    }

    public Locacao(int diasAluguel, Cliente cliente, Veiculo veiculo) {
        this.diasAluguel = diasAluguel;
        this.cliente = cliente;
        this.veiculo = veiculo;
    }


    public double calcularTotal() {
        return diasAluguel * veiculo.getPrecoDiario();
    }


    public int getDiasAluguel() {
        return diasAluguel;
    }

    public void setDiasAluguel(int diasAluguel) {
        this.diasAluguel = diasAluguel;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\n");
        sb.append("---------------------\n");
        sb.append("Detalhes da Locação: \n");
        sb.append("---------------------\n");
        sb.append("Nome: " + cliente.getNome() + " \n");
        sb.append("CPF: " + cliente.getCpf() + " \n");
        sb.append("\n");
        sb.append("Veiculo: " + veiculo.getModelo() + " \n");
        sb.append("Marca: " + veiculo.getMarca() + " \n");
        sb.append("Ano: " + veiculo.getAno() + " \n");
        sb.append("Categoria: " + veiculo.getCategoriaVeiculo() + " \n");
        sb.append("Diaria: " + veiculo.getPrecoDiario() + " \n");
        sb.append("Dias alugados: " + getDiasAluguel() + " \n");
        sb.append("---------------------\n");
        sb.append("Total a pagar locação: " + calcularTotal() + " \n");
        sb.append("---------------------\n");


        return sb.toString();

    }
}
