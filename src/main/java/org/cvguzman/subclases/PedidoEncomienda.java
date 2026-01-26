package org.cvguzman.subclases;

import org.cvguzman.gestores.Pedido;

import java.util.List;

public class PedidoEncomienda extends Pedido {

    public PedidoEncomienda(){}

    public PedidoEncomienda(int idPedido, String direccionPedido, String tipoPedido, int distanciaKm){
        super(idPedido, direccionPedido, tipoPedido, distanciaKm);
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
                "El pedido número "
                        + getIdPedido()
                        + " con dirección de entrega: "
                        + getDireccionEntrega()
                        + "Ha clasificado como tipo pedido: "
                        + getTipoPedido() + "Asignado al repartidor: "
                        + nombreRepartidor);
    }

    public int calcularTiempoEntrega(){
        return (int) Math.round(20 + 1.5 * distanciaKm);
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
