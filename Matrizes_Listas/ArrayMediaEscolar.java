package Matrizes_Listas;

public class ArrayMediaEscolar {
    public static void main(String[] args) {

        double[] notas = { 7, 9.3, 6.5, 8.7 };

        double somaTotalForEach = 0;
        double somaTotalFor = 0;

        for (double arrayDeNotas : notas) {
            somaTotalForEach += arrayDeNotas;
        }

        System.out.println("Média final = " + somaTotalForEach / notas.length);

        // ou usando for

        for (int i = 0; i < notas.length; i++) {
            somaTotalFor += notas[i];
        }

        System.out.println("Média final = " + somaTotalFor / notas.length);
    }
}
