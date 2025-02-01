package EstruturaSequencial;

import java.util.Scanner;

public class LimpezaBuffer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int idade;
        String nome;

        System.err.println("Digite sua idade: ");
        idade = sc.nextInt();

        sc.nextLine(); // Uso desse nextLine é para resolver o problema de consumo automatico da
                       // proxima linha quando usamos um metodo de leitura diferente antes do
                       // nextLine();

        System.err.println("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.println("Sua idade é: " + idade + " e seu nome é: " + nome);

    }
}
