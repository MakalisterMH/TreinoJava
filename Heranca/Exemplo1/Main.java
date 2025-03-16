package Heranca.Exemplo1;

public class Main {

    public static void main(String[] args) {


        ContaComum contaComum = new ContaComum(123, "Makalister", 3000);
        ContaEmpresa contaEmpresa = new ContaEmpresa(123, "Makalister", 5000, 1000);

        System.out.println("\nConta comum ... super");

        contaComum.depositarSaldo(1000);
        System.out.println("Deposito: " + contaComum.getSaldo());
        contaComum.sacarSaldo(2000);
        System.out.println("Saque: " + contaComum.getSaldo());

        System.out.println("\nConta empresa com metodos Override ...");

        contaEmpresa.depositarSaldo(1000);
        System.out.println("Deposito: " + contaEmpresa.getSaldo());
        contaEmpresa.sacarSaldo(1000);
        System.out.println("Saque: " + contaEmpresa.getSaldo());

    }


}
