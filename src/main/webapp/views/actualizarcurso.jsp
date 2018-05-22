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
            <a class="navbar-brand" href="#">AppCursos</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
        </nav>

        <main role="main">

            <!-- Main jumbotron for a primary marketing message or call to action -->
            <div class="jumbotron" >
                <div class="container" >
                    <form method="post"
                          action="${pageContext.servletContext.contextPath}/CursoServlet">
                        <div class="form-row">
                            <div class="col">
                                <input name="txtidcurso" type="text" 
                                       class="form-control"
                                       readonly="readonly"
                                       value="${sessionScope.MODIFICADO.getIdCurso()}">
                            </div>
                            <div class="col">
                                <input name="txtnombre" type="text" 
                                       class="form-control" 
                                       value="${sessionScope.MODIFICADO.getNombre()}">
                            </div>

                        </div>
                        <div class="form-row">
                            <div class="col">
                                <input name="txthoras" type="text" 
                                       class="form-control" 
                                       value="${sessionScope.MODIFICADO.getHoras()}">
                            </div>
                            <div class="col">
                                <input name="txtvalor" type="text" 
                                       class="form-control" 
                                       value="${sessionScope.MODIFICADO.getValorCurso()}">
                            </div>

                        </div>
                        <div class="form-row">
                            <div class="col">
                                <select name="txtestado" id="inputState" class="form-control">
                                    <option value="true">Activo</option>
                                    <option value="false" >Inactivo</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="col">
                                <button name="accion" value="guardar" 
                                        type="submit" 
                                        class="btn btn-primary">
                                    Actualizar</button>
                                <a class="btn btn-primary"
                                   href="${pageContext.servletContext.contextPath}/views/cursolista.jsp"
                                   >Volver</a>
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