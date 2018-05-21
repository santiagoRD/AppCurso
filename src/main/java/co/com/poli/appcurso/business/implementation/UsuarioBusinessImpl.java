
package co.com.poli.appcurso.business.implementation;

import co.com.poli.appcurso.business.IUsuarioBusiness;
import co.com.poli.appcurso.dao.implementation.UsuarioDaoImpl;
import co.com.poli.appcurso.model.Usuario;
import java.util.List;


public class UsuarioBusinessImpl implements IUsuarioBusiness{
    
    
    private UsuarioDaoImpl usuarioDaoImpl = new UsuarioDaoImpl();

    @Override
    public List<Usuario> ObtenerListaUsuarios() {
        return usuarioDaoImpl.ObtenerListaUsuarios();
    }

    @Override
    public Usuario obtenerUsuario(String documento) {
        return usuarioDaoImpl.obtenerUsuario(documento);
    }

    @Override
    public String crearUsuario(Usuario usuario) {
        String respuesta = "Usuario ya existe";
        Usuario user = obtenerUsuario(usuario.getDocumento());
        if (user==null) {
            respuesta = usuarioDaoImpl.crearUsuario(usuario);
        }
        return respuesta;
    }

    @Override
    public String modificarUsuario(Usuario usuario) {
        String respuesta = "Usuario no existe";
        Usuario user = obtenerUsuario(usuario.getDocumento());
        if (user!=null) {
            respuesta = usuarioDaoImpl.modificarUsuario(usuario);
        }
        return respuesta;
    }

    @Override
    public String eliminarUsuario(String documento) {
        String respuesta = "Usuario no existe";
        Usuario user = obtenerUsuario(documento);
        if (user!=null) {
            respuesta = usuarioDaoImpl.eliminarUsuario(documento);
        }
        return respuesta;
    }

    @Override
    public Usuario obtenerUsuario(String email, String clave) {
         return usuarioDaoImpl.obtenerUsuario(email, clave);
    }
    
}
