package org.cvguzman;

public class Main {
    public static void main(String[] args) {

        System.out.println(" ");

        System.out.println(":::::::PRUEBA POLIMORFISMO ---> SOBRESCRITURA::::::");
        System.out.println(" ");

        Pedido[] pedidos = {
                new PedidoComida(15),
                new PedidoEncomienda(6),
                new PedidoExpress(17),
        };

        for (Pedido p : pedidos) {
            p.mostrarResumen();
        }

        System.out.println(" ");

        System.out.println("::::::PRUEBA SOBRECARGA ------>  TEMPLATE METHOD::::::");
        System.out.println(" ");

        PedidoComida repartidor = new PedidoComida(15);
        repartidor.mostrarResumen("Mauricio Pérez");
        System.out.println("Tiempo de entrega estimado en minutos: "  + repartidor.calcularTiempoEntrega());

        PedidoEncomienda repartidor2 = new PedidoEncomienda(6);
        repartidor2.mostrarResumen("Soraya Marín");
        System.out.println("Tiempo de entrega estimado en minutos: "  + repartidor2.calcularTiempoEntrega());


        PedidoExpress repartidor3 = new PedidoExpress(17);
        repartidor3.mostrarResumen("Patricio Solís");
        System.out.println("Tiempo de entrega estimado en minutos: " + repartidor3.calcularTiempoEntrega());

    }
}
