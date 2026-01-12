package org.cvguzman;

public class PedidoComida extends Pedido {

    public PedidoComida(int idPedido, String direccionEntrega, TipoPedido tipoPedido) {
        super(idPedido, direccionEntrega, tipoPedido);
    }

    public void asignarRepartidor(String nombreRepartidor) {
        super.asignarRepartidor(nombreRepartidor);

        System.out.println(
                "Requerimientos: "
                        + tipoPedido.getTipoPedido()
                        + "\n"
        );
    }
}
