package Matrizes;

public class Matriz {
    public static void main(String[] args) {

        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        for (int[] linha : matriz) {
            // Dentro de cada linha, percorre os elementos e imprime
            for (int elemento : linha) {
                System.out.print(elemento + " "); // Imprime os elementos da linha
            }
            System.out.println(); // Pula para a próxima linha após imprimir todos os elementos
        }

        // Uma matriz no Java é um array de arrays. Ela é usada para representar tabelas
        // ou grades de dados.

    }
}
