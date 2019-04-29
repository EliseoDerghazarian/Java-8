package clase08;
public class Vuelo {
    private String vuelo;
    private int cantidadPasajes;

    public Vuelo(String vuelo, int cantidadPasajes) {
        this.vuelo = vuelo;
        this.cantidadPasajes = cantidadPasajes;
    }
    
    //vender cantidad de pasajes disponibles, si no hay, se lanza una excepcion
    //syncronized bloquea y no deja acceder mientras se esta vendiendo a otro usuario.
    //Este metodo lanza una excepcion que no hay mas pasajes
    public synchronized void venderPasajes(int cantidad) throws NoHayMasPasajesException, IllegalArgumentException{
        if (cantidad > cantidadPasajes) throw new NoHayMasPasajesException(vuelo, cantidad);
        if (cantidad < 0) throw new IllegalArgumentException();
        cantidadPasajes -= cantidad;
    }
    
    @Override
    public String toString() {
        return "Vuelo{" + "vuelo=" + vuelo + ", cantidadPasajes=" + cantidadPasajes + '}';
    }

    public String getVuelo()        { return vuelo; }
    public int getCantidadPasajes() { return cantidadPasajes; }
    
    
}
