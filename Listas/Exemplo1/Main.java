package Listas.Exemplo1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> pessoa = new ArrayList<>();

        pessoa.add("Makalister");
        pessoa.add("Vitoria");
        pessoa.add("Amanda");
        pessoa.add("Vitoria");
        pessoa.add("Creso");
        pessoa.add("Marco");

        for (String string : pessoa) {
            System.out.println("Nome: " + string);
        }

        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Size: " + pessoa.size());

        System.out.println("Contains Makalister ? " + pessoa.contains("Makalister"));

        System.out.println("Last Index Amanda: " + pessoa.lastIndexOf("Vitoria"));

        System.out.println("Get Index 1: " + pessoa.get(1));


        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Removendo index 2 da lista \n");

        pessoa.remove(2);

        for (String string : pessoa) {
            System.out.println("Nome: " + string);
        }

        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Removendo Creso da lista  \n");

        pessoa.remove("Creso");

        for (String string : pessoa) {
            System.out.println("Nome: " + string);
        }


        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Adicionando Amanda na lista index 2  \n");

        pessoa.add(2, "Amanda");

        for (String string : pessoa) {
            System.out.println("Nome: " + string);
        }


        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Limpando todos elementos da lista  \n");

        pessoa.clear();

        for (String string : pessoa) {
            System.out.println("Nome: " + string);
        }

        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Adicionando Makalister na lista novamente  \n");

        pessoa.add("Makalister");

        for (String string : pessoa) {
            System.out.println("Nome: " + string);
        }

    }
}
