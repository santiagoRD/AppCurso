
package co.com.poli.appcurso.controller;

import co.com.poli.appcurso.business.implementation.CursoBusinessImpl;
import co.com.poli.appcurso.business.implementation.UsuarioBusinessImpl;
import co.com.poli.appcurso.model.Curso;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class CursoServlet extends HttpServlet {

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
        CursoBusinessImpl cBusinessImpl = new CursoBusinessImpl();
        String accion = request.getParameter("accion");
        switch (accion) {
            case "crear":
                String idCurso = request.getParameter("txtidcurso");
                String nombre = request.getParameter("txtnombre");
                Double horas = Double.valueOf(request.getParameter("txthoras"));
                Double valor = Double.valueOf(request.getParameter("txtvalor"));
                Boolean estado = Boolean.valueOf(request.getParameter("txtestado"));
                Curso curso = new Curso(idCurso, nombre, horas, valor, estado);

                String mensaje = cBusinessImpl.crearCurso(curso);
                session.setAttribute("MENSAJE", mensaje);
                rd = request.getRequestDispatcher("/mensaje.jsp");
                break;
            case "eliminar":
                String idcurso = request.getParameter("txtidcurso");
                String msj = cBusinessImpl.eliminarCurso(idcurso);
                List<Curso> listaCurso = cBusinessImpl.ObtenerListaCursos();
                session.setAttribute("LISTADO", listaCurso);
                rd = request.getRequestDispatcher("/views/cursolista.jsp");
                break;
            case "modificar":
                String id = request.getParameter("txtidcurso");
                Curso curs = cBusinessImpl.obtenerCurso(id);
                session.setAttribute("MODIFICADO", curs);
                rd = request.getRequestDispatcher("/views/actualizarcurso.jsp");
                break;
            case "guardar":
                String idCursom = request.getParameter("txtidcurso");
                String nombrem = request.getParameter("txtnombre");
                Double horasm = Double.valueOf(request.getParameter("txthoras"));
                Double valorm = Double.valueOf(request.getParameter("txtvalor"));
                Boolean estadom = Boolean.valueOf(request.getParameter("txtestado"));
                Curso cursom = new Curso(idCursom, nombrem, horasm, valorm, estadom);
                String ms = cBusinessImpl.modificarCurso(cursom);
                List<Curso> listaCursosm = cBusinessImpl.ObtenerListaCursos();
                session.setAttribute("LISTADO", listaCursosm);
                rd = request.getRequestDispatcher("/views/cursolista.jsp");
                break;
            case "listar":
                List<Curso> listaCursos = cBusinessImpl.ObtenerListaCursos();
                session.setAttribute("LISTADO", listaCursos);
                rd = request.getRequestDispatcher("/views/cursolista.jsp");
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
