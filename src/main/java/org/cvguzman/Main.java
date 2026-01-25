package org.cvguzman;

public class Main {
    public static void main(String[] args) {

        System.out.println(" ");

        System.out.println(":::::::PRUEBA POLIMORFISMO ---> SOBRESCRITURA::::::");
        System.out.println(" ");

        Pedido[] pedidos = { new PedidoComida(), new PedidoEncomienda(), new PedidoExpress()};

        for (Pedido p : pedidos) {
            p.asignarRepartidor();
        }

        System.out.println(" ");

        System.out.println("::::::PRUEBA SOBRECARGA  ---->  TEMPLATE METHOD::::::");
        System.out.println(" ");

        PedidoComida repartidor = new PedidoComida(1,"Avenida Suecia 15, Providencia","Comida",15);
        repartidor.mostrarResumen("Mauricio Pérez");
        System.out.println("Distancia en km: " + repartidor.getDistanciaKm());
        System.out.println("Tiempo de entrega estimado en minutos: "  + repartidor.calcularTiempoEntrega());

        System.out.println(" ");
        PedidoEncomienda repartidor2 = new PedidoEncomienda(2,"Tajamar 75, Providencia","Encomienda", 6);
        repartidor2.mostrarResumen("Soraya Marín");
        System.out.println("Distancia en km: " + repartidor2.getDistanciaKm());
        System.out.println("Tiempo de entrega estimado en minutos: "  + repartidor2.calcularTiempoEntrega());


        System.out.println(" ");
        PedidoExpress repartidor3 = new PedidoExpress(3,"Av Tobalaba 4556, Las Condes","Express", 17);
        repartidor3.mostrarResumen("Patricio Solís");
        System.out.println("Distancia en km: " + repartidor3.getDistanciaKm());
        System.out.println("Tiempo de entrega estimado en minutos: " + repartidor3.calcularTiempoEntrega());
    }
}
