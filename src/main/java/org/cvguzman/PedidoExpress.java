package org.cvguzman;

public class PedidoExpress extends Pedido {
    public PedidoExpress(int idPedido, String direccionEntrega, TipoPedido tipoPedido) {
        super(idPedido, direccionEntrega, tipoPedido);
    }

    public void asignarRepartidor(String nombreRepartidor){
        super.asignarRepartidor(nombreRepartidor);

        System.out.println(
                "Requerimientos: "
                        + tipoPedido.getTipoPedido()
                        + "\n"
        );
    }
}
