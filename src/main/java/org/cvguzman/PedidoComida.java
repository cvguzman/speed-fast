package org.cvguzman;

public class PedidoComida extends Pedido {

    public PedidoComida(int idPedido, String direccionEntrega, int distanciaKm){
        super(idPedido, direccionEntrega,distanciaKm);
    }

    @Override
    public int getDistanciaKm() {
        return super.getDistanciaKm();
    }

    @Override
    public void mostrarResumen(String nombreRepartidor) {
        System.out.println("Pedido número 001 tipo comida con mochila térmica  ha sido asignado al repartidor: " + nombreRepartidor);
    }

    @Override
    public int calcularTiempoEntrega(){
        return 15 + 2 * distanciaKm;
    }
}
