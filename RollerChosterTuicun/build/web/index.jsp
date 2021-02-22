<%@page import="Logica.Controladora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML>
<html>
	<head>
		<title>Roller Choster Tuicon</title>
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
		<!--[if lte IE 8]><link rel="stylesheet" href="css/ie/v8.css" /><![endif]-->
	</head>
	<body class="homepage">
            <%
            HttpSession myses = request.getSession();
            String usu = (String) request.getSession().getAttribute("usuario");
            if (usu==null){
            %>
            
            <!-- Header -->
			<div id="header">
				<div class="container">
						
					<!-- Logo -->
						<h1><a id="logo">Roller Choster Tuicun</a></h1>
					
					<!-- Nav -->
						<nav id="nav">
							<ul>
								<li><a href="index.jsp">Home</a></li>                                                              
								<li><a href="login.jsp">Login Cliente</a></li>                        
								<li><a href="loginempleado.jsp">Login Empleado</a></li>
                                                                <li><a href="juegos.jsp">Juegos</a></li>   
								
							</ul>
						</nav>


					<!-- Banner -->
						<div id="banner">
							<div class="container">
								<section>
									<header class="major">
										<h2>Bienvenidos!</h2>
										<span class="byline">&hellip; </span>
									</header>
									<a href="register.jsp" class="button alt">Registrate</a>
								</section>			
							</div>
						</div>

				</div>
			</div>

		<!-- Featured -->
			<div class="wrapper style2">
				<section class="container">
					<header class="major">
						<h2>Informacion de Roller Choster Tuicun</h2>
						<span class="byline">ESTO NO ES UNA COPIA AL JUEGO, SINO UNA MUESTRA DE AMOR HACIA EL (? </span>
					</header>
					<div class="row no-collapse-1">
						<section class="4u">
							<a class="image feature"><img src="images/covid.jpg" alt=""></a>
							<p>Debido a la pandemia de covid, la mayoria de nuestros empleados permanecen en su casas, y muchos de los jueg
                                                            permanecen cerrados para evitar mas contagios #entretodosnoscuidamos.</p>
						</section>
						<section class="4u">
							<a class="image feature"><img src="images/clock.png" alt=""></a>
							<p>Porfavor respetar los horarios de los juegos.</p>
						</section>
						<section class="4u">
							<a class="image feature"><img src="images/roller.png" alt=""></a>
                                                        <p>Disfrtura de nuestras atracciones! y si no jugaste al <a href="http://www.rollercoastertycoon.com/">Roller Coaster Tycoon</a>, te lo recomiendo.</p>
						</section>
	
					</div>
				</section>
			</div>

		<!-- Footer -->
			<div id="footer">
				<div class="container">

					<!-- Lists -->
						<div class="row">
							<div class="4u">
								<section>
									<header class="major">
										<h2>Info del Programador</h2>
										<span class="byline">Mariano Vanetta</span>
									</header>
									<ul class="contact">
										<li>
											<span class="location">Ubicacion:</span>
											<span> Cordoba Capital <br />Argentina</span>
										</li>
										<li>
											<span class="mail">Mail</span>
											<span><a href="#">vanettamariano@gmail.com</a></span>
										</li>
									</ul>	
								</section>
							</div>
						</div>


				</div>
			</div>
            <%
                
            }
            else{
             Controladora control = new Controladora();
             myses.setAttribute("control", control);
            %>
		<!-- Header -->
			<div id="header">
				<div class="container">
						
					<!-- Logo -->
						<h1><a id="logo">Roller Choster Tuicun</a></h1>
					
					<!-- Nav -->
						<nav id="nav">
							<ul>
								<li><a href="index.jsp">Home</a></li>
								<li><a href="info.jsp">Info</a></li>
                                                                <li><a href="lista.jsp">Mostrar empleados</a></li>
                                                                <li><a href="logout.jsp">LogOut</a></li>
							</ul>
						</nav>


					<!-- Banner -->
						<div id="banner">
							<div class="container">
								<section>
									<header class="major">
										<h2>Bienvenidos a Roller Choster Tuicun!</h2>
										<span class="byline">&hellip; </span>
									</header>
									<a href="juegos.jsp" class="button alt">Juegos</a>
								</section>			
							</div>
						</div>

				</div>
			</div>

		<!-- Featured -->
			<div class="wrapper style2">
				<section class="container">
					<header class="major">
						<h2>Informacion de Roller Choster Tuicun</h2>
						<span class="byline">ESTO NO ES UNA COPIA AL JUEGO, SINO UNA MUESTRA DE AMOR HACIA EL (? </span>
					</header>
					<div class="row no-collapse-1">
						<section class="4u">
							<a class="image feature"><img src="images/covid.jpg" alt=""></a>
							<p>Debido a la pandemia de covid, la mayoria de nuestros empleados permanecen en su casas, y muchos de los jueg
                                                            permanecen cerrados para evitar mas contagios #entretodosnoscuidamos.</p>
						</section>
						<section class="4u">
							<a class="image feature"><img src="images/clock.png" alt=""></a>
							<p>Porfavor respetar los horarios de los juegos.</p>
						</section>
						<section class="4u">
							<a class="image feature"><img src="images/roller.png" alt=""></a>
                                                        <p>Disfrtura de nuestras atracciones! y si no jugaste al <a href="http://www.rollercoastertycoon.com/">Roller Coaster Tycoon</a>, te lo recomiendo.</p>
						</section>
	
					</div>
				</section>
			</div>

		<!-- Footer -->
			<div id="footer">
				<div class="container">

					<!-- Lists -->
						<div class="row">
							<div class="4u">
								<section>
									<header class="major">
										<h2>Info del Programador</h2>
										<span class="byline">Mariano Vanetta</span>
									</header>
									<ul class="contact">
										<li>
											<span class="location">Ubicacion:</span>
											<span> Cordoba Capital <br />Argentina</span>
										</li>
										<li>
											<span class="mail">Mail</span>
											<span><a href="#">vanettamariano@gmail.com</a></span>
										</li>
									</ul>	
								</section>
							</div>
						</div>


				</div>
			</div>
    <%
     }
    %>        
	</body>
</html>