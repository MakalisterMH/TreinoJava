package POO.Aluno;

public class Aluno {

    public String nome;
    double nota1, nota2, nota3;

    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double mediaAluno() {

        if (nota1 > 0 && nota1 <= 30 && nota2 > 0 && nota2 <= 35 && nota3 > 0 && nota3 <= 35) {
            return nota1 + nota2 + nota3;
        }

        else {
            return -1;
        }

    }

    public double notaFaltante() {

        if (mediaAluno() >= 0) {
            return 60 - mediaAluno();
        } else {
            return 0;
        }

    }
}
