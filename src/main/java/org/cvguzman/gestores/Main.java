package org.cvguzman.gestores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        System.out.println(" ");

        ZonaDeCarga zonaDeCarga = new ZonaDeCarga();

      zonaDeCarga.agregarPedido(new Pedido(1,"Santiago Centro"));
      zonaDeCarga.agregarPedido(new Pedido(2, "La Florida"));
      zonaDeCarga.agregarPedido(new Pedido(3, "La Dehesa"));
      zonaDeCarga.agregarPedido(new Pedido(4, "Lo Espejo"));
      zonaDeCarga.agregarPedido(new Pedido(5, "Las Condes"));

      Thread r1 = new Thread(new Repartidor("Repartidor Marcelo", zonaDeCarga));
      Thread r2 = new Thread(new Repartidor("Repartidor Luis", zonaDeCarga));
      Thread r3 = new Thread(new Repartidor("Repartidor Gerardo", zonaDeCarga));

      try {
          r1.start();
          r1.join();

          r2.start();
          r2.join();

          r3.start();
          r3.join();
      } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
      }

        System.out.println(" ");
        System.out.println("Los pedidos han sido repartidos correctamente");
        System.out.println(" ");


        ExecutorService executorService = Executors.newFixedThreadPool(3);

        System.out.println(" ");

        executorService.execute(new Repartidor("Repartidor Marcelo", zonaDeCarga));
        executorService.execute(new Repartidor("Repartidor Luis", zonaDeCarga));
        executorService.execute(new Repartidor("Repartidor Gerardo", zonaDeCarga));

        executorService.shutdown();

        try {
            executorService.awaitTermination(1, TimeUnit.MINUTES);
        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println(" ");
        System.out.println("Los pedidos han sido repartidos correctamente");
    }
}

