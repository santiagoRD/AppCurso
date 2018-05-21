
package co.com.poli.appcurso.dao;

import co.com.poli.appcurso.model.Curso;
import java.util.List;


public interface ICursoDao {
    
    List<Curso> ObtenerListaCursos();
    Curso obtenerCurso(String idCurso);
    String crearCurso(Curso curso);
    String modificarCurso(Curso curso);
    String eliminarCurso(String idCurso);
    
}
