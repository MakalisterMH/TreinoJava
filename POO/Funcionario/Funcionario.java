package POO.Funcionario;

public class Funcionario {

    public String nome;
    public double salarioBruto;
    public double imposto;

    public Funcionario(String nome, double salarioBruto, double imposto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
    }

    public double salarioLiquido() {
        return salarioBruto - salarioBruto * (imposto / 100);
    }

    public void porcentagemAumento(double porcentagemAumento) {
        salarioBruto += salarioBruto * (porcentagemAumento / 100);
    }

    public String toString() {
        return "Nome: " + nome + ", Salario: " + salarioBruto + " e Imposto em %: " + imposto;
    }

}
