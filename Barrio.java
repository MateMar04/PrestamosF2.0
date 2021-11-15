class Barrio {
    private String nombre;
    private Localidad loc;

    public Barrio(String nombre,Localidad loc) {
        this.nombre = nombre;
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Barrio{" + "nombre=" + nombre +" "+ loc + '}';
    }
    
    
}
