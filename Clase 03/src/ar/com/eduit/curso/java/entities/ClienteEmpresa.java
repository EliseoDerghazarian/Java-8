package ar.com.eduit.curso.java.entities;

import java.util.ArrayList;

public class ClienteEmpresa {
    private int nro;
    private String razonSocial;
    private String direccion;
    private ArrayList<Cuenta> cuentas = new ArrayList(); //Array de tipo Cuenta, dinámico.
    
    //Creamos constructor

    public ClienteEmpresa(int nro, String razonSocial, String direccion) {
        this.nro = nro;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
    }
    
    //Creamos un toString
    @Override
    public String toString() {
        return "ClienteEmpresa{" + "nro=" + nro + ", razonSocial=" + razonSocial + ", direccion=" + direccion + '}';
    }
    
    //Creamos getters
    public int getNro() {
        return nro;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }
    
    //Creamos setters

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
}
