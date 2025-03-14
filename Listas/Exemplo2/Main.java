package Listas.Exemplo2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> pessoa = new ArrayList<>();

        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Chamando metodo isEmpty \n");

        System.out.println(pessoa.isEmpty());

        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Adicionando 6 nomes na lista \n");

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

        System.out.println("Chamando metodo indexOf");

        System.out.println(pessoa.indexOf("Vitoria"));

        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Chamando metodo toArray");

        Object[] vetorNovo = pessoa.toArray(); // Criando um vetor do tipo Object e recebendo nele a lista ...

        for (Object object : vetorNovo) {
            System.out.println(object);
        }

        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Chamando metodo forEach");

        pessoa.forEach(nome -> System.out.println(nome));

        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Chamando metodo addAll");

        List<String> novaLista = new ArrayList<>();

        novaLista.addAll(pessoa);

        novaLista.forEach(nome -> System.out.println(nome));

        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Chamando metodo subList");

        List<String> subList = novaLista.subList(1, 4);

        subList.forEach(nome -> System.out.println(nome));

    }
}
