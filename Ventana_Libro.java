import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

public class Ventana_Libro extends JFrame {
    private JPanel panel1;
    private JComboBox comboBoxLibro;
    private JLabel lbAutor;
    private JLabel lbTitulo;
    private JLabel lbCategoria;
    private JLabel lbEditorial;

    public Ventana_Libro(Biblioteca biblioteca) {
        add(panel1);
        setSize(700, 600);

        ArrayList<Libro> libros = biblioteca.listarLibros();
        Vector comboBoxItems = new Vector();
        for (Libro libro : libros) {
            comboBoxItems.add(libro.getTitulo());
        }
        comboBoxLibro.setModel(new DefaultComboBoxModel(comboBoxItems));
        comboBoxLibro.setSelectedIndex(-1);

        comboBoxLibro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Libro libro = libros.get(comboBoxLibro.getSelectedIndex());
                dataLoadLibro(libro);
            }
        });
    }

    private void dataLoadLibro(Libro libro) {
        lbAutor.setText(libro.getAutor().toString());
        lbTitulo.setText(libro.getTitulo());
        lbCategoria.setText(libro.getCategoria().toString());
        lbEditorial.setText(libro.getEditorial().toString());
    }
}
