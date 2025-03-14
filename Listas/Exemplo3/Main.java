package Listas.Exemplo3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> pessoa = new ArrayList<>();

        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Adicionando 6 nomes na lista \n");

        pessoa.add("Makalister");
        pessoa.add("Vitoria");
        pessoa.add("Amanda");
        pessoa.add("Vitoria");
        pessoa.add("Creso");
        pessoa.add("Ana");
        pessoa.add("Marco");
        pessoa.add("Aurora");


        for (String string : pessoa) {
            System.out.println("Nome: " + string);
        }

        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Removendo com predicado quem começa com 'M' \n");

        pessoa.removeIf(nome -> nome.charAt(0) == 'M');   // Nome (TAL QUE) nome na posicao 0 / primeira letra seja igual a 'M';

        for (String string : pessoa) {
            System.out.println("Nome: " + string);
        }

        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Manter com predicado apenas quem começa com 'A' \n");

        List<String> novaLista = pessoa.stream().filter(nome -> nome.charAt(0) == 'A').collect(Collectors.toList());


        novaLista.forEach(nomeNovaLista -> System.out.println(nomeNovaLista)); 
        

        System.out.println("----------------------------------------------------------------------------------------");

        System.out.println("Primeira pessoa que cmc com a letra 'C' com predicado \n");

        String namePessoaC = pessoa.stream().filter(nome -> nome.charAt(0) == 'C').findFirst().orElse(null);

        System.out.println(namePessoaC);
        
    }
}
