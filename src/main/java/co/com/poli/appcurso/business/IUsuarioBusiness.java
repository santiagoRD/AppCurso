
package co.com.poli.appcurso.business;

import co.com.poli.appcurso.model.Usuario;
import java.util.List;


public interface IUsuarioBusiness {

    List<Usuario> ObtenerListaUsuarios();
    Usuario obtenerUsuario(String documento);
    String crearUsuario(Usuario usuario);
    String modificarUsuario(Usuario usuario);
    String eliminarUsuario(String documento);
    Usuario obtenerUsuario(String email, String clave);
}
