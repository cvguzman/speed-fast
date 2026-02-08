package org.cvguzman.gestores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        ZonaDeCarga zonaDeCarga = new ZonaDeCarga();

        for (int i = 1; i <= 5; i++) {
            zonaDeCarga.agregarPedido(
                    new Pedido(i, "Las Torres 15, Peñalolen", 1)
            );
        }

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.execute(new Repartidor("Repartidor Marcelo", zonaDeCarga));
        executorService.execute(new Repartidor("Repartidor Luis", zonaDeCarga));
        executorService.execute(new Repartidor("Repartidor Gerardo", zonaDeCarga));

        executorService.shutdown();

        try {
            executorService.awaitTermination(1, TimeUnit.MINUTES);
        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Los pedidos han sido repartidos correctamente");
    }
}

