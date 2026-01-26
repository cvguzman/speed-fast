package org.cvguzman.gestores;

import org.cvguzman.interfaces.Cancelable;
import org.cvguzman.interfaces.Despachable;
import org.cvguzman.interfaces.Rastreable;

import java.util.ArrayList;
import java.util.List;

public abstract class Pedido implements Cancelable, Despachable, Rastreable {
    private int idPedido;
    private String direccionEntrega;
    private String tipoPedido;
    protected int distanciaKm;

    private List<String> historial = new ArrayList<>();

    @Override
    public String cancelar(String motivoCancelacion) {
        String evento = "Pedido cancelado: " + motivoCancelacion;
        historial.add(evento);
        return evento;
    }

   @Override
   public String despachar(String modoDespacho) {
        String evento = "Pedido despachado: " + modoDespacho;
        historial.add(evento);
        return evento;
   }

   @Override
    public List<String> verHistorial() {
        return historial;
    }

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

    public String mostrarResumen() {
        System.out.println("El pedido debe contener su número, dirección, tipo de pedido y nombre repartidor");
        return null;
    }

    public void mostrarResumen(String nombreRepartidor){
        System.out.println(
                "El número pedido "
                        + getIdPedido()
                        + " con dirección de entrega: "
                        + getDireccionEntrega()
                        + " ha clasificado como tipo pedido: "
                        + getTipoPedido() + " asignado al repartidor: "
                        + nombreRepartidor);
    }

    public abstract int calcularTiempoEntrega();
}



