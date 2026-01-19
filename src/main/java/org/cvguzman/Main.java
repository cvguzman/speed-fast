package org.cvguzman;

public class Main {
    public static void main(String[] args) {

        System.out.println(" ");

        System.out.println(":::::::PRUEBA POLIMORFISMO ---> SOBRESCRITURA::::::");
        System.out.println(" ");

        Pedido[] pedidos = {
                new PedidoComida(001,"Avenida Suecia 15, Providencia", 15),
                new PedidoEncomienda(002,"Tajamar 75, Providencia",6),
                new PedidoExpress(003,"Av Tobalaba 4556, Las Condes",17),
        };

        for (Pedido p : pedidos) {
            p.mostrarResumen();
        }

        System.out.println(" ");

        System.out.println("::::::PRUEBA SOBRECARGA  ---->  TEMPLATE METHOD::::::");
        System.out.println(" ");

        PedidoComida repartidor = new PedidoComida(001,"Avenida Suecia 15, Providencia",15);
        repartidor.mostrarResumen("Mauricio Pérez");
        System.out.println("Distancia: " + repartidor.getDistanciaKm());
        System.out.println("Tiempo de entrega estimado en minutos: "  + repartidor.calcularTiempoEntrega());

        System.out.println(" ");
        PedidoEncomienda repartidor2 = new PedidoEncomienda(002,"Tajamar 75, Providencia",6);
        repartidor2.mostrarResumen("Soraya Marín");
        System.out.println("Distancia: " + repartidor2.getDistanciaKm());
        System.out.println("Tiempo de entrega estimado en minutos: "  + repartidor2.calcularTiempoEntrega());


        System.out.println(" ");
        PedidoExpress repartidor3 = new PedidoExpress(003,"Av Tobalaba 4556, Las Condes",17);
        repartidor3.mostrarResumen("Patricio Solís");
        System.out.println("Distancia: " + repartidor3.getDistanciaKm());
        System.out.println("Tiempo de entrega estimado en minutos: " + repartidor3.calcularTiempoEntrega());

    }
}
