package co.com.poli.appcurso.dao.implementation;

import co.com.poli.appcurso.dao.IUsuarioDao;
import co.com.poli.appcurso.data.UsuarioData;
import co.com.poli.appcurso.model.Usuario;
import java.util.List;


public class UsuarioDaoImpl implements IUsuarioDao {

    @Override
    public List<Usuario> ObtenerListaUsuarios() {
        return UsuarioData.getListaUsuarios();
    }

    @Override
    public Usuario obtenerUsuario(String documento) {
        Usuario usuario = null;
        List<Usuario> listaUsuarios = UsuarioData.getListaUsuarios();
        for (Usuario userList : listaUsuarios) {
            if (userList.getDocumento().equals(documento)) {
                usuario = userList;
            }

        }
        return usuario;
    }

    @Override
    public String crearUsuario(Usuario usuario) {
        List<Usuario> listaUsuarios = UsuarioData.getListaUsuarios();
        listaUsuarios.add(usuario);
        UsuarioData.setListaUsuarios(listaUsuarios);
        return "Usuario creado";
    }

    @Override
    public String modificarUsuario(Usuario usuario) {
        List<Usuario> listaUsuarios = UsuarioData.getListaUsuarios();
        listaUsuarios.set(listaUsuarios.indexOf(usuario), usuario);
        UsuarioData.setListaUsuarios(listaUsuarios);
        return "Usuario Modificado";
    }

    @Override
    public String eliminarUsuario(String documento) {
        List<Usuario> listaUsuarios = UsuarioData.getListaUsuarios();
        listaUsuarios.remove(obtenerUsuario(documento));
        UsuarioData.setListaUsuarios(listaUsuarios);
        return "Usuario Eliminado";
    }

    @Override
    public Usuario obtenerUsuario(String email, String clave) {
        Usuario usuario = null;
        List<Usuario> listaUsuarios = UsuarioData.getListaUsuarios();
        for (Usuario userList : listaUsuarios) {
            if ((userList.getEmail().equals(email))
                    && (userList.getClave().equals(clave))) {
                usuario = userList;
            }
        }
        return usuario;
    }

}
