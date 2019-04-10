package clase01;
/**
 * Clase principal del proyecto
 * @author Eliseo 
 */
public class Clase01 {
    /**
     * Punto de entrada del proyecto
     * @param args Argumentos que ingresan de consola.
     */
    public static void main(String[] args) {
       
    /**
     * Comentario Java DOC
     * Este comentario debe colocarse antes de la declaración de clase o de método.
     */
    
// Tipos de dato: boolean ocupa 1 byte
    boolean bo = true;
        System.out.println(bo);
        bo = false;
        System.out.println(bo);
    
// Tipos de dato byte: signados. Ocupa 1 byte 
    byte by = -100;
        System.out.println(by);
        by = 127;
        System.out.println(by);
    
// Tipo de dato short: signed. Ocupa 2 bytes
    short sh = 20000;
        System.out.println(sh);
        
// Tipo de dato int: 4 bytes singed
    int in = 2000000000;
        System.out.println(in);
        
// Tipo de dato long: 8 bytes singed    
    long lo = 2000000000L; //indico con L que es un long
        System.out.println(lo);
        
// Tipo de dato char: 2 bytes unsigned
    char ch = 65;
        System.out.println(ch);
        ch += 32;
        System.out.println(ch);
        ch = 'x';
        System.out.println(ch);

// Tipo de dato float: ocupa 32 bits
    float fl = 9.25f;
        System.out.println(fl);
        
// Tipo de dato double: ocupa 64 bits
    double dl = 9.25;
        System.out.println(dl);
    
        fl = 1;
        dl = 1;
        
        System.out.println(fl/3);
        System.out.println(dl/3);
        
        fl = 10;
        dl = 10;
        
        System.out.println(fl/3);
        System.out.println(dl/3);
        
// Clase String
    String st = "Hola"; // JDK 8 -> 8 bytes
    
// Tipo de dato var JDK 9 o superior
    // var var1 = 100;   int
    
    String texto = "Esto es una cadena de caracteres!";
        System.out.println(texto);
        
        for(int a = 0; a < texto.length(); a++){
            System.out.print(texto.charAt(a));
        }
        System.out.println();
        
        //Imprimir texto todo en mayúscula
        for(int a = 0; a < texto.length(); a++){
            char car = texto.charAt(a);
            if(car >= 97 && car <= 122)
                car-=32;
                System.out.print(car);
        }
        System.out.println();
    
        //Operador ternario ?
        for(int a = 0; a < texto.length(); a++){
            char car = texto.charAt(a);
            System.out.print((car >= 97 && car <= 120) ? car -= 32 : car);
        }
        System.out.println();
        
        //Imprimir texto en minúscula
        for(int a = 0; a < texto.length(); a++){
            char car = texto.charAt(a);
            System.out.print((car >= 65 && car <= 90) ? car += 32 : car);
        }
        System.out.println();
    
        System.out.println(texto.toLowerCase());
        System.out.println(texto.toUpperCase());
    }
    
    
    
}
    
    
