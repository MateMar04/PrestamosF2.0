class Localidad {
    private String nombre;
    private Provincia prov;
    
    Localidad(String nombre, Provincia prov) {
        this.nombre=nombre;
        this.prov=prov;
    }

    @Override
    public String toString() {
        return "Localidad{" + "nombre=" + nombre + " " + prov + '}';
    }
    
}
