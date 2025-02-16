package Metodos;

public class SobreCargaMetodos {
    public static void main(String[] args) {

        System.out.println(somarNumeros(2, 3));

        System.out.println(somarNumeros(3, 4, 5, 8));

    }

    // Sobre carga de metodos ... metodo com o mesmo nome porem com parametros
    // diferentes ...

    public static int somarNumeros(int numero1, int numero2, int numero3, int numero4) {
        return numero1 + numero2 + numero3 + numero4;
    }

    public static int somarNumeros(int numero1, int numero2) {
        return numero1 + numero2;
    }

}
