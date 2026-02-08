package org.cvguzman.gestores;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ZonaDeCarga {

    private BlockingQueue<Pedido> pedidosPendientes;

    public ZonaDeCarga() {
        this.pedidosPendientes = new LinkedBlockingQueue<>();
    }

    public void agregarPedido(Pedido p) {
        pedidosPendientes.add(p);
        System.out.println("Pedido agregado" + p);
    }

    public Pedido retirarPedido() {
        return pedidosPendientes.poll();
    }
}
