package org.cvguzman;

public class PedidoEncomienda extends Pedido {

    public PedidoEncomienda(int distanciaKm){
        super(distanciaKm);
    }

    @Override
    public void mostrarResumen(String nombreRepartidor) {
        System.out.println("Pedido número 002 tipo encomienda validando peso y embalaje ha sido asignado a repartidor: " + nombreRepartidor);
    }

    @Override
    protected int calcularTiempoEntrega(){
        return (int) Math.round(20 + 1.5 * getDistanciaKm());
    }
}
