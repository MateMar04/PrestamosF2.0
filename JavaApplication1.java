public class JavaApplication1 {

    public static void main(String[] args) {
        Provincia p1 = new Provincia("Cordoba");

        Localidad l1 = new Localidad("Capital", p1);

        Barrio b1 = new Barrio("Cerro de las Rosas", l1);

        Direccion d1 = new Direccion("Luis Roblres", "4485", b1);

        Cliente c1 = new Cliente("Pepe", "45545695", "pepe@gmail.com", d1);

        Autor a1 = new Autor("J. R. R. Tolkien");
        Autor a2 = new Autor("Juan de la Torre");

        Categoria cat1 = new Categoria("Fantastico");
        Categoria cat2 = new Categoria("Deporte");

        Editorial e1 = new Editorial("Tirant Lo Blanch");
        Editorial e2 = new Editorial("Castillo");


        Publicacion lib1 = new Libro("El señor de los anillos", a1, e1, cat1);
        Publicacion rev1 = new Revista("Todo deporte", a2, e2, cat2);

        Prestamo pres1 = new Prestamo(c1, "12/5/2020", "12/6/2020");
        pres1.agregar(lib1);

        Biblioteca biblio1 = new Biblioteca("La nacion");
        biblio1.agregar(lib1);
        biblio1.agregar(rev1);

        biblio1.prestar(pres1);

        biblio1.agregarCliente(c1);

        System.out.println("Cantidad de prestamos realizados = " + biblio1.CantidadDePrestamos());
        System.out.println("Cantidad de libros que posee la biblioteca = " + biblio1.CantidadDeLibros());
        System.out.println("Cantidad de revistas que posee la biblioteca = " + biblio1.CantidadDeRevistas());
        System.out.println("Cantidad total de publicaciones que posee la biblioteca = " + biblio1.CantidadDePublicacionesTotal());
        System.out.println("Lista de publicaciones:");
        biblio1.MostrarListaPublicaciones();
        System.out.println("Lista de prestamos:");
        biblio1.MostrarListaPrestamos();

        new Ventana_Biblioteca(biblio1).setVisible(true);
    }

}
