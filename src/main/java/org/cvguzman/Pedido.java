package org.cvguzman;

public abstract class Pedido {
    private int idPedido;
    private String direccionEntrega;
    private String tipoPedido;
    protected int distanciaKm;

    public Pedido(){}

    public Pedido(int idPedido, String direccionEntrega, String tipoPedido, int distanciaKm) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
        this.distanciaKm = distanciaKm;
    }

    public int getIdPedido(){
        return idPedido;
    }

    public String getDireccionEntrega(){
        return direccionEntrega;
    }

    public String getTipoPedido(){
        return tipoPedido;
    }

    public int getDistanciaKm(){
        return distanciaKm;
    }

    public void asignarRepartidor(){
        System.out.println("Un repartidor ha sido asigmado");
    }

    public void asignarRepartidor(String nombreRepartidor){
        System.out.println(
                                  "El número pedido "
                                  + idPedido
                                  + " con dirección de entrega: "
                                  + direccionEntrega
                                  + " clasificado como tipo pedido "
                                  + tipoPedido
                                  + " es asignador al repartidor: "
                                  + nombreRepartidor
                                   );
    }

    public void mostrarResumen() {
        System.out.println("El pedido debe contener su número, dirección, tipo de pedido y nombre repartidor");
    }

    public void mostrarResumen(String nombreRepartidor) {
        System.out.println("Asignación para " + nombreRepartidor);
        System.out.println("Distancia del pedido: " + distanciaKm + " km");
    }

    public abstract int calcularTiempoEntrega();
}



