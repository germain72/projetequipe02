<%@ page language="java" contentType="text/html; charset=ISO-8859-1" isELIgnored="false"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

    <head>
        <!--  -->
        <title>Templete Fils Rouge</title>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- encodage de la page -->
        <!-- Chargement css de base -->
        <!-- Chargement de Bootstrap -->
        <!-- <!-- <link rel="stylesheet" media="all" type="text/css" href="/resources/bootstrap-3.3.7-dist/css/bootstrap.min.css" /> -->
        <!--<link rel="stylesheet" media="all" type="text/css" href="resources/css/bootstrap-3.3.7-dist/css/bootstrap.min.css" /><!-- -->
        <!--<link rel="stylesheet" media="all" type="text/css" href="resources/css/bootstrap-3.3.7-dist/css/theme.min.css" /><!-- -->
         <link href="<c:url value="/resources/bootstrap-3.3.7-dist/css/bootstrap.min.css" />" rel="stylesheet">
         <link href="<c:url value="/resources/bootstrap-3.3.7-dist/css/theme.min.css" />" rel="stylesheet">
        <!-- Chargement de mes feuilles css -->
        <!-- On charge toujour notre css pour surcharger les précédent -->
        <link rel="stylesheet" media="all" type="text/css" href="<c:url value="/resources/css/template.css" />" /> <!-- -->
        <!-- Le chargement du javascript peut bloquer la page 
donc on le mets en fin de page l'ors des test 
bootstrap à besin de jquery pour fonctionner-->
        <!--  -->
         <script src="<c:url value="/resources/js/jquery-1.11.3.min.js"/>"></script>
		 <script type="text/javascript" src="<c:url value="/resources/bootstrap-3.3.7-dist/js/bootstrap.min.js"/>" ></script>
    </head>

    <body>
        <nav class="navbar navbar-default m2i-navbar navbar-fixed-top">
            <div class="container-fluid">
                <div class="navbar-header">

                    <button type="button" class="navbar-toggle collapsed navbar-fixed-top" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
                            aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse navbar-left" id="bs-example-navbar-collapse-1">
                        <ul class="nav navbar-nav">
                            <li>
                                <a href="#">Link</a>
                            </li>
                            <li class="active">
                                <a href="#">Link
                                    <span class="sr-only">(current)</span>
                                </a>
                            </li>
                            <li>
                                <a href="#">Link</a>
                            </li>
                        </ul>
                    </div>
                    <!-- /.navbar-collapse -->
                    <a class="navbar-brand" href="#">
                        Brand
                    </a>
                </div>
                <ul class="nav navbar-nav navbar-right">
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">login
                            <span class="caret"></span>
                        </a>
                        <ul class="dropdown-menu">
                            <li>
                                <!-- Module de connection -->
                                Menu de connection
                            </li>
                            <li>
                                <a href="#">Action</a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
            <!-- /.container-fluid -->
        </nav>

        <!-- Fin des balise de la barre de navigations %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% -->
        <div class="m2i-body panel-body">

            <div class="jumbotron m2i-cover-onglet">
                <div>
                    <p>Accueil | Règle | Jeux </p>
                </div>
            </div>
            
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">Panel title</h3>
                </div>
                <div class="panel-body">
                    <p>
                        Accueil | Règle | Jeux 
                    </p>
                </div>

                <div class="panel-footer">
                    <span class="text-right">
                        Panel footer
                    </span>
                </div>
            </div>

            <div class="jumbotron m2i-cover-onglet">
                <div>
                    <p>Les meilleurs gâteaux prèès de chez vous</p>
                </div>
            </div>

            <div class="jumbotron m2i-cover-onglet">
                <div>
                    <p>Les meilleurs gâteaux prèès de chez vous</p>
                </div>
            </div>
        </div>

        <!-- Fin des balise de la page %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% -->

        <!-- Le chargement du javascript peut bloquer la page 
donc on le mets en fin de page l'ors des test 
bootstrap à besin de jquery pour fonctionner-->
        <!-- <!--   <script src="/resources/js/jquery-1.11.3.min.js" integrity="sha256-7LkWEzqTdpEfELxcZZlS6wAx5Ff13zZ83lYO2/ujj7g=" crossorigin="anonymous"></script> -->
        <script src="resources/js/jquery-1.11.3.min.js" integrity="sha256-7LkWEzqTdpEfELxcZZlS6wAx5Ff13zZ83lYO2/ujj7g=" crossorigin="anonymous"></script>
        <footer class="navbar navbar-inverse navbar-fixed-bottom m2i-footerbar">
            <div>
                <ul class="nav navbar-nav">
                    <li>
                        <a href="#">Action</a>
                    </li>
                    <li>
                        <p>copysddfs y</p>
                    </li>
                    <li>
                        <a href="#">Action</a>
                    </li>
                </ul>
            </div>
        </footer>
    </body>

</html>