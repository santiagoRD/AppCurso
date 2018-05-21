
package co.com.poli.appcurso.data;

import co.com.poli.appcurso.model.Usuario;
import java.util.ArrayList;
import java.util.List;


public class UsuarioData {
    

    private static List<Usuario> listaUsuarios;
    
    static{
        listaUsuarios = new ArrayList<Usuario>(){
            {
                add(new Usuario("101", "Santiago", "Rios", "santir@gmail.com", 
                                       "123", "ADMIN", Boolean.TRUE));
                add(new Usuario("202", "Mateo", "Diaz", "mateod@gmail.com", 
                                       "123", "CONSULTA", Boolean.TRUE));
                add(new Usuario("303", "Diego", "Lopez", "diegol@gmail.com", 
                                       "123", "CONSULTA", Boolean.TRUE));
            }  
        };
    }

    public static List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public static void setListaUsuarios(List<Usuario> aListaUsuarios) {
        listaUsuarios = aListaUsuarios;
    }
    
    
}
