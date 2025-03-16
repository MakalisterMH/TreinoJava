package Polimorfismo.Exercicio2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {

    private Date fabricacao;
    public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public ProdutoUsado() {
        super();
    }

    public ProdutoUsado(String nome, double preco, Date fabricacao) {
        super(nome, preco);
        this.fabricacao = fabricacao;
    }

    public Date getFabricacao() {
        return fabricacao;
    }

    public void setFabricacao(Date fabricacao) {
        this.fabricacao = fabricacao;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + getNome() + '\'' +
                ", preco=" + getPreco() +
                ", fabricacao=" + sdf.format(fabricacao) +
                '}';
    }
}