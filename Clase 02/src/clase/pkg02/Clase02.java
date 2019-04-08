package clase.pkg02;

import javax.swing.JOptionPane;

public class Clase02 {
    public static void main(String[] args) {
    //POO
    //Declaración de clase interna
    class Auto{
        //Atributos: variables contenidas dentro de una clase y describen al objeto
        String marca;
        String modelo;
        String color;
        int velocidad;
        
        /*Método constructor
        -Tiene el mismo nombre que la clase, es el único método que inicia en mayúscula
        -No tiene devolución de datos
        -En su interior se colocan las acciones necesarias para inicializar un objeto
        -Pueden existir varios constructores sobrecargados
        -Si la clase no tiene constructor, java agrega un constructor vacio en tiempo de compilacion */
        
        /**
         * Este método fue deprecado el 08/04/2019 por Eliseo
         * por ser inseguro. Usar en su reemplazo
         * Auto(String marca, String modelo, String color)
         * @deprecated
         */
        @Deprecated
        Auto(){} //constructor vacio
        
        Auto(String marca, String modelo, String color){
            this.marca = marca;
            this.modelo = modelo;
            this.color = color;
        }
        

//Métodos: acciones que realiza el objeto
        public void acelerar(){
            /*velocidad += 10;
            if(velocidad > 100)
                velocidad = 100;*/
            acelerar(10);
        }
        
        //Método sobrecargado
        void acelerar(int kms) {
            velocidad += kms;
            if(velocidad > 100)
                velocidad = 100;
        }
        
        public void frenar(){
            velocidad -= 10;
        }
        
        public void velocidad(){
            System.out.println(velocidad);
        }
        
        int getVelocidad(){
            //método con devolución de parámetros
            return velocidad;
        }
    
        @Override 
        public String toString(){
                return marca + " " + modelo + " " + color + " " + velocidad;
        }
    }
    // Creamos el objeto auto1
        System.out.println("--auto1");
        Auto auto1 = new Auto();
        auto1.marca = "Fiat";
        auto1.modelo = "Idea";
        auto1.color = "Verde";
        auto1.acelerar();
        auto1.acelerar();
        auto1.acelerar();
        auto1.frenar();
        auto1.acelerar(15);
        
        System.out.println(auto1.marca + " " + auto1.modelo + " " + auto1.color + " "+ auto1.velocidad);
        //Los atributos de una clase tienen una inicialización automática
        //Los atributos numéricos se inicializan en 0
        //Los atributos String se inicializan en null

        System.out.println("--auto2--");
        Auto auto2 = new Auto();
        auto2.marca = "Ford";
        auto2.modelo = "Ka";
        auto2.color = "Negro";
        
        for(int i = 0; i <= 35; i++){
            auto2.acelerar();
        }
        
        System.out.println(auto2.marca + " " + auto2.modelo + " " + auto2.color + " " + auto2.velocidad);
    
        
        System.out.println("--auto3--");
        Auto auto3 = new Auto("VW", "Gol", "Blanco");
        auto3.acelerar();
        auto3.velocidad();
        System.out.println(auto3.getVelocidad());
        //JOptionPane.showMessageDialog(null, "Velocidad = " + auto3.getVelocidad());
    
        
        //Método toString
        System.out.println(auto3.toString());
        System.out.println(auto3);
    }
}
   

    
    
           
    
    
    

  

