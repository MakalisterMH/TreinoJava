package POO.Funcionario;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Funcionario f = new Funcionario("Makalister", 2000, 10);

        System.out.println(f);

        System.out.println("Salario Liquido: " + f.salarioLiquido());
        
        System.out.println("Digite quanto vc quer aumentar do salario em porcentagem: ");
        f.porcentagemAumento(sc.nextInt());

        System.out.println("Atualizado para:" + f);

        System.out.println("Salario Liquido: " + f.salarioLiquido());

    }
}
