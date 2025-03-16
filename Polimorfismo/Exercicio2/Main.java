package Polimorfismo.Exercicio2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws ParseException {


        Scanner sc = new Scanner(System.in);

        List<Produto> listaProdutos = new ArrayList<>();

        System.out.println("Digite a quantidade de produtos a ser digitada: ");
        int quantidadeProdutos = sc.nextInt();


        for (int i = 1; i <= quantidadeProdutos; i++) {
            System.out.println("PRODUTO N" + i + "º: ");

            System.out.println("Digite i para importafo, u para usado e c para comum: ");
            char usuario = sc.next().charAt(0);

            System.out.println("Digite o nome do produto: ");
            String nome = sc.next();

            System.out.println("Digite o preço do produto: ");
            double preco = sc.nextDouble();


            if (usuario == 'c') {
                listaProdutos.add(new Produto(nome, preco));
            }
            else if (usuario == 'u') {
                System.out.println("Digite a data de fabrição no formato (dd/MM/yyyy): ");
                Date data = ProdutoUsado.sdf.parse(sc.next());
                listaProdutos.add(new ProdutoUsado(nome, preco, data));
            }
            else {
                System.out.println("Digite o custo de importação: ");
                double custo = sc.nextDouble();
                listaProdutos.add(new ProdutoImportado(nome, preco, custo));
            }

        }

        for (Produto listaProduto : listaProdutos) {
            System.out.println("\n" + listaProduto);
        }

    }
}
