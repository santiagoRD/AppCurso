package co.com.poli.appcurso.data;

import co.com.poli.appcurso.model.Curso;
import java.util.ArrayList;
import java.util.List;


public class cursoData {
    private static List<Curso> listaCursos;
    
    static{
        listaCursos = new ArrayList<Curso>(){
            {
                add(new Curso("001", "Redes", 6.0, 300.000, Boolean.TRUE));
                add(new Curso("002", "pdp", 3.0, 300.000, Boolean.TRUE));
                add(new Curso("003", "Modelos", 4.5, 300.000, Boolean.TRUE));
            }  
        };
    }

    public static List<Curso> getListaCursos() {
        return listaCursos;
    }

    public static void setListaCursos(List<Curso> aListaCursos) {
        listaCursos = aListaCursos;
    }
    
    
}
