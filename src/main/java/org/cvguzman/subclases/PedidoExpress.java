package org.cvguzman.subclases;

import org.cvguzman.gestores.Pedido;

import java.util.List;

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

    public String mostrarResumen() {
        mostrarResumen(null);
        return null;
    }

    @Override
    public void mostrarResumen(String nombreRepartidor) {
        System.out.println(
                "El pedido "
                        + getIdPedido()
                        + " con dirección de entrega: "
                        + getDireccionEntrega()
                        + "Ha clasificado como tipo pedido: "
                        + getTipoPedido());
    }

    public int calcularTiempoEntrega() {
        int tiempo = 10;
        if (getDistanciaKm() > 5) {
            tiempo += 5;
        }
        return tiempo;
    }

    @Override
    public String cancelar(String motivoCancelacion) {
        return motivoCancelacion;
    }

    @Override
    public String despachar(String modoDespacho) {
        return modoDespacho;
    }

    @Override
    public List<String> verHistorial() {
        return List.of();
    }
}


