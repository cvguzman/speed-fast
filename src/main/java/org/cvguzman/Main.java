package org.cvguzman;

import static org.cvguzman.TipoPedido.valueOf;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n=== Validación con sobrecarga ===");

        Pedido pedido1 = new PedidoComida(
                55445,
                "Lo Fontecilla 333,Las Condes",
                TipoPedido.COMIDA
        );

        Pedido pedido2 = new PedidoEncomienda(
                456545,
                "Freire 451, San Bernardo",
                TipoPedido.ENCOMIENDA
        );

        Pedido pedido3 = new PedidoExpress(
                5624,
                "Los Conquistadores 57, Santiago",
                TipoPedido.COMPRA_EXPRESS
        );

        pedido1.asignarRepartidor("Marcelo Aranguiz");
        pedido2.asignarRepartidor("Roberto Cruz");
        pedido3.asignarRepartidor("Lily Sánchez");

    }
}
