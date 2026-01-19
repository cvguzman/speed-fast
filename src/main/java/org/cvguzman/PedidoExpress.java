package org.cvguzman;

public class PedidoExpress extends Pedido {

    public PedidoExpress(int idPedido, String direccionEntrega, int distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    @Override
    public int getDistanciaKm() {
        return super.getDistanciaKm();
    }

    @Override
    public void mostrarResumen(String nombreRepartidor) {
        System.out.println("Pedido número 003 tipo express con disponibilidad inmediata y más cercano ha sido asignado a repartidor: " + nombreRepartidor);
    }

    @Override
    public int calcularTiempoEntrega() {
        int tiempo = 10;
        if (getDistanciaKm() > 5) {
            tiempo += 5;
        }
        return tiempo;
    }
}


