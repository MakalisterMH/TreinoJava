package Vetores.ForEach;

public class Main {

    public static void main(String[] args) {

        String[] frutas = {"maça", "banana", "melancia", "pera", "uva", "maracuja", "abacate" };


        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Imprimindo com for: " + frutas[i]);
        }

        System.out.println("\n");

        for (String elemento : frutas) {
            System.out.println("Imprimindo com for each: " + elemento);
        }

    }
}
