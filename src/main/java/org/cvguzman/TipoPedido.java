package org.cvguzman;

public enum TipoPedido {
    COMIDA("Requiere repartidor con mochila térmica"),
    ENCOMIENDA("Requiere validación de peso y embalaje"),
    COMPRA_EXPRESS("Requiere al repartidor más cercano con disponibilidad inmediata");

    private final String tipoPedido;
    TipoPedido(String tipoPedido){
        this.tipoPedido = tipoPedido;
    }

    public String getTipoPedido(){
        return tipoPedido;
    }
}


