import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

public class Ventana_Cliente extends JFrame {
    private JComboBox comboBoxCliente;
    private JLabel lbNombre;
    private JLabel lbTelefono;
    private JLabel lbDireccion;
    private JLabel lbMail;
    private JComboBox comboBoxPrestamos;
    private JPanel panel1;

    public Ventana_Cliente(Biblioteca biblioteca) {
        add(panel1);
        setSize(700, 600);

        ArrayList clientes = biblioteca.mostrarClientes();
        Vector comboBoxItems = new Vector();

        for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = (Cliente) clientes.get(i);
            comboBoxItems.add(cliente.getNombre());
        }

        comboBoxCliente.setModel(new DefaultComboBoxModel(comboBoxItems));
        comboBoxCliente.setSelectedIndex(-1);

        comboBoxCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cliente cliente = (Cliente) clientes.get(comboBoxCliente.getSelectedIndex());
                lbNombre.setText(cliente.getNombre());
                lbTelefono.setText(cliente.getTelefono());
                lbDireccion.setText(cliente.getDirec().toString());
                lbMail.setText(cliente.getEmail());


                ArrayList prestamos = biblioteca.MostrarListaPrestamos();
                Vector comboBoxItems = new Vector();

                for (int i = 0; i < prestamos.size(); i++) {
                    ArrayList publicacionesPrestadas = ((Prestamo) prestamos.get(i)).getLista();
                    if (((Prestamo) prestamos.get(i)).getCliente() == cliente) {
                        for (int j = 0; j < publicacionesPrestadas.size(); j++) {
                            comboBoxItems.add(((Publicacion) publicacionesPrestadas.get(j)).getTitulo());
                        }
                    }
                }

                comboBoxPrestamos.setModel(new DefaultComboBoxModel(comboBoxItems));
                comboBoxPrestamos.setSelectedIndex(-1);
            }
        });
    }
}
