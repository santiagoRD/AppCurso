
package co.com.poli.appcurso.dao.implementation;

import co.com.poli.appcurso.dao.ICursoDao;
import co.com.poli.appcurso.data.cursoData;
import co.com.poli.appcurso.model.Curso;
import java.util.List;


public class CursoDaoImpl implements ICursoDao{

    @Override
    public List<Curso> ObtenerListaCursos() {
        return cursoData.getListaCursos();
    }

    @Override
    public Curso obtenerCurso(String idCurso) {
        Curso curso = null;
        List<Curso> listaCursos = cursoData.getListaCursos();
        for (Curso CursoList : listaCursos) {
            if (CursoList.getIdCurso().equals(idCurso)) {
                curso = CursoList;
            }

        }
        return curso;
    }

    @Override
    public String crearCurso(Curso curso) {
        List<Curso> listaCursos = cursoData.getListaCursos();
        listaCursos.add(curso);
        cursoData.setListaCursos(listaCursos);
        return "Curso creado";
    }

    @Override
    public String modificarCurso(Curso curso) {
        List<Curso> listaCursos = cursoData.getListaCursos();
        listaCursos.set(listaCursos.indexOf(curso), curso);
        cursoData.setListaCursos(listaCursos);
        return "Curso Modificado";
    }

    @Override
    public String eliminarCurso(String idCurso) {
        List<Curso> listaCursos = cursoData.getListaCursos();
        listaCursos.remove(obtenerCurso(idCurso));
        cursoData.setListaCursos(listaCursos);
        return "Curso Eliminado";
    }
    
}
