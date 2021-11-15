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

        Vector vector = new Vector();
        ArrayList<Cliente> clientes = biblioteca.mostrarClientes();
        for (Cliente cliente : clientes) {
            vector.add(cliente.getNombre());
        }

        comboBoxCliente.setModel(new DefaultComboBoxModel(vector));
        comboBoxCliente.setSelectedIndex(-1);

        comboBoxCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cliente cliente = clientes.get(comboBoxCliente.getSelectedIndex());
                lbNombre.setText(cliente.getNombre());
                lbTelefono.setText(cliente.getTelefono());
                lbDireccion.setText(cliente.getDirec().toString());
                lbMail.setText(cliente.getEmail());


                ArrayList prestamos = new ArrayList();
                Vector comboBoxItems = new Vector();

                for (Prestamo prestamo : biblioteca.MostrarListaPrestamos()) {
                    ArrayList<Publicacion> publicacionesPrestadas = prestamo.getLista();
                    if (prestamo.getCliente() == cliente) {
                        for (Publicacion pub : publicacionesPrestadas) {
                            comboBoxItems.add(pub.getTitulo());
                        }
                    }
                }

                comboBoxPrestamos.setModel(new DefaultComboBoxModel(comboBoxItems));
                comboBoxPrestamos.setSelectedIndex(-1);
            }
        });
    }
}
