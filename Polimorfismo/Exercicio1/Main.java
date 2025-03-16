package Polimorfismo.Exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de funcionarios que será digitada: ");
        int quantidadeFuncionarios = sc.nextInt();

        List<Funcionario> listaFuncionario = new ArrayList<>();

        for (int i = 1; i <= quantidadeFuncionarios; i++) {

            System.out.println("Tercerizado ? s ou n");
            char usuario = sc.next().charAt(0);

            if (usuario == 's') {

                System.out.printf("Digite o nome do %dº funcionario: ", i);
                String nome = sc.next();

                System.out.printf("Digite as horas trabalhadas de %s: ", nome);
                int horas = sc.nextInt();

                System.out.printf("Digite o valor por hora de %s: ", nome);
                double valorPorHora = sc.nextDouble();

                System.out.printf("Digite o custo adicional de %s: ", nome);
                double custoAdicional = sc.nextDouble();

                FuncionarioTercerizado funcionarioTercerizado = new FuncionarioTercerizado(nome, horas, valorPorHora, custoAdicional);
                listaFuncionario.add(funcionarioTercerizado);

            } else if (usuario == 'n') {

                System.out.printf("Digite o nome do %dº funcionario: ", i);
                String nome = sc.next();

                System.out.printf("Digite as horas trabalhadas de %s: ", nome);
                int horas = sc.nextInt();

                System.out.printf("Digite o valor por hora de %s: ", nome);
                double valorPorHora = sc.nextDouble();

                Funcionario funcionario = new Funcionario(nome, horas, valorPorHora);
                listaFuncionario.add(funcionario);

            }


        }

        for (Funcionario funcionario : listaFuncionario) {
            System.out.println("\n" + funcionario + "\n");
        }

        for (Funcionario funcionario : listaFuncionario) {
            System.out.println(funcionario.getNome() + " - $" + funcionario.pagamento());
        }

    }
}
