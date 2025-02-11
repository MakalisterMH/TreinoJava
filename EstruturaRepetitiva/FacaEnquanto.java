package EstruturaRepetitiva;

import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class FacaEnquanto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String usuario;

        do {
            System.out.println("Digite 2 numero para somar: ");
            int numero1 = sc.nextInt();
            int numero2 = sc.nextInt();

            System.out.println("Soma dos numeros: " + (numero1 + numero2) + "\n");

            System.out.println("Deseja continuar ? s para Sim e n para Não");
            usuario = sc.next();

        } while (usuario.equals("s") || usuario.equals("S"));
            
    }
}
