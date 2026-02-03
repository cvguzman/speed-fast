package org.cvguzman.gestores;

import java.util.List;

public class Repartidor extends Thread implements Runnable {
    private String nombreRepartidor;
    private List<Pedido> pedidosAsignados;

    public Repartidor() {
    }

    public Repartidor(String nombreRepartidor, List<Pedido> pedidosAsignados) {
        this.nombreRepartidor = nombreRepartidor;
        this.pedidosAsignados = pedidosAsignados;
    }

    @Override
    public void run() {
        System.out.println("Repartidor " + nombreRepartidor + " inicia entregas");

        for (Pedido pedido : pedidosAsignados) {
            pedido.mostrarResumen();
            pedido.despachar();

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
