package Polimorfismo.Exercicio1;

public class FuncionarioTercerizado extends Funcionario {

    private double custoAdicional;

    public FuncionarioTercerizado() {
    }

    public FuncionarioTercerizado(String nome, Integer hora, double valorPorHora, double custoAdicional) {
        super(nome, hora, valorPorHora);
        this.custoAdicional = custoAdicional;
    }

    @Override
    public double pagamento() {
        return super.pagamento() + ((custoAdicional / 100) * 110);
    }

    public double getCustoAdicional() {
        return custoAdicional;
    }

    public void setCustoAdicional(double custoAdicional) {
        this.custoAdicional = custoAdicional;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + getNome() + '\'' +
                ", hora=" + getHora() +
                ", valorPorHora=" + getValorPorHora() +
                ", custoAdicional=" + custoAdicional +
                '}';
    }
}
