public abstract class Publicacion {
    private int cantidadeprestamos;
    private final String titulo;
    private final Autor autor;
    private final Editorial editorial;
    private final Categoria categoria;

    public Publicacion(String titulo, Autor autor, Editorial editorial, Categoria categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.categoria = categoria;
        this.cantidadeprestamos = 0;
    }

    public void incrementarCantPrestamos() {
        cantidadeprestamos++;
    }

    public String getTitulo() {
        return titulo;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public Autor getAutor() {
        return autor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String toString() {
        return "Publicacion" + titulo + "cantidadeprestamos = " + cantidadeprestamos;
    }

}
