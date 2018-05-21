
package co.com.poli.appcurso.business;

import co.com.poli.appcurso.model.Curso;
import java.util.List;


public interface ICursoBusiness {
    
    List<Curso> ObtenerListaCursos();
    Curso obtenerCurso(String idCurso);
    String crearCurso(Curso curso);
    String modificarCurso(Curso curso);
    String eliminarCurso(String idCurso);
}
