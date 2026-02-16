package org.cvguzman.vista;

import javax.swing.*;
import java.awt.*;

public class VentanaRegistroPedidos extends JFrame {
    JFrame formulario;
    JTextField id;
    JTextField direccion;
    JLabel lblId;
    JLabel lblDireccion;
    JComboBox tipoComida;
    JButton guardar;
    JOptionPane registrado;


    VentanaRegistroPedidos() {
        formulario = new JFrame("Resgistro Pedidos");
        formulario.setSize(300,300);
        formulario.setLayout(new GridLayout(10,10));
        tipoComida = new JComboBox<>(new String[]{"Comida", " Encomienda", "Pedido Express"});
        formulario.add(tipoComida);

        lblId = new JLabel("ID pedido");
        formulario.add(lblId);
        id = new JTextField();
        formulario.add(id);

        lblDireccion = new JLabel("Dirección");
        formulario.add(lblDireccion);
        direccion = new JTextField();
        formulario.add(direccion);

        guardar = new JButton("GUARDAR");
        formulario.add(guardar);

        registrado = new JOptionPane("Pedido registrado exitosamente");
        formulario.add(registrado);
    }
}
