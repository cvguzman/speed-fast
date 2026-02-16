package org.cvguzman.vista;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    JFrame frame;

    VentanaPrincipal() {
        frame = new JFrame("Ventana Principal");
        frame.setSize(300,300);
        frame.setLayout(new GridLayout(10,10));
        frame.add(new JLabel("Bienvenidos a Speed Fast"));
        frame.add(new JButton("REGISTRAR PEDIDOS"));
        frame.add(new JButton("LISTAR PEDIDOS"));
        frame.add(new JButton("ASIGNAR REPARTIDOR / INICIAR ENTREGA"));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}
