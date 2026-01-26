package org.cvguzman.subclases;

import org.cvguzman.gestores.Pedido;

import java.util.List;

public class PedidoComida extends Pedido {

    public PedidoComida(){}

    public PedidoComida(int idPedido, String direccionEntrega, String tipoPedido, int distanciaKm){
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
                "El pedido número "
                        + getIdPedido()
                        + " con dirección de entrega: "
                        + getDireccionEntrega()
                        + "Ha clasificado como tipo pedido: "
                        + getTipoPedido() + "Asignado al repartidor: "
                        + nombreRepartidor);
    }

    public int calcularTiempoEntrega(){
        return 15 + 2 * distanciaKm;
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
