package ar.com.eduit.curso.java.entities;
public class Empleado extends Persona {
    private int nroLegajo;
    private String puesto;
    private float sueldoBasico;

    public Empleado(int nroLegajo, String puesto, float sueldoBasico, String nombre, String apellido, int edad, Direccion direccion) {
        super(nombre, apellido, edad, direccion);
        this.nroLegajo = nroLegajo;
        this.puesto = puesto;
        this.sueldoBasico = sueldoBasico;
    }

   

    @Override
    public void saludar() {
        System.out.println("Hola soy un empleado!");
    }
    
    /*
    @Override
    public void despedir(){
        System.out.println("chau!");
    }
    Los métodos finales no pueden ser sobreescritos.
    */
    
    @Override
    public String toString() {
        return super.toString() + "Empleado{" + "nroLegajo=" + nroLegajo + ", puesto=" + puesto + ", sueldoBasico=" + sueldoBasico + '}';
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public float getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(float sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }
    
    
    
    
}
