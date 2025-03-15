package Composicao.Exemplo2;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Post post1 = new Post(new Date(), "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);

        Comentario comentario1 = new Comentario("Have a nice trip");
        post1.adicionarComentario(comentario1);
        Comentario comentario2 = new Comentario("Wow that's awesome");
        post1.adicionarComentario(comentario2);


        Post post2 = new Post(new Date(), "Good night guys", "See you yomorrow", 5);

        Comentario comentario3 = new Comentario("Good night");
        post2.adicionarComentario(comentario1);
        Comentario comentario4 = new Comentario("May the Force be with you");
        post2.adicionarComentario(comentario2);


        System.out.println(post1);
        System.out.println("----------------------");
        System.out.println(post2);
    }
}
