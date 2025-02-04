package EstruturaCondicional;

import java.util.Scanner;

public class CondicionalTernaria {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um preço: ");
        double preco = sc.nextDouble();

        double desconto = (preco < 20.0) ? preco * 0.05 : preco * 0.1;  // Condicional Ternaria     se o preço for menor q 20 o desconto é de 5% se nao o desconto vai ser de 10%

        System.out.println(desconto);

    }

}
