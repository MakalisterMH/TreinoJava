package Composicao.Exemplo2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

    private Date momento;
    private String titulo;
    private String content;
    private int likes;

    // Composição
    private List<Comentario> comentarios = new ArrayList<>();

    public Post(Date momento, String titulo, String content, int likes) {
        this.momento = momento;
        this.titulo = titulo;
        this.content = content;
        this.likes = likes;
    }

    public void adicionarComentario(Comentario comentario) {
        comentarios.add(comentario);
    }

    public void removerComentario(Comentario comentario) {
        comentarios.remove(comentario);
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Titulo: " + titulo + " \n");
        sb.append("Contents: " + content + " \n");
        sb.append("Likes: " + likes + " \n");
        for (Comentario comentario : comentarios) {
            sb.append("Comentario: " + comentario + "\n");
        }
        return sb.toString();

    }


}
