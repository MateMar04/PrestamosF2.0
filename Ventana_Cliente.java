import javax.swing.*;

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

    }
}
