import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;

public class Ventana_Revista extends JFrame {
    private JComboBox comboBoxRevista;
    private JLabel lbAutor;
    private JLabel lbTitulo;
    private JLabel lbCategoria;
    private JLabel lbEditorial;
    private JPanel panel1;

    public Ventana_Revista(Biblioteca biblioteca) {
        add(panel1);
        setSize(700, 600);

        ArrayList revistas = biblioteca.listarRevistas();
        Vector comboBoxItems = new Vector();

        for (int i = 0; i < revistas.size(); i++) {
            Revista revista = (Revista) revistas.get(i);
            comboBoxItems.add(revista.getTitulo());
        }

        comboBoxRevista.setModel(new DefaultComboBoxModel(comboBoxItems));
        comboBoxRevista.setSelectedIndex(-1);

        comboBoxRevista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Revista revista = (Revista) revistas.get(comboBoxRevista.getSelectedIndex());
                lbAutor.setText(revista.getAutor().getNombre());
                lbTitulo.setText(revista.getTitulo());
                lbCategoria.setText(revista.getCategoria().getNombre());
                lbEditorial.setText(revista.getEditorial().getNombre());
            }
        });

    }
}
