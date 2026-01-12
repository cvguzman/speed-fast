package org.cvguzman;

public class PedidoEncomienda extends Pedido {

    public PedidoEncomienda(int idPedido, String direccionEntrega, TipoPedido tipoPedido) {
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
