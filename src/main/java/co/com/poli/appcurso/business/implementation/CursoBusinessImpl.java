
package co.com.poli.appcurso.business.implementation;

import co.com.poli.appcurso.business.ICursoBusiness;
import co.com.poli.appcurso.dao.implementation.CursoDaoImpl;
import co.com.poli.appcurso.model.Curso;
import java.util.List;


public class CursoBusinessImpl implements ICursoBusiness {

    private CursoDaoImpl cursoDaoImpl = new CursoDaoImpl();

    @Override
    public List<Curso> ObtenerListaCursos() {
        return cursoDaoImpl.ObtenerListaCursos();
    }

    @Override
    public Curso obtenerCurso(String idCurso) {
        return cursoDaoImpl.obtenerCurso(idCurso);
    }

    @Override
    public String crearCurso(Curso curso) {
        String respuesta = "Curso ya existe";
        Curso cur = obtenerCurso(curso.getIdCurso());
        if (cur == null) {
            respuesta = cursoDaoImpl.crearCurso(curso);
        }
        return respuesta;
    }

    @Override
    public String modificarCurso(Curso curso) {
        String respuesta = "Curso no existe";
        Curso cur = obtenerCurso(curso.getIdCurso());
        if (cur != null){
            respuesta = cursoDaoImpl.modificarCurso(curso);
        }
        return respuesta;
    }

    @Override
    public String eliminarCurso(String idCurso) {
        String respuesta = "Curso no existe";
        Curso cur = obtenerCurso(idCurso);
        if (cur != null){
            respuesta = cursoDaoImpl.eliminarCurso(idCurso);
        }
        return respuesta;
    }

   

}
