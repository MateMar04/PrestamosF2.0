import javax.swing.*;

public class Ventana_Revista extends JFrame{
    private JComboBox comboBoxRevista;
    private JLabel lbAutor;
    private JLabel lbTitulo;
    private JLabel lbCategoria;
    private JLabel lbEditorial;
    private JPanel panel1;

    public Ventana_Revista(Biblioteca biblioteca) {
        add(panel1);
        setSize(700, 600);

    }
}
