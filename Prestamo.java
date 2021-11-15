import java.util.ArrayList;

/**
 *
 * @author franb
 */
class Prestamo {
    private Cliente cliente;
    private String FechaDePrestamo;
    private String FechaTentativaDeDevolucion;
    ArrayList<Publicacion> lista;
    
    public Prestamo(Cliente cliente, String FechaDePrestamo, String FechaTentativaDeDevolucion) {
        this.cliente = cliente;
        this.FechaDePrestamo = FechaDePrestamo;
        this.FechaTentativaDeDevolucion = FechaTentativaDeDevolucion;
        lista=new ArrayList();
    }

    @Override
    public String toString() {
        return "Prestamo{"+cliente + ", FechaDePrestamo=" + FechaDePrestamo + ", FechaTentativaDeDevolucion=" + FechaTentativaDeDevolucion + '}';
    }

        void agregar(Publicacion pub) {
        lista.add(pub);
    }

    
    
}
