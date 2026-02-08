package org.cvguzman.gestores;

public class Pedido {
    private int id;
    private String direccionEntrega;
    private EstadoPedido estado;


    public Pedido(int id, String direccionEntrega, int i) {};

    public Pedido(int id, String direccionEntrega, EstadoPedido estadoPedido) {
        this.id = id;
        this.direccionEntrega = direccionEntrega;
        this.estado = EstadoPedido.PENDIENTE;
    }

    public int getId() {
        return id;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public EstadoPedido getEstadoPedido() {
        return estado;
    }

    public void setId() {
        this.id = id;
    }

    public void setDireccionEntrega() {
        this.direccionEntrega = direccionEntrega;
    }

    public void setEstadoPedido() {
        this.estado = estado;
    }

    @Override
    public String toString(){
        return  "Pedido{" +
                        "id=" + id +
                        ", direccionEntrega' " + direccionEntrega + " \'" +
                        ", estadoPedido=" + estado +
                        '}';
    }

    public void setEstado(EstadoPedido nuevoEstado) {
        this.estado = estado;
    }
}



