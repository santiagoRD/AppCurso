<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="../../../../favicon.ico">

        <title>Menu</title>

        <!-- Bootstrap core CSS -->
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" rel="stylesheet">
        <!-- Custom styles for this template -->
        <link href="${pageContext.servletContext.contextPath}/css/jumbotron.css" rel="stylesheet">
    </head>

    <body>

        <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">
            <a class="navbar-brand" href="${pageContext.servletContext.contextPath}/views/Menu.jsp">AppCursos</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarsExampleDefault">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="${pageContext.servletContext.contextPath}/views/usuario.jsp">
                            Usuarios<span class="sr-only">(current)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.servletContext.contextPath}/views/cursos.jsp">Cursos</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.servletContext.contextPath}/UsuariosServlet?accion=listar">Listar usuarios</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.servletContext.contextPath}/CursoServlet?accion=listar">Listar Cursos</a>
                    </li>
                </ul>
            </div>
        </nav>

        <main role="main">

            <!-- Main jumbotron for a primary marketing message or call to action -->
            <div class="jumbotron">
                <div class="container">
                    <form method="post"
                          action="${pageContext.servletContext.contextPath}/UsuariosServlet">
                        <div class="form-row">
                            <div class="col">
                                <input name="txtdocumento" type="text" 
                                       class="form-control" 
                                       placeholder="Documento">
                            </div>
                            <div class="col"></div>
                        </div>
                        <div class="form-row">
                            <div class="col">
                                <input name="txtnombres" type="text" 
                                       class="form-control" 
                                       placeholder="Nombres">
                            </div>
                            <div class="col">
                                <input name="txtapellidos" type="text" 
                                       class="form-control" 
                                       placeholder="Apellidos">
                            </div>

                        </div>
                        <div class="form-row">
                            <div class="col">
                                <input name="txtemail" type="text" 
                                       class="form-control" 
                                       placeholder="Email">
                            </div>
                            <div class="col">
                                <input name="txtclave" type="text" 
                                       class="form-control" 
                                       placeholder="Clave">
                            </div>

                        </div>
                        <div class="form-row">
                            <div class="col">
                                <select name="txtestado" id="inputState" class="form-control">
                                    <option value="activo" selected>Activo</option>
                                    <option value="inactivo" >Inactivo</option>
                                </select>
                            </div>
                            <div class="col">
                                <select name="txtrol" id="inputState" class="form-control">
                                    <option value="administrador" selected>ADMIN</option>
                                    <option value="consulta" >Consulta</option>
                                    <option value="visitante" >Visitante</option>
                                </select>
                            </div>

                        </div>
                        <div class="form-row">
                            <div class="col">
                                <button name="accion" value="crear" 
                                        type="submit" 
                                         class="btn btn-primary">
                                     Registrar</button>
                            </div>

                        </div>
                    </form>
                </div>
            </div>

            <!-- Example row of columns -->

            <hr>

            </div> <!-- /container -->

        </main>

        <footer class="container">
            <p>&copy; Company 2017-2018</p>
        </footer>

        <!-- Bootstrap core JavaScript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>

    </body>
</html>
