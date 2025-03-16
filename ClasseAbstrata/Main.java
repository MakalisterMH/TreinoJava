package ClasseAbstrata;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //ContaComum contaComum = new ContaComum();      Como a classe pai "ContaComum é abstrata... ela n pode ser instanciada... apenas herdada"

        ContaComum contaEmpresa = new ContaEmpresa(123, "Makalister", 5000, 1000);
        ContaComum contaPoupanca = new ContaPoupanca(321, "Makalister", 1000, 500);

        System.out.println(contaEmpresa);
        System.out.println(contaPoupanca);

        List<ContaComum> listaContaComums = new ArrayList<>();

        listaContaComums.add(contaEmpresa);
        listaContaComums.add(contaPoupanca);

        System.out.println("\nSomar o saldo de todas as contas");

        double somaTotal = 0;
        for (ContaComum listaContaComum : listaContaComums) {
            somaTotal += listaContaComum.getSaldo();
        }
        System.out.println("Soma de tudo: " + somaTotal);

        System.out.println("\nDepositar 10 em todas as contas");

        for (ContaComum listaContaComum : listaContaComums) {
            listaContaComum.depositarSaldo(10);
            System.out.println("Saldo: " + listaContaComum);
        }

    }
}
