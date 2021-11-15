class Cliente {
    private String nombre;
    private String telefono;
    private String email;
    private Direccion direc; 

    public Cliente(String nombre, String telefono, String email, Direccion direc) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.direc = direc;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", telefono=" + telefono + ", email=" + email +" "+ direc + '}';
    }
    
    
}
