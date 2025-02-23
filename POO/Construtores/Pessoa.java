package POO.Construtores;

public class Pessoa {

    String nome;
    String email;
    int idade;
    double altura;
    char sexo;
    boolean brasileiro;

    // Construtor padrao ...
    public Pessoa() {
    }

    // Construtor com todos os atributos como parametro ...
    public Pessoa(String nome, String email, int idade, double altura, char sexo, boolean brasileiro) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.altura = altura;
        this.sexo = sexo;
        this.brasileiro = brasileiro;
    }

    // Sobrecarga de construtor com alguns atributos  ...
    public Pessoa(String nome, String email, int idade, double altura) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.altura = altura;
    }

    // Sobrecarga de construtor com alguns atributos  ...
    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String toString(){
        return "nome: "+ nome + ", email: " + email + ", idade: " + idade + ", altura: " + altura + ", sexo: " + sexo + ", brasileiro: "+ brasileiro;
    }


}
