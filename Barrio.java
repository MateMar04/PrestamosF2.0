class Barrio {
    private final String nombre;
    private final Localidad loc;

    public Barrio(String nombre, Localidad loc) {
        this.nombre = nombre;
        this.loc = loc;
    }

    @Override
    public String toString() {
        return nombre + ", " + loc;
    }


}
