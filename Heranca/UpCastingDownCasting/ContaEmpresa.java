package Heranca.UpCastingDownCasting;

public class ContaEmpresa extends ContaComum {

    private double limiteSaque;

    public ContaEmpresa(int numero, String titular, double saldo, double limiteSaque) {
        super(numero, titular, saldo);
        this.limiteSaque = limiteSaque;
    }

    @Override
    public void sacarSaldo(double valor) {
        if (getSaldo() >= valor && valor <= limiteSaque) {
            super.sacarSaldo(valor - 1); // - 1 é só pra ver o metodo ser sobrescrito
            // Obs super para o java n confundir com recursao
        } else {
            System.out.println("ERRO ! lImite de 1000 por saque");
        }
    }

    @Override
    public void depositarSaldo(double valor) {
        super.depositarSaldo(valor + 10); // + 10 é só pra ver o metodo ser sobrescrito
        // Obs super para o java n confundir com recursao
    }
}
