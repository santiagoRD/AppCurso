
package co.com.poli.appcurso.controller;

import co.com.poli.appcurso.business.implementation.UsuarioBusinessImpl;
import co.com.poli.appcurso.model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class UsuariosServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        RequestDispatcher rd = null;
        UsuarioBusinessImpl uBusinessImpl = new UsuarioBusinessImpl();
        String accion = request.getParameter("accion");
        switch (accion) {
            case "crear":
                String documento = request.getParameter("txtdocumento");
                String nombres = request.getParameter("txtnombres");
                String apellidos = request.getParameter("txtapellidos");
                String email = request.getParameter("txtemail");
                String clave = request.getParameter("txtclave");
                Boolean estado = Boolean.valueOf(request.getParameter("txtestado"));
                String rol = request.getParameter("txtrol");
                Usuario usuario = new Usuario(documento, nombres, apellidos, email, clave, rol, estado);
                
                String mensaje = uBusinessImpl.crearUsuario(usuario);
                session.setAttribute("MENSAJE", mensaje);
                rd = request.getRequestDispatcher("/mensaje.jsp");
                break;
            case "eliminar":
                String idUser = request.getParameter("idUser");
                uBusinessImpl.eliminarUsuario(idUser);
                List<Usuario> listaUsuarios = uBusinessImpl.ObtenerListaUsuarios();
                session.setAttribute("LISTADO", listaUsuarios);
                rd = request.getRequestDispatcher("/views/usuarioslista.jsp");
                break;
            case "modificar":
                String id = request.getParameter("txtdocumento");
                Usuario user = uBusinessImpl.obtenerUsuario(id);
                session.setAttribute("MODIFICADO", user);
                rd = request.getRequestDispatcher("/views/actualizarusuario.jsp");
                break;
                
            case "guardar":
                String documentom = request.getParameter("txtdocumento");
                String nombresm = request.getParameter("txtnombres");
                String apellidosm = request.getParameter("txtapellidos");
                String emailm = request.getParameter("txtemail");
                String clavem = request.getParameter("txtclave");
                Boolean estadom = Boolean.valueOf(request.getParameter("txtestado"));
                String rolm = request.getParameter("txtrol");
                Usuario usuariom = new Usuario(documentom, nombresm, apellidosm, emailm, clavem, rolm, estadom);
                String ms = uBusinessImpl.modificarUsuario(usuariom);
                List<Usuario> listaUsuariosm = uBusinessImpl.ObtenerListaUsuarios();
                session.setAttribute("LISTADO", listaUsuariosm);
                rd = request.getRequestDispatcher("/views/usuarioslista.jsp");
                break;
            case "listar":
                List<Usuario> listaUsuarios2 = uBusinessImpl.ObtenerListaUsuarios();
                session.setAttribute("LISTADO", listaUsuarios2);
                rd = request.getRequestDispatcher("/views/usuarioslista.jsp");
                break;
            default:
                break;
        }
        rd.forward(request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
