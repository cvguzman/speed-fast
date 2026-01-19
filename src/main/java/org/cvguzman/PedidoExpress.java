package org.cvguzman;

public class PedidoExpress extends Pedido {

    public PedidoExpress(int distanciaKm) {
        super(distanciaKm);
    }

    @Override
    public void mostrarResumen(String nombreRepartidor) {
        System.out.println("Pedido número 003 tipo express con disponibilidad inmediata y más cercano ha sido asignado a repartidor: " + nombreRepartidor);
    }

    @Override
    protected int calcularTiempoEntrega() {
        int tiempo = 10;
        if (getDistanciaKm() > 5) {
            tiempo += 5;
        }
        return tiempo;
    }
}


