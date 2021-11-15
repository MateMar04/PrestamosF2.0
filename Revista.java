public class Revista extends Publicacion{
    private String titulo;
    private Autor autor;
    private Categoria categoria;
    private Editorial editorial;
    
    public Revista(String titulo,Autor autor, Categoria categoria, Editorial editorial) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria= categoria;
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Revista{" + "titulo=" + titulo + ", " + autor + ", " + categoria + ", " + editorial + '}';
    }
    
    
    
    
}
