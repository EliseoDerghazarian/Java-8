package clase07;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class Clase07 {
    public static void main(String[] args) {
       //Clase07 Colecciones
        Auto[] autos = new Auto[4];
        autos[0] = new Auto("Ford","Ka","Negro");
        autos[1] = new Auto("Fiat","Idea","Rojo");
        autos[2] = new Auto("VW","Gol","Gris");
        autos[3] = new Auto("Renault","Kangoo","Bordo");
        
        //LIST
        //recorrido por indices
        /*for(int a = 0; a <autos.length; a++)
            System.out.println(autos[a]);
        */
        
        //recorrido foreach No nos desliga de pensar en el índice
        for(Auto a:autos)
            System.out.println(a);
        
        //Interface List (Representa una lista con índices)
        List lista = new ArrayList();
        //agregamos al final con método add
        lista.add(new Auto("Chevrolet","Spin","Blanco"));
        lista.add(new Auto("Peugeot","206","Negro"));
        lista.add("hola");
        lista.add(23);
        lista.remove(3); //elimino lo del índice 3
        
        //copiamos los autos del vector autos a lista
        for(Auto a:autos)
            lista.add(a);
        System.out.println("**************************************************");
        
        //recorrido con índices
        /*el método size te devuelve la longitud de la lista y el get el elemento de un 
        indice determinado
        for(int a = 0; a < lista.size(); a++)
            System.out.println(lista.get(a));
        */
        
        //recorrido foreach
        /*for(Object o:lista) 
            System.out.println(o);
        */
        
        //método default forEach a partir de JDK8
        //por cada elemento de la lista, voy a tener un item
        //lista.forEach(item->System.out.println(item));
        //lista.forEach(item->{
        //  System.out.println(item):
        //});
        
        //El item implícito va a ser parámetro del método
        lista.forEach(System.out::println);
        
        //Uso de Generic <> a partir de JDK5
        //Estoy tipando a la lista
        List <Auto> lista2 = new LinkedList();
        lista2.add(new Auto("Renault","12","Verde"));
        lista2.add(new Auto("Fiat","600","Rojo"));
        
        Auto auto1 = (Auto)lista.get(0); //casteo porque la lista es de tipo Object
        Auto auto2 = lista2.get(0); //no necesito castear porque la lista es de tipo Auto.
        
        //copiar los autos de lista a lista2
        lista.forEach(item->{
            if(item instanceof Auto) lista2.add((Auto) item);
        });
        
        System.out.println("**************************************************");
        lista2.forEach(System.out::println);
        
        //SET 
        //-No permite valores duplicados
        //Interface Set
        Set<String> set;
        
        //Implementación HashSet
        //Es la más veloz, no garantiza el orden de los elementos.
        set = new HashSet();
        set.add("Lunes");
        set.add("Martes");
        set.add("Miércoles");
        set.add("Jueves");
        set.add("Viernes");
        set.add("Martes");
        set.add("Sábado");
        set.add("Domingo");
        set.add("Martes");
        System.out.println("***************************************************");
        set.forEach(System.out::println);
        
        //Implementación LinkedHashSet
        //Almacena elementos en una lista enlazada por orden de ingreso
        set = new LinkedHashSet();
        set.add("Lunes");
        set.add("Martes");
        set.add("Miércoles");
        set.add("Jueves");
        set.add("Viernes");
        set.add("Martes");
        set.add("Sábado");
        set.add("Domingo");
        set.add("Martes");
        System.out.println("***************************************************");
        set.forEach(System.out::println);
        
        //Implementación TreeSet
        //Almacena elementos en un árbol por orden natural
        set = new TreeSet();
        set.add("Lunes");
        set.add("Martes");
        set.add("Miércoles");
        set.add("Jueves");
        set.add("Viernes");
        set.add("Martes");
        set.add("Sábado");
        set.add("Domingo");
        set.add("Martes");
        System.out.println("***************************************************");
        set.forEach(System.out::println);       
    
    //Set<Auto> setAutos = new LinkedHashSet();
    Set<Auto>setAutos = new TreeSet();
    setAutos.addAll(lista2);
    setAutos.add(new Auto("Renault","Kangoo","Bordo"));
    System.out.println("******************************************************");
    //setAutos.forEach(System.out::println);
    setAutos.forEach(item->System.out.println(item + "\t" + item.hashCode()));
    
    //PILAS clase Stach (LIFO) Last in First out
    
    Stack<Auto> pila = new Stack();
    pila.push(new Auto("Ford","Fiesta","Rojo"));
    
    //método push() Apila elementos.
    pila.addAll(lista2);
    
        System.out.println("****************************************************");
        pila.forEach(System.out::println);
        
        System.out.println("Longitud de pila: " + pila.size());
            while(!pila.isEmpty()){
                System.out.println(pila.pop());
                //método pop() desapila el último elemento y lo devuelve.
            }
            System.out.println("Longitud de pila: " + pila.size());
            
            
        //Clase ArrayDeque Cola FIFO First in First out
        ArrayDeque<Auto> cola = new ArrayDeque();
        cola.offer(new Auto("Mercedes","Clase C", "Azul"));
        //método .offer() Encola un elemento al final de la lista
        cola.addAll(lista2);
        System.out.println("**************************************************");
        cola.forEach(System.out::println);
        System.out.println("Longitud de Cola: " + cola.size());
        while(!cola.isEmpty()){
            System.out.println(cola.poll());
            //método poll() desencola un elemento
        }
        System.out.println("Longitud de Cola: "+cola.size());
        
        //Ejemplo de API Stream
        //SELECT * FROM lista2 WHERE color = 'Rojo';
        lista2
                .stream()
                .filter(a->a.getColor()
                        .equalsIgnoreCase("rojo"))
                        .forEach(System.out::println);
        
        //SELECT * FROM lista2 WHERE marca LIKE '%f%' OR color='Negro';
        lista2
                .stream()
                .filter(a->a.getMarca().toLowerCase().contains("f") 
                        || a.getColor().equalsIgnoreCase("negro"))
                .forEach(System.out::println);
        
        //Interface Map
        //Permite representar un vector asociativo del tipo llave valor.
        //El índice no necesariamente es un entero. Puede ser cualquier cosa, a diferencia de las listas.
        Map<String,String> mapaSemana;
        
        //Implementación HashMap: es la más veloz, no hay garantía del orden.
        //método .put() agrego elementos al mapa
        mapaSemana = new HashMap();
        
        mapaSemana.put("lu", "Lunes");
        mapaSemana.put("ma", "Martes");
        mapaSemana.put("mi", "Miércoles");
        mapaSemana.put("ju", "Jueves");
        mapaSemana.put("vi", "Viernes");
        
        //System.out.println(mapaSemana.get("lu"));
        System.out.println("**************************************************");
        mapaSemana.forEach((k,v)->System.out.println(k + " " + v));
        
        //Implementación LinkedHashMap(): almacena elementos por orden de ingreso
        mapaSemana = new LinkedHashMap();
        
        mapaSemana.put("lu", "Lunes");
        mapaSemana.put("ma", "Martes");
        mapaSemana.put("mi", "Miércoles");
        mapaSemana.put("ju", "Jueves");
        mapaSemana.put("vi", "Viernes");
        
        System.out.println("**************************************************");
        mapaSemana.forEach((k,v)->System.out.println(k + " " + v));
        
        //Implementación TreeMap(): almacena en un árbol ordenado por llave
        mapaSemana = new TreeMap();
        
        mapaSemana.put("lu", "Lunes");
        mapaSemana.put("ma", "Martes");
        mapaSemana.put("mi", "Miércoles");
        mapaSemana.put("ju", "Jueves");
        mapaSemana.put("vi", "Viernes");
        
        System.out.println("**************************************************");
        mapaSemana.forEach((k,v)->System.out.println(k + " " + v));
        
        }
    
    
    
    
    
    
    
    
    }
    

