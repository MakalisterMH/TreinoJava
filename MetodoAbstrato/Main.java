package MetodoAbstrato;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException {

        Scanner sc = new Scanner(System.in);

        List<FormaGeometrica> listaGeometricas = new ArrayList<>();

        System.out.println("Digite a quantidade de formas geometricas a ser digitado");
        int quantidade = sc.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            System.out.printf("Dados do item %d: ", i);

            System.out.println("Digite 1 para retangulo e 2 para circulo: ");
            int usuario = sc.nextInt();

            System.out.println("Digite PRETO, AZUL ou VERMELHO");
            String cor = sc.next().toUpperCase();

            if (usuario == 1) {

                System.out.println("Digite o tamanho da base: ");
                double base = sc.nextDouble();

                System.out.println("Digite o tamanho da altura: ");
                double altura = sc.nextDouble();

                listaGeometricas.add(new Retangulo(Cor.valueOf(cor), base, altura));
            }
            else {

                System.out.println("Digite o tamanho do raio: ");
                double raio = sc.nextDouble();

                listaGeometricas.add(new Circulo(Cor.valueOf(cor), raio));
            }
        }

        for (FormaGeometrica listaGeometrica : listaGeometricas) {
            System.out.println(listaGeometrica);
        }

    }
}
