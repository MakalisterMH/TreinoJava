package Metodos;

public class Recursao {
    public static void main(String[] args) {

        int result = sum(5);
        System.out.println("Resultado: \n" + result);

        int result2 = sum2(5, 8);
        System.out.println("Resultado: \n" + result2);

    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    public static int sum2(int start, int end) {
        if (end > start) {
            return end + sum2(start, end - 1);
        } else {
            return end;
        }
    }

}
