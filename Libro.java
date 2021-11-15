/**
 *
 * @author franb
 */
public class Libro extends Publicacion{
    private String titulo;
    private Autor autor;
    private Categoria categoria;
    private Editorial editorial;
    

    public Libro(String titulo, Autor autor, Categoria categoria, Editorial editorial ) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria= categoria;
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", "+  autor + ", " + categoria + ", " + editorial + '}';
    }
    
    
    
    
}
