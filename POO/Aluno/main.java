package POO.Aluno;

public class main {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Makalister", 30, 35, 35);

        double media = a1.mediaAluno();

        if (media >= 60) {
            System.out.println("Média do aluno é: " + media);
            System.out.println("Parabéns Aprovado !");
        } 
        
        else if (media > 0 && media < 60) {
            System.out.println("REPROVADO ! \nNota faltante: " + a1.notaFaltante());
        }

        else if (media == -1) {
            System.out.println("Alguma das notas está invalida ! \n n1 0 a 30 \n n2 0 a 35 \n n3 0 a 35");
        }

    }
}
