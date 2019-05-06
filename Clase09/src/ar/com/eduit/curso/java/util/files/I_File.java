package ar.com.eduit.curso.java.util.files;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public interface I_File {
    void print();
    String getText();
    void setText(String text);
    void appendText(String text);
    void clear();
    void addLine(String line);
    void addLines(Collection<String> lines); //recibe una coleccion de listas y lo agregua al archivo
    List<String> getLines(); //devuelve una lista 
    List<String> getLines(String filter);
    List<String> getSortedLines();//devuelve la lista de lineas ordenadas. Mantiene los duplicados
    List<String> getReversedLines();
    LinkedHashSet<String> getLinkedHashSetLines();
    TreeSet<String> getTreeSetLines(); //devuelve sin duplicados pero ordenado
    void removeLine(String line);//uno uno ingresa una linea y la borra
    
}
