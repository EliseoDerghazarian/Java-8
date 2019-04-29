package clase08;

import java.io.File;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Clase08 {
    public static void main(String[] args) {
        // Clase 08 Manejo de Exceptions
        //System.out.println(10/0);
        //System.out.println("Esta linea no se ejecuta");
        
        /*
        Return 0  - Todo ok
        Return 1  - Error
        Return -1 - Warning
        */
        
        /*
        Estructura try catch finally
        try{
            Colocar acá todas las sentencias que pueden arrojar una exception.
            Estas sentencias tienen más costo de hardware.
        }catch(Exception e)
            Estas sentencias se ejecutan en caso de exception.
            Se recibe como parámetro un objeto de Exception.
        }finally{
            Este bloque se ejecuta siempre, ocurra o no ocurra Exception.
            Los objetos creados en try o catch no son accesibles desde este bloque.
            Este bloque es opcional.
        }
        Estas líneas se ejecutan siempre.
        El programa termina normalmente
        */
        
        /*
        Ejemplo
        
        try{
            System.out.println(10/0);
            System.out.println("Esta sentencia no se ejecuta");
        }catch(Exception e){
            System.out.println("Ocurrió un error");
            System.out.println(e);
        }finally{
            System.out.println("El programa termina normalmente");
        }
        */
        /*
        try {
            //GeneradorDeExcepciones.generar();
            //GeneradorDeExcepciones.generar(true);
            //GeneradorDeExcepciones.generar("22x");
            //GeneradorDeExcepciones.generar(null,10);
            //GeneradorDeExcepciones.generar("hola",10);
        } catch (Exception e) {
            //System.out.println(e);
            e.printStackTrace(); //me imprime en color rojo con la ruta de errores
        }
        System.out.println("El programa termina normalmente");

        */
        
        //Caputra personalizada de Exceptions
        try {
            //FileReader in = new FileReader(new File("texto.txt"));
            //GeneradorDeExcepciones.generar();
            //System.exit(-20);
            //GeneradorDeExcepciones.generar(true);
            //GeneradorDeExcepciones.generar("22x");
            //GeneradorDeExcepciones.generar(null, 0);
            GeneradorDeExcepciones.generar("hola", 10);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Índice fuera de rango");
        }catch(ArithmeticException e){
            System.out.println("Division /0");
        }catch(NumberFormatException e){
            System.out.println("Formato de número incorrecto.");
        }catch(NullPointerException e){
            System.out.println("Puntero nulo.");
        }catch(Exception e){
            System.out.println("Ocurrió un error no esperado");
        }
        
        //Uso de excepciones para validar relgas de negocio.
        Vuelo v1 = new Vuelo("AER1234", 100);
        Vuelo v2 = new Vuelo("LAT111", 100);
        
        try {
            v1.venderPasajes(40);
            //v1.venderPasajes(-4);
            v2.venderPasajes(20);
            v1.venderPasajes(50);
            v1.venderPasajes(30);
            v1.venderPasajes(30); //Lanza Exception.
            v2.venderPasajes(10); //Esta venta no se realiza.
        } catch (NoHayMasPasajesException ex) {
            System.out.println(ex);
        } catch (IllegalArgumentException ex) {
            System.out.println("La cantidad de pasajes debe ser mayor a 0");
        }
        
        //try with resources JDK 7 o sup
        //interface Closeable
        try(FileReader read = new FileReader(new File("texto.txt"))){
            //sentencias que leen el archivo
            //La interface closeable se encarga de cerrar el objeto ocurra exception o no.
            //read.close(); //Este método se va a ejecutar dos veces.
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
}
