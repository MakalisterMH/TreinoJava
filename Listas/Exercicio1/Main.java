package Listas.Exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();
        Funcionario funcionario;

        System.out.println("Digite quantos funcionarios voce irá digitar: ");
        int quantidade = sc.nextInt();


        for (int i = 0; i < quantidade; i++) {

            System.out.println("Digite o id do funcionario: ");
            int idFuncionario = sc.nextInt();

            System.out.println("Digite o nome do funcionario: ");
            String nomeFuncionario = sc.next();

            System.out.println("Digite o salario do funcionario: ");
            double salarioFuncionario = sc.nextDouble();

            funcionario = new Funcionario(idFuncionario, nomeFuncionario, salarioFuncionario);

            funcionarios.add(funcionario);

        }

        funcionarios.forEach(f -> System.out.println(f));


        System.out.println("Digite o id do funcionario que irá ter aumento no salario: ");
        int aumentoSalario = sc.nextInt();

        System.out.println("Digite a porcentagem de aumento: ");
        int porcentagem = sc.nextInt();


        Funcionario funcionario1 = funcionarios.stream().filter(f -> f.getId() == aumentoSalario).findFirst().orElse(null);

        for (Funcionario f : funcionarios) {
            if (funcionario1.getId() == aumentoSalario) {
                f.aumentoSalario(porcentagem);
            }
            System.out.println(f);
        }


        /*
        for (Funcionario f : funcionarios) {
            if (f.getId() == aumentoSalario) {
                f.aumentoSalario(porcentagem);
            }

            System.out.println(f);

        }
*/

    }
}
