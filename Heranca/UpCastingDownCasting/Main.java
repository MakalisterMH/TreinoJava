package Heranca.UpCastingDownCasting;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        ContaComum contaComum = new ContaComum(123, "Makalister", 3000);
        ContaEmpresa contaEmpresa = new ContaEmpresa(123, "Makalister", 5000, 1000);
        ContaPoupanca contaPoupanca = new ContaPoupanca(321, "Makalister", 1000, 500);


        // UpCasting
        ContaComum contaComum2 = contaEmpresa;
        ContaComum contaComum3 = contaPoupanca;
        //ou
        ContaComum contaComum4 = new ContaEmpresa(451, "Vitoria", 9000, 800);

        System.out.println("UpCasting\n");

        System.out.println("Conta comum 2 recebendo conta empresa");
        System.out.println(contaComum2);

        System.out.println("Conta comum 3 recebendo conta poupança");
        System.out.println(contaComum3);

        System.out.println("Conta comum 4 recebendo conta empresa ja na instancia");
        System.out.println(contaComum4);

        System.out.println("\n\nDownCasting\n\n");


        ContaEmpresa contaEmpresa1 = (ContaEmpresa) contaComum4;

        System.out.println("Conta empresa Recebendo conta comum ... porem com Casting");
        System.out.println(contaEmpresa1);

        /*  ERRO POR CONTA EMPRESA N SER UMA CONTA POUPANÇA
        ContaEmpresa contaEmpresa2 = (ContaEmpresa)contaComum3;
        System.out.println("Conta empresa Recebendo conta poupança ... porem com Casting");
        System.out.println(contaEmpresa2);
         */

        ContaEmpresa c1;

        if (contaComum2 instanceof ContaPoupanca) {
            c1 = contaEmpresa1;
            System.out.println("c1: " + c1);
        } else {
            System.out.println("Não é instancia de Conta Empresa");
        }


        System.out.println("\n\nTESTE INSTANCEOF:");

        ContaComum testeContaComum = new ContaEmpresa(548, "TESTE1", 1000, 400);

        ContaComum testeContaComum2 = new ContaComum(548, "TESTE2", 1000);


        if (testeContaComum2 instanceof ContaEmpresa) {
            ContaEmpresa testeContaEmpresa = (ContaEmpresa) testeContaComum2;
            System.out.println("InstanceOf contaComum2 instancia de conta empresa !" + testeContaEmpresa);
        } else {
            System.out.println("InstanceOf contaComum2 não é instancia de conta empresa !");
        }


    }
}
