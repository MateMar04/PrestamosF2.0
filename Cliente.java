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

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public Direccion getDirec() {
        return direc;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", telefono=" + telefono + ", email=" + email +" "+ direc + '}';
    }
    
    
}
