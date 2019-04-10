package ar.com.eduit.curso.java.entities;
public class ClientePersona {
    private int nro;
    private String nombre;
    private String direccion;
    private Cuenta cuenta;
    
    //Constructor
    public ClientePersona(int nro, String nombre, String direccion, int nroCuenta) {
        this.nro = nro;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuenta = new Cuenta(nroCuenta,"arg$");
    }
    
    //ToString para saber el estado
    @Override
    public String toString() {
        return "ClientePersona{" + "nro=" + nro + ", nombre=" + nombre + ", direccion=" + direccion + ", cuenta=" + cuenta + '}';
    }
    
    //Creamos los getters (Alt + Insert) Los encapsulamos a los atributos.
    public int getNro() {
        return nro;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }
    
    
    
    
}
