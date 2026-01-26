package org.cvguzman.subclases;

import org.cvguzman.gestores.Pedido;

public class PedidoEncomienda extends Pedido {

    public PedidoEncomienda(){}

    public PedidoEncomienda(int idPedido, String direccionPedido, String tipoPedido, int distanciaKm){
        super(idPedido, direccionPedido, tipoPedido, distanciaKm);
    }

    @Override
    public int getIdPedido(){
        return super.getIdPedido();
    }

    @Override
    public String getDireccionEntrega(){
        return super.getDireccionEntrega();
    }

    @Override
    public String getTipoPedido(){
        return super.getTipoPedido();
    }

    @Override
    public int getDistanciaKm() {
        return super.getDistanciaKm();
    }

    @Override
    public void asignarRepartidor(String nombreRepartidor){
        System.out.println("El pedido asignado al repartidor: " + nombreRepartidor);
    }

    @Override
    public void mostrarResumen(String nombreRepartidor) {
        System.out.println(
                "El número pedido "
                        + getIdPedido()
                        + " con dirección de entrega: "
                        + getDireccionEntrega()
                        + " ha clasificado como tipo pedido: "
                        + getTipoPedido() + " asignado al repartidor: "
                        + nombreRepartidor);
    }

    @Override
    public int calcularTiempoEntrega(){
        return (int) Math.round(20 + 1.5 * distanciaKm);
    }
}
