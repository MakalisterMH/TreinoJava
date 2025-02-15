package FuncoesString;


public class Split {

    public static void main(String[] args) {

        String Frutas = "Maçã Uva Maracujá Banana Laranja Abacaxi Morango Pêssego Kiwi Ameixa";

        String[] ListaFrutas = Frutas.split(" ");

        for (String f : ListaFrutas) {
            System.out.println(f);
        }

    }
}
