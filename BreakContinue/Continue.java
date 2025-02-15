package BreakContinue;

public class Continue {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            if (i == 3) {
                continue;   // Vai pular para o proximo laço ignorando a impressao de quando i valr 3 ...
            }

            System.out.println("Volta numero: " + i);

        }
    }
}
