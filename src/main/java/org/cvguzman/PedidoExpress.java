package org.cvguzman;

public class PedidoExpress extends Pedido {

    public PedidoExpress(){}

    public PedidoExpress(int idPedido, String direccionEntrega, String tipoPedido, int distanciaKm) {
        super(idPedido, direccionEntrega, tipoPedido, distanciaKm);
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
    public int calcularTiempoEntrega() {
        int tiempo = 10;
        if (getDistanciaKm() > 5) {
            tiempo += 5;
        }
        return tiempo;
    }
}


