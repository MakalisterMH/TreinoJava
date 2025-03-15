package Listas.Exemplo4;

import Matrizes_Listas.Array;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(18);
        numeros.add(23);

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }

    }
}
