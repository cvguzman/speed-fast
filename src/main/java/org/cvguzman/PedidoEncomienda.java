package org.cvguzman;

public class PedidoEncomienda extends Pedido {
    @Override
    public void asignarRepartidor(String nombreRepartidor) {
        System.out.println("Repartidor asignado para encomienda validando peso y embalaje " + nombreRepartidor);
    }
}
