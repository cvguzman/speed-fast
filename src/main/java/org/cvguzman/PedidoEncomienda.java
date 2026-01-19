package org.cvguzman;

public class PedidoEncomienda extends Pedido {

    public PedidoEncomienda(int idPedido, String direccionPedido, int distanciaKm){
        super(idPedido, direccionPedido, distanciaKm);
    }

    @Override
    public int getDistanciaKm() {
        return super.getDistanciaKm();
    }

    @Override
    public void mostrarResumen(String nombreRepartidor) {
        System.out.println("Pedido número 002 tipo encomienda validando peso y embalaje ha sido asignado a repartidor: " + nombreRepartidor);
    }

    @Override
    public int calcularTiempoEntrega(){
        return (int) Math.round(20 + 1.5 * distanciaKm);
    }
}
