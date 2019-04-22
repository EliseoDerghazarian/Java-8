package clase.pkg06;
public class Clase06Parte2 {
    public static void main(String[] args){
        //Clase Object
        class Dato{
            int dato;

            public Dato(int dato) {
                this.dato = dato;
            }

            @Override
            public String toString() {
                return "Dato{" + "dato=" + dato + '}';
            }

            @Override
            public int hashCode() {
                return toString().hashCode();
            }

            @Override
            public boolean equals(Object obj) {
                return hashCode() == obj.hashCode();
            }
            
            
        }//end class Dato
        
        Dato d1 = new Dato(2);
        Dato d2 = d1;
        Dato d3 = new Dato(2);
        Dato d4 = new Dato(3);
        String d5 = "2";
        
        //Método hashCode() -Devuelve un entero que representa al objeto.
        System.out.println("d1.hashCode() = " + d1.hashCode());
        System.out.println("d2.hashCode() = " + d2.hashCode());
        System.out.println("d3.hashCode() = " + d3.hashCode());
        System.out.println("d4.hashCode() = " + d4.hashCode());
        System.out.println("d5.hashCode() = " + d5.hashCode());
        
        //Método .equals() -Compara objetos
        System.out.println("d1.equals(d1): " + d1.equals(d1));
        System.out.println("d1.equals(d2): " + d1.equals(d2));
        System.out.println("d1.equals(d3): " + d1.equals(d3));
        System.out.println("d1.equals(d4): " + d1.equals(d4));
        System.out.println("d1.equals(d5): " + d1.equals(d5));
        
        
        //Clase String
        String texto1 = "esto es una cadena de texto";
        String texto2 = new String("hola");
        char[] vector = {'h','o','l','a'};
        String texto3 = new String(vector);
        
        //.length() -Devuelve la longitud de un String
        System.out.println(texto1.length());
        
        //.charAt(int index) -Indica que caracter hay en ese índice
        System.out.println(texto1.charAt(10));
        
        //.subString() -
        System.out.println(texto1.substring(10));
        System.out.println(texto1.substring(10,15));
        
        //.startWith() .endsWith()
        System.out.println(texto1.startsWith("hola"));
        System.out.println(texto1.startsWith("es"));
        System.out.println(texto1.endsWith("chau"));
        System.out.println(texto1.endsWith("texto"));
        
        //.contains()
        System.out.println(texto1.contains("cadena"));
        
        //.indexOf()
        System.out.println(texto1.indexOf("t"));
        
        //.trim() -Quita cualquier espacio que esté al principio y al final
        System.out.println(" Hola  Hola ".trim());
        
        //.replaceAll() -Reemplazo por ejemplo espacios por puntos
        System.out.println(texto1.replaceAll(" ", "."));
        
        //.toLowerCase() .toUpperCase()
        System.out.println(texto1.toLowerCase());
        System.out.println(texto1.toUpperCase());
        
        //.split() 
        String[] palabras = texto1.split(" ");
        for(int i = 0; i < palabras.length; i++)
            System.out.println(palabras[i]);
        
        String texto = "";
        System.out.println(texto + "\t" + texto.hashCode());
        texto += "h";
        System.out.println(texto + "\t" + texto.hashCode());
        texto += "o";
        System.out.println(texto + "\t" + texto.hashCode());
        texto += "l";
        System.out.println(texto + "\t" + texto.hashCode());
        texto += "a";
        System.out.println(texto + "\t" + texto.hashCode());
        
        //StringBuilder - StringBuffer -Contiene un String que es dinámico
        StringBuilder sb = new StringBuilder();
        //StringBuffer sb = new StringBuffer();
        System.out.println(sb.toString() + "\t" + sb.hashCode());
        sb.append("h");
        System.out.println(sb.toString() + "\t" + sb.hashCode());
        sb.append("o");
        System.out.println(sb.toString() + "\t" + sb.hashCode());
        sb.append("l");
        System.out.println(sb.toString() + "\t" + sb.hashCode());
        sb.append("a");
        System.out.println(sb.toString() + "\t" + sb.hashCode());
        
        //append -Agrega al final de la lista.
        texto = "";
        sb = new StringBuilder();
        for(int i = 0; i < 1000000; i++){
            //texto += "x";
            sb.append("x");
        }
        //System.out.println(texto);
        System.out.println(sb.toString());
        
        //Clase System -Representa a nuestro sistema
        
        //método .exit()
        //System.exit(0);
        //System.out.println("Esta linea no se ejecuta");
        
        //getProperties() -Devuelve un diccionario de propiedades del sistema
        System.out.println(System.getProperties());
        
        //getProperty()
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("os.arch"));
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("os.language"));
    }
    
}
