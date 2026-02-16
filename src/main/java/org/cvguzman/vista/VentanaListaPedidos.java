package org.cvguzman.vista;

import org.cvguzman.modelo.Pedido;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class VentanaListaPedidos {
    JFrame listaPedidos;
    JTable tablaPedidos;
    DefaultTableModel gestionDatos;
    JScrollPane scroll;


    VentanaListaPedidos() {
        listaPedidos = new JFrame("Lista de Pedidos");
        listaPedidos.setSize(300,300);
        listaPedidos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        gestionDatos = new DefaultTableModel();
        gestionDatos.addColumn("ID");
        gestionDatos.addColumn("Dirección");
        gestionDatos.addColumn("Tipo Pedido");

        tablaPedidos = new JTable(gestionDatos);
        tablaPedidos.setDefaultEditor(Object.class, null);

        scroll = new JScrollPane(tablaPedidos);
        scroll.setLayout(new BorderLayout());
        scroll.add(scroll, BorderLayout.CENTER);

    }

    public void actualizarTabla(List<Pedido> listaPedidos) {
        gestionDatos.setRowCount(0);

        for (Pedido p : listaPedidos) {
            gestionDatos.addRow(new Object[] {
                    p.getId(),
                    p.getDireccionEntrega()
            });
        }
    }
}
