package clase.pkg06;
public interface I_File {
    /*
    -En la interface no se declaran atributos ni métodos constructores.
    -Una interface contiene constantes o métodos abstractos.
    -Todos los miembros de una interface son públicos.
    -Un método abstracto no tiene código, la clase que implementa la interface
     agrega el código al método.
    -Una clase puede implementar todas las interfaces que necesite.
    -No se pueden crear objetos de una interface.
    -Se puede hacer polimorfismo por interface.
    -La JavaDOC es heredada a todas las implementaciones.
    */
    
    /**
     * Este método escribe en el archivo
     * @param text  texto a escribir.
     */
    void setText(String text);
    String getText();
    
    /*
    Métodos default: Estos métodos existen desde java 8, son métodos que tienen     
    código, y son heredados a las clases que implementan la interfacee. Como una clase puede 
    implementar múltiples interfaces, se produce una herencia múltiple.
    */
    
    default void info(){
            System.out.println("Interface I_File, método default");
    }
}
