/**
 *
 * @author franb
 */
class Direccion {
    private String calle;
    private String numero;
    private Barrio barrio;

    public Direccion(String calle, String numero, Barrio barrio) {
        this.calle = calle;
        this.numero = numero;
        this.barrio = barrio;
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", numero=" + numero + " " + barrio + '}';
    }

    
    
    
    
}
