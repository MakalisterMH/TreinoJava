package EstruturaCondicional;

import java.util.Scanner;

public class Se {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um horario (apenas horas)");
        int horario = sc.nextInt();

        if (horario > 6 && horario < 12) {
            System.err.println("Bom dia");
        } else if (horario > 12 && horario < 18) {
            System.err.println("Boa tarde");
        } else if (horario > 18 && horario < 24) {
            System.err.println("Boa noite");
        } else {
            System.out.println("Boa madrugada");
        }

    }
}