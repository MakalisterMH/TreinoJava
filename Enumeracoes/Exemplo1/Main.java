package Enumeracoes.Exemplo1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido(303, new Date(), PedidoStatus.PAGAMENTO_PENDENTE);

        System.out.println(pedido);

        PedidoStatus pedidoStatus1 = PedidoStatus.PROCESSANDO;  // Instancia do Obj PedidoStatus instanciando com o valor Procesando ...

        PedidoStatus pedidoStatus2 = PedidoStatus.valueOf("ENVIADO");  // Instancia do Obj PedidoStatus passando o valor Enviado ...

        System.out.println(pedidoStatus1);
        System.out.println(pedidoStatus2);
    }
}
