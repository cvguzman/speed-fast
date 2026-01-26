package org.cvguzman.gestores;

import org.cvguzman.interfaces.Rastreable;
import org.cvguzman.subclases.PedidoComida;
import org.cvguzman.subclases.PedidoEncomienda;
import org.cvguzman.subclases.PedidoExpress;

public class Main {
    public static void main(String[] args) {

        System.out.println(" ");

        System.out.println(":::::::PRUEBA POLIMORFISMO ---> SOBRESCRITURA::::::");
        System.out.println(" ");

        Pedido[] pedidos = {new PedidoComida(), new PedidoEncomienda(), new PedidoExpress()};

        for (Pedido p : pedidos) {
            p.asignarRepartidor();
        }

        System.out.println(" ");

        System.out.println("::::::PRUEBA INTERFACES::::::");
        System.out.println(" ");

        PedidoComida repartidor = new PedidoComida(
                1,
                "Avenida Suecia 15, Providencia \n",
                "Comida \n",
                15);
        repartidor.mostrarResumen("Mauricio Pérez");
        System.out.println(repartidor.cancelar("Se ha cancelado Pedido Comida por no tener menú disponible"));
        repartidor.despachar("Se ha despachado Pedido de Comida correctamente a destino");


        System.out.println(" ");
        PedidoEncomienda repartidor2 = new PedidoEncomienda(
                2,
                "Tajamar 75, Providencia \n",
                "Encomienda \n",
                6);
        repartidor2.mostrarResumen("Soraya Marín");
        System.out.println(repartidor2.despachar("Se ha despachado Pedido Encomienda correctamente"));
        System.out.println("Distancia en km: " + repartidor2.getDistanciaKm());
        System.out.println("Tiempo de entrega estimado en minutos: " + repartidor2.calcularTiempoEntrega());


        System.out.println(" ");
        PedidoExpress repartidor3 = new PedidoExpress(
                3,
                "Av Tobalaba 4556, Las Condes \n",
                "Express \n",
                17);

        System.out.println("El pedido número " + repartidor3.getIdPedido());
        System.out.println(repartidor3.cancelar("Se ha cancelado Pedido Express por no haber repartidor cerca y con disponibilidad inmediata"));

        PedidoComida pedido = new PedidoComida();

        for (String evento : pedido.verHistorial()) {
            System.out.println((evento));
        }
    }
}

