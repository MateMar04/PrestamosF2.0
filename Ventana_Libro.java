import javax.swing.*;

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

    }
}
