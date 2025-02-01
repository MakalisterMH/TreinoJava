package EstruturaSequencial;

import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome, email;
        int idade;
        double altura;
        char sexo;
        boolean nacionalidadeBrasileira;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine(); // Uso do next Line é importante por pegar toda a linha ... c usarmos apenas
                              // next ele vai pega so o primeiro nome e ignorar os sobrenomes

        System.out.println("Digite seu e-mail: ");
        email = sc.next(); // Nesse caso podemos usar apenas o next devido o email n tem espaço ...

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        System.out.println("Digite sua altura: ");
        altura = sc.nextDouble();

        System.out.println("Digite M para masculino e F para feminino: ");
        sexo = sc.next().charAt(0);

        System.out.println("Digite 1 para Brasileiro e 2 para Estrangeiro");
        int usuario = sc.nextInt();

        if (usuario == 1) {
            nacionalidadeBrasileira = true;
        } else {
            nacionalidadeBrasileira = false;
        }

        System.out.println("Seu nome é: " + nome + ", email: " + email + ", idade: " + idade + ", altura: "
                + String.format("%.2f", altura) + ", sexo: " + sexo + ", naturalidade brasileira: "
                + nacionalidadeBrasileira + ".");

        System.out.printf(
                "Impressao com printF: Seu nome é: %s, email: %s, idade: %d, altura: %.2f, sexo: %c e naturalidade Brasileira: %b ",
                nome, email, idade, altura, sexo, nacionalidadeBrasileira);

        // %s -> para String
        // %d -> para int
        // %f -> para float
        // %c -> para char
        // %b -> para boolean
        // %.2f -> para float ou double com 2 casas decimais

    }
}
