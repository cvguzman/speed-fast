package org.cvguzman;

public class Main {
    public static void main(String[] args) {

        System.out.println(" ");

        System.out.println(":::::::PRUEBA POLIMORFISMO ---> SOBRESCRITURA::::::");
        System.out.println(" ");

        Pedido[] pedidos = {
                new PedidoComida(),
                new PedidoEncomienda(),
                new PedidoExpress(),
        };

        for (Pedido p : pedidos) {
            p.asignarRepartidor();
        }

        System.out.println(" ");

        System.out.println("::::::PRUEBA SOBRECARGA::::::");
        System.out.println(" ");

        PedidoComida repartidor = new PedidoComida();
        repartidor.asignarRepartidor("Mauricio Pérez");

        PedidoEncomienda repartidor2 = new PedidoEncomienda();
        repartidor2.asignarRepartidor("Soraya Marín");

        PedidoExpress repartidor3 = new PedidoExpress();
        repartidor3.asignarRepartidor("Patricio Solís");
    }
}
