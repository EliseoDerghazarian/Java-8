package ar.com.eduit.curso.java.entities;
public abstract class Persona {
    /*
    Una clase abstracta es una clase que no se le pueden crear objetos
    */
    private String nombre;
    private String apellido;
    private int edad;
    private Direccion direccion; //Tipo de dato Direccion

    //Creamos constructor
    public Persona(String nombre, String apellido, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }
    /*
    Un método abstracto solamente puede estar en una clase abstracta. Es un método que no tiene código
    y debe ser redefinido en las clases hijas.*/
    public abstract void saludar();
    /*
    public void saludar(){
        System.out.println("Hola soy una persona!");
    }
    */
    
    /*
    Un método final, es un método que no se puede sobreescribir en clases hijas.
    */
    public final void despedir(){
        System.out.println("Chau a todos!");
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", direccion=" + direccion + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    
    
    
}
