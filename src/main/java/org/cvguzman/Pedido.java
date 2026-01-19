package org.cvguzman;

public abstract class Pedido {
    private int idPedido;
    private String direccionEntrega;
    protected int distanciaKm;

    public Pedido(int idPedido, String direccionEntrega, int distanciaKm) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKm = distanciaKm;
    }

    public int getDistanciaKm(){
        return distanciaKm;
    }

    public void mostrarResumen() {
        System.out.println("Un repartidor ha sido asignado");
    }

    public void mostrarResumen(String nombreRepartidor) {
        System.out.println("Asignación para " + nombreRepartidor);
        System.out.println("Distancia del pedido: " + distanciaKm + " km");
    }

    public abstract int calcularTiempoEntrega();
}



