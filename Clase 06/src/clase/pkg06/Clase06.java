package clase.pkg06;

import java.util.Scanner;

public class Clase06 {
    public static void main(String[] args) throws Exception {
       //Uso de interfaces
       I_File archivo = null;
       
       //archivo = new FileText();
       //archivo = new FileBinary();

        System.out.println("Ingrese 'FileText' o 'FileBinary':");
        String ingreso = new Scanner(System.in).next();
        
        /*if(ingreso.equalsIgnoreCase("FileText"))
            archivo = new FileText();
        if(ingreso.equalsIgnoreCase("FileBinary"))
            archivo = new FileBinary();
        */
        
        archivo = (I_File)Class.forName("clase.pkg06." + ingreso).newInstance();
        
       //Aplicacion
       archivo.setText("texto");
        System.out.println(archivo.getText());
        archivo.info();
    }
    
}
