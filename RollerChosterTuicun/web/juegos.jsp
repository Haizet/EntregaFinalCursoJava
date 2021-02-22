<%@page import="java.util.ArrayList"%>
<%@page import="Logica.Juego"%>
<%@page import="Logica.Empleado"%>
<%@page import="java.util.List"%>
<%@page import="Logica.Controladora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
	<head>
		<title>No Sidebar - Horizons by TEMPLATED</title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
		<!--[if lte IE 8]><script src="css/ie/html5shiv.js"></script><![endif]-->
		<script src="js/jquery.min.js"></script>
		<script src="js/jquery.dropotron.min.js"></script>
		<script src="js/skel.min.js"></script>
		<script src="js/skel-layers.min.js"></script>
		<script src="js/init.js"></script>
		<noscript>
			<link rel="stylesheet" href="css/skel.css" />
			<link rel="stylesheet" href="css/style.css" />
		</noscript>
                <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
                <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
                <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
                <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
                <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
                <style>
    .bs-example{
        margin: 20px;        
    }
</style>
		<!--[if lte IE 8]><link rel="stylesheet" href="css/ie/v8.css" /><![endif]-->
	</head>
	<body class="no-sidebar">
            <%
            HttpSession myses = request.getSession();
            String usu = (String) request.getSession().getAttribute("usuario");
            if (usu==null){
            %>

		<!-- Header -->
			<div id="header">
				<div class="container">
						
					<!-- Logo -->
						<h1><a id="logo">Juegos</a></h1>
					
					<!-- Nav -->
						<nav id="nav">
							<ul>
								<li><a href="index.jsp">Home</a></li>
								<li><a href="register.jsp">Register</a></li>
								<li><a href="login.jsp">Login</a></li>
							</ul>
						</nav>

				</div>
			</div>

		<!-- Main -->
			<div id="main" class="wrapper style1">
				<div class="container">
					<section>
						<header class="major">
							<h2>Juegos</h2>
							<span class="byline">Estos nuestros Juegos con sus Respectivos horarios</span>
						</header>
						<div class="list-group">
                                                        <a class="list-group-item list-group-item-action">
                                                            <div class="d-flex w-100 justify-content-between">
                                                                <h4>Calesita</h4>
                                                                <small>20 Entradas</small>
                                                            </div>
                                                            <median>Horarios:</median>
                                                            <p>Ideal para ñiños pequeños!</p>
                                                            <a class="image feature"><img src="images/calesita.png" alt="" height="425"></a>
                                                        </a>
                                                        <br>
                                                        <br>
                                                        <br>
                                                        <a class="list-group-item list-group-item-action active">
                                                            <div class="d-flex w-100 justify-content-between">
                                                                <h4>Zamba</h4>
                                                                <small>20 entradas</small>
                                                            </div>
                                                            <median>Horarios:</median>
                                                            <p>Quien se caera primero? Warning: no apto para personas faciles de marearse!</p>
                                                            <a class="image feature"><img src="images/zamba.jpeg" alt="" height="425"></a>
                                                        </a>
                                                        <br>
                                                        <br>
                                                        <br>
                                                        <a class="list-group-item list-group-item-action">
                                                            <div class="d-flex w-100 justify-content-between">
                                                                <h4>Montaña Truza</h4>
                                                                <small>10 entradas</small>
                                                            </div>
                                                            <median>Horarios:</median>
                                                            
                                                            <p>Si te gusta la adrenalina y quedar cabeza abajo, esto es para vos, no para mi!</p>
                                                            <a class="image feature"><img src="images/rollercoster.png" alt="" height="425"></a>
                                                        </a>
                                                </div>
					</section>
                                </div>
                        </div>
            <% 
            }
            else{
Controladora control = (Controladora) myses.getAttribute("control");

            %>
		<!-- Header -->
			<div id="header">
				<div class="container">
						
					<!-- Logo -->
						<h1><a id="logo">Juegos</a></h1>
					
					<!-- Nav -->
						<nav id="nav">
							<ul>
								<li><a href="index.jsp">Home</a></li>
                                                                <li><a href="info.jsp">Info</a></li>
                                                                <li><a href="logout.jsp">LogOut</a></li>
							</ul>
						</nav>

				</div>
			</div>

		<!-- Main -->
			<div id="main" class="wrapper style1">
				<div class="container">
					<section>
						<header class="major">
							<h2>Juegos</h2>
							<span class="byline">Estos nuestros Juegos con sus Respectivos horarios</span>
						</header>
						<div class="list-group">
                                                        <a class="list-group-item list-group-item-action">
                                                            <div class="d-flex w-100 justify-content-between">
                                                                <h4>Calesita</h4>
                                                                <small>20 Entradas</small>
                                                            </div>
                                                            <median>Horarios:</median>
                                                            <p>Ideal para ñiños pequeños!</p>
                                                            <a class="image feature"><img src="images/calesita.png" alt="" height="425"></a>
                                                        </a>
                                                        <button type="button" class="btn btn-primary btn-lg btn-block" width="200">Comprar Entrada para la CALESITA!</button>
                                                        <br>
                                                        <br>
                                                        <br>
                                                        <a class="list-group-item list-group-item-action active">
                                                            <div class="d-flex w-100 justify-content-between">
                                                                <h4>Zamba</h4>
                                                                <small>20 entradas</small>
                                                            </div>
                                                            <median>Horarios:</median>
                                                            <p>Quien se caera primero? Warning: no apto para personas faciles de marearse!</p>
                                                            <a class="image feature"><img src="images/zamba.jpeg" alt="" height="425"></a>
                                                        </a>
                                                        <button type="button" class="btn btn-primary btn-lg btn-block">Comprar Entrada para el ZAMBA</button>
                                                        <br>
                                                        <br>
                                                        <br>
                                                        <a class="list-group-item list-group-item-action">
                                                            <div class="d-flex w-100 justify-content-between">
                                                                <h4>Montaña Truza</h4>
                                                                <small>10 entradas</small>
                                                            </div>
                                                            <median>Horarios:</median>
                                                            
                                                            <p>Si te gusta la adrenalina y quedar cabeza abajo, esto es para vos, no para mi!</p>
                                                            <a class="image feature"><img src="images/rollercoster.png" alt="" height="425"></a>
                                                        </a>
                                                        <button type="button" class="btn btn-primary btn-lg btn-block">Comprar Entrada para la MONTAÑA TRUZA</button>
                                                </div>
                                            <div>
                                                 <table class="table table-bordered" id="dataTable" name="tablita" width="100%" cellspacing="0">
                  <thead>
                    <tr>
                      <th>Nombre juego</th>
                                            <th>Nombre</th>
                      <th>Apellido</th>
                      <th>Edad</th>
                     </tr>
                  </thead>
                  
                  <tbody>
                    <tr>
                        <%		
		List<Empleado> listEmp = new ArrayList<Empleado>();
		List<Juego> listaJuego = control.getJuegos();
                    for (Juego jue : listaJuego) {
                        listEmp = jue.getListEmpleado();
                            for (Empleado emp : listEmp){
                                  %>
                      <td><%=jue.getNombrejuego()%></td>
                      <td><%=emp.getNombre()%></td>
                      <td><%=emp.getApellido()%></td>
                      <td><%=emp.getEdad()%></td>
                      
                    </tr>
                                       
                      <% }} %>
                  </tbody>
                </table>
                                                
                                                
                                                
                                            </div>
					</section>
                                </div>
                        </div>

                <%
            }
            %>
	</body>
</html>