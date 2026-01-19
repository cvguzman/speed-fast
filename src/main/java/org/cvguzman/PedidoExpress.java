package org.cvguzman;

public class PedidoExpress extends Pedido {
    @Override
    public void asignarRepartidor(String nombreRepartidor){
        System.out.println("Repartidor ha sido asignado para pedido express con disponibilidad inmediata y mas cercano " + nombreRepartidor);
    }
}
