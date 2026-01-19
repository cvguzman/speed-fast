package org.cvguzman;

public class PedidoComida extends Pedido {

    public PedidoComida(int distanciaKm){
        super(distanciaKm);
    }

    @Override
    public void mostrarResumen(String nombreRepartidor) {
        System.out.println("Pedido número 001 tipo comida con mochila térmica  ha siido asignado al repartidor: " + nombreRepartidor);
    }

    @Override
    protected int calcularTiempoEntrega(){
        return (int) (15 + 2 * getDistanciaKm());
    }
}
