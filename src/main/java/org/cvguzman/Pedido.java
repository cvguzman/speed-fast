package org.cvguzman;

public abstract class Pedido {
    private int idPedido;
    private String direccionEntrega;
    private int distanciaKm;

    public Pedido(int idPedido) {
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
    }

    protected int calcularTiempoEntrega(){
        System.out.println("Tiempo estimado de entrega");
        return 0;
    }
}



