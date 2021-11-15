import java.util.ArrayList;

public class Biblioteca {
    private final String nombre;
    private final ArrayList<Publicacion> listaPublicacion;
    private final ArrayList<Prestamo> listaPrestamos;
    private final ArrayList listaLibro;
    private final ArrayList listaRevista;
    private final ArrayList listaClientes;


    public Biblioteca(String nombre) {
        this.nombre = nombre;
        listaPublicacion = new ArrayList();
        listaPrestamos = new ArrayList();
        listaLibro = new ArrayList();
        listaRevista = new ArrayList();
        listaClientes = new ArrayList();
    }

    void agregar(Publicacion pub) {
        listaPublicacion.add(pub);
        if (pub.getClass() == Libro.class) {
            listaLibro.add(pub);
        }
        if (pub.getClass() == Revista.class) {
            listaRevista.add(pub);
        }
    }

    void agregarCliente(Cliente cli) {
        listaClientes.add(cli);
    }

    void prestar(Prestamo pub) {
        listaPrestamos.add(pub);
    }

    int CantidadDePrestamos() {
        return listaPrestamos.size();
    }

    int CantidadDePublicacionesTotal() {
        return listaPublicacion.size();
    }

    int CantidadDeLibros() {
        return listaLibro.size();
    }


    void MostrarListaPublicaciones() {
        for (Publicacion publicacion : listaPublicacion) {
            System.out.println(publicacion);
        }
    }

    ArrayList<Prestamo> MostrarListaPrestamos() {
        return listaPrestamos;
    }

    int CantidadDeRevistas() {
        return listaRevista.size();
    }

    public ArrayList<Cliente> mostrarClientes() {
        return listaClientes;
    }

    public ArrayList<Libro> listarLibros() {
        ArrayList<Libro> libros = new ArrayList<>();
        for (Publicacion p : listaPublicacion) {
            if (p instanceof Libro) {
                libros.add((Libro) p);
            }
        }
        return libros;
    }

    public ArrayList<Revista> listarRevistas() {
        ArrayList<Revista> revistas = new ArrayList<>();
        for (Publicacion p : listaPublicacion) {
            if (p instanceof Revista) {
                revistas.add((Revista) p);
            }
        }
        return revistas;
    }

}
