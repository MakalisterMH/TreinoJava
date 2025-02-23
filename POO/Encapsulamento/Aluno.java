package POO.Encapsulamento;

public class Aluno {

    private String nome;
    private String email;
    private String curso;
    private String endereco;
    private long telefone;
    private int matricula;


    public Aluno(String nome, String email, String curso, String endereco, long telefone, int matricula) {
        this.nome = nome;
        this.email = email;
        this.curso = curso;
        this.endereco = endereco;
        this.telefone = telefone;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String toString() {
        return "nome='" + nome + '\'' + ", email='" + email + '\'' + ", curso='" + curso + '\'' + ", endereco='" + endereco +
                '\'' + ", telefone=" + telefone + ", matricula=" + matricula;
    }
}
