package org.cvguzman;

public class Pedido {
    private final int idPedido;
    private final String direccionEntrega;
    final TipoPedido tipoPedido;


    public Pedido(int idPedido, String direccionEntrega, TipoPedido tipoPedido){
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
    }

    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println(
                "Un repartidor ha sido asignado para un pedido de tipo: "
                        + tipoPedido.toString() + ".\n"
                        + "Repartidor: " + nombreRepartidor
        );
    }
}



