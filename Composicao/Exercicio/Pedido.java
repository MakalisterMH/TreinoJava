package Composicao.Exercicio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

    private Date momento;
    private Status status;


    //Composição

    Cliente cliente = new Cliente();
    private List<PedidoItem> pedidoItems = new ArrayList<>();

    public Pedido() {
    }

    public Pedido(Date momento, Status status, Cliente cliente) {
        this.momento = momento;
        this.status = status;
        this.cliente = cliente;
    }

    public double Total() {
        double total = 0;
        for (PedidoItem pedidoItem : pedidoItems) {
            total += pedidoItem.subTotal();
        }
        return total;
    }

    public void adicionarItem(PedidoItem pedidoItem) {
        pedidoItems.add(pedidoItem);
    }

    public void removerItem(PedidoItem pedidoItem) {
        pedidoItems.remove(pedidoItem);
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<PedidoItem> getPedidoItems() {
        return pedidoItems;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Detalhes do Pedido: \n");
        sb.append("Momento: ").append(momento).append("\n");
        sb.append("Status: ").append(status).append("\n");
        sb.append("Cliente: ").append(cliente).append("\n");
        sb.append("Itens: \n");

        for (PedidoItem item : pedidoItems) {
            sb.append(item.toString()).append("\n");
        }

        sb.append("Total: ").append(Total()).append("\n");

        return sb.toString();
    }

}
