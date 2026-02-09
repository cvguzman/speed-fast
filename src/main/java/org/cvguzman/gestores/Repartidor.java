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
                break;
            }

            System.out.println("[REPARTIDOR - " + nombre + "] RETIRANDO EL PEDIDO N°" + pedido.getId() + " . . . ");
            pedido.setEstado(EstadoPedido.EN_REPARTO);
            System.out.println("[REPARTIDOR- " + nombre + "] ESTADO: EN REPARTO");

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            System.out.println("REPARTIDOR - " + nombre + "] ENTREGANDO PEDIDO N°" + pedido.getId() + " . . .");
            pedido.setEstado(EstadoPedido.ENTREGADO);
            System.out.println("[REPARTIDOR - " + nombre + "] ESTADO: ENTREGADO");
        }
    }
}

