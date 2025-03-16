package Polimorfismo;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        ContaComum x = new ContaComum(123, "Makalister", 3000);
        ContaComum y = new ContaEmpresa(124, "Makalister", 3000, 1000);

        x.sacarSaldo(100);
        System.out.println(x);

        y.sacarSaldo(100);
        System.out.println(y);

    }
}
