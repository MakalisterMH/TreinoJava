package Final;

public class Main {
    public static void main(String[] args) {

        final double cem = 100;  // palavra final faz com que a variavel se torne constante ... não mudar o valor ...

    }
}

// class final Funcionario {  Palavra final faz com que essa classe n possar ser extendida ...
class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    //public final void aumentarSalario(double valor) {        Palavra final faz com que esse metodo n possa ser sobrescrito ...
    public void aumentarSalario(double valor) {
        salario += valor;
    }
}

class Gerente extends Funcionario {

    double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    @Override
    public void aumentarSalario(double valor) {
        super.aumentarSalario(valor);
    }
}
