package org.cvguzman.gestores;

import org.cvguzman.subclases.PedidoComida;
import org.cvguzman.subclases.PedidoEncomienda;
import org.cvguzman.subclases.PedidoExpress;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println(" ");

        System.out.println(":::::::PRUEBA POLIMORFISMO ---> SOBRESCRITURA::::::");
        System.out.println(" ");

        Pedido[] pedidos = {new PedidoComida(), new PedidoEncomienda(), new PedidoExpress() {
            @Override
            public void despachar() {

            }
        }};

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


        System.out.println(" ");
        System.out.println("::::::HILOS::::::");

        Pedido p1 = new PedidoComida(1, "Av Central 3", "Comida", 6);
        Pedido p2 = new PedidoExpress(2, "Av Suecia 23", "Express", 4);

        Pedido p3 = new PedidoEncomienda(5, "Torre 33", " Encomienda", 6);
        Pedido p4 = new PedidoComida(8, "Las Tacas 22", "Comida", 5);

        Pedido p5 = new PedidoExpress(10, "Los nidos 43", "Express", 3);
        Pedido p6 = new PedidoExpress(12, "Los cilos 3", "Express", 3);


        Repartidor r1 = new Repartidor("Carlos", List.of (p1,p2) );
        Repartidor r2 = new Repartidor( "Luis", List.of(p3, p4));
        Repartidor r3 = new Repartidor( "Mauricio", List.of(p5, p6));

        r1.start();
        r2.start();
        r3.start();

        }
    }

