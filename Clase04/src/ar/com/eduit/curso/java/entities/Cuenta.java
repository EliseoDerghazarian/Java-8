package ar.com.eduit.curso.java.entities;
public class Cuenta {
    //Atributos
    private int nro;
    private String moneda;
    private float saldo;

    //Constructor
    public Cuenta(int nro, String moneda) {
        this.nro = nro;
        this.moneda = moneda;
        this.saldo = 0;
    }
    
    public void depositar(float monto){
        saldo += monto;
    }
    
    public void debitar(float monto){
        if(saldo >= monto)
            saldo -= monto;
        else
            System.out.println("No hay saldo suficiente.");
    }

    @Override
    public String toString() { // devuelve el estado del objeto
        return "Cuenta{" + "nro=" + nro + ", moneda=" + moneda + ", saldo=" + saldo + '}';
    }

    public int getNro() {
        return nro;
    }

    public String getMoneda() {
        return moneda;
    }

    public float getSaldo() {
        return saldo;
    }
    
    

    
}
