package FuncoesString;

public class Trim {
    public static void main(String[] args) {

        String nome = "Makalister!   ";

        String nomeTrim = nome.trim(); // Serve para retirar espaços antes e dps da String

        System.out.println("Antes: '" + nome + "'");
        System.out.println("Depois: '" + nomeTrim + "'");

    }
}
