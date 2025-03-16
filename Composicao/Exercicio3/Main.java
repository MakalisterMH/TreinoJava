package Composicao.Exercicio3;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Makalister", "70383200182");
        Veiculo veiculo1 = new Veiculo("C3", "citroen", 2023, CategoriaVeiculo.ECONOMICO, 110);
        Veiculo veiculo2 = new Veiculo("VOYAGE", "VW", 2025, CategoriaVeiculo.SEDAN, 150);
        Veiculo veiculo3 = new Veiculo("HRV", "HONDA", 2018, CategoriaVeiculo.SUV, 230);

        Locacao locacao1 = new Locacao(5, cliente1, veiculo1);
        Locacao locacao2 = new Locacao(5, cliente1, veiculo2);
        Locacao locacao3 = new Locacao(5, cliente1, veiculo3);

        cliente1.adicionarLocacao(locacao1);
        cliente1.adicionarLocacao(locacao2);
        cliente1.adicionarLocacao(locacao3);


        System.out.println(cliente1.listarLocacoes());
        System.out.println("TOTAL GERAL: " + cliente1.calcularTotalGasto());

    }
}
