package BreakContinue;

public class Break {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            if (i == 3) {
                break; // Basicamente ele vai interronper o laço quando i for igual a 3 ...
            }

            System.out.println("Volta numero: " + i);

        }
    }
}
