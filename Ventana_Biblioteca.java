import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana_Biblioteca extends JFrame {
    private JPanel panel1;
    private JButton librosButton;
    private JButton revistasButton;
    private JButton clientesButton;
    private JLabel lbRevistas;
    private JLabel lbLibros;
    private JLabel lbPublicaciones;

    public Ventana_Biblioteca(Biblioteca biblioteca) {
        add(panel1);
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setData(biblioteca);


        librosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Ventana_Libro(biblioteca).setVisible(true);
            }
        });
        revistasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Ventana_Revista(biblioteca).setVisible(true);
            }
        });
        clientesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Ventana_Cliente(biblioteca).setVisible(true);
            }
        });
    }

    private void setData(Biblioteca biblioteca) {
        lbPublicaciones.setText(String.valueOf(biblioteca.CantidadDePublicacionesTotal()));
        lbLibros.setText(String.valueOf(biblioteca.CantidadDeLibros()));
        lbRevistas.setText(String.valueOf(biblioteca.CantidadDeRevistas()));
    }
}
