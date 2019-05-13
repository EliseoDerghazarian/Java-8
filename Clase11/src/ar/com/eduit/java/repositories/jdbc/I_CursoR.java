package ar.com.eduit.java.repositories.jdbc;

import ar.com.eduit.curso.java.entities.Alumno;
import ar.com.eduit.curso.java.entities.Curso;
import ar.com.eduit.curso.java.enumerados.Dia;
import ar.com.eduit.curso.java.enumerados.Turno;
import java.util.List;

public interface I_CursoR {
    void save(Curso curso);
    void remove(Curso curso);
    void update(Curso curso);
    Curso getById(int id);
    Curso getByAlumno(Alumno alumno);
    List<Curso> getAll(); // devuelve la lista total
    List<Curso> getLikeTitulo(String titulo);
    List<Curso> getLikeProfesor(String profesor);
    List<Curso> getLikeTituloProfesor(String titulo, String profesor);
    List<Curso> getLikeTituloProfesorDiaTurno(String titulo, String profesor, Dia dia, Turno turno);
}
