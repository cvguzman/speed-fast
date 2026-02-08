package org.cvguzman.gestores;

public enum EstadoPedido {
    PENDIENTE  ("PENDIENTE"),
    EN_REPARTO ("EN REPARTO"),
    ENTREGADO ("ENTREGADO");

    private String nombreEstado;
        EstadoPedido( String nombreEstado) {
            this.nombreEstado = nombreEstado;
        }

        public String getNombreEstado() {
            return  nombreEstado;
    }

    public void setNombreEstado(EstadoPedido estadoPedido) {
            this.nombreEstado = nombreEstado;
    }
}
