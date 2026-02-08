package org.cvguzman.gestores;

public class Repartidor implements Runnable {

    private String nombre;
    private ZonaDeCarga zonaDeCarga;

    public Repartidor(String nombre, ZonaDeCarga zonaDeCarga) {
        this.nombre = nombre;
        this.zonaDeCarga = zonaDeCarga;
    }

    @Override
    public void run() {
        while (true) {

            Pedido pedido = zonaDeCarga.retirarPedido();

            if (pedido == null) {
                break; // no hay más pedidos
            }

            pedido.setEstado(EstadoPedido.valueOf(String.valueOf(EstadoPedido.EN_REPARTO)));
            System.out.println(nombre + " se encuentra en reparto con el pedido " + pedido.getId());

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            pedido.setEstado(EstadoPedido.ENTREGADO);
            System.out.println(nombre + " ya entregó el pedido " + pedido.getId());
        }
    }
}

