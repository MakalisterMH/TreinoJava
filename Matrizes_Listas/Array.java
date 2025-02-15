package Matrizes;

public class Array {
    public static void main(String[] args) {

        String[] nomes = { "Makalister", "Vitoria", "Amanda" };  // Declaração de array ja passando valores ...

        for (String nomesNoArray : nomes) {
            System.out.println(nomesNoArray);    // Impressao com for each ... 
        }

        for (int i = 0; i < nomes.length; i++){     // Impressao com for através do indice do numero
            System.out.println(nomes[i]);
        }


        // ===============================================================================================================================

        int[] numeros = new int[4];   // Declaração de array passando apenas tamanho do mesmo ...

        numeros[0] = 1;
        numeros[1] = 3;
        numeros[2] = 5;
        numeros[3] = 8;

        for (int numerosArray : numeros) {
            System.out.println(numerosArray);     // Impressao com for each ... 
        }

        for (int i = 0; i < numeros.length; i++){      // Impressao com for através do indice do numero
            System.out.println(numeros[i]);
        }


        /*
         * Tamanho fixo: Você define o número de elementos quando cria o array e esse tamanho não muda durante a execução do programa
         * Indexado: Cada elemento no array pode ser acessado através de um índice. O índice começa do 0
         * Tipo homogêneo: Todos os elementos no array têm que ser do mesmo tipo
         */

    }
}
