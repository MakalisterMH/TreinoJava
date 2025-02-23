package POO.Construtores;

public class main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("Makalister","makalisterhonorato@gmail.com",25,1.85,'m',true);

        System.out.println(pessoa1);

        Pessoa pessoa2 = new Pessoa("Makalister","makalisterhonorato@gmail.com",25,1.85);

        System.out.println(pessoa2);

        Pessoa pessoa3 = new Pessoa("Makalister","makalisterhonorato@gmail.com");

        System.out.println(pessoa3);

    }
}

