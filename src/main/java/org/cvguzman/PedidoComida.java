package org.cvguzman;

public class PedidoComida extends Pedido {

    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Repartidor asignado para comida con mochila térmica " + nombreRepartidor);
    }
}
