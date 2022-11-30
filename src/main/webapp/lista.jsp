<%@ page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page import="br.com.github.lucasdevrj.platinado.servlet.Cliente"%>
<%@ page import="java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>Platinado</title>
			<link rel="stylesheet" href="css/reset.css">
			<link rel="stylesheet" href="css/style.css">
		</head>
		
		<body>
			<header class="cabecalho">
				<h1><img class="logo" src="img/logo.png"/></h1>
				<nav>
					<ul class="navegacao">
						<li class="navegacao-link">Principal</li>
						<li class="navegacao-link">Galeria</li>
						<li class="navegacao-link">Localização</li>
						<li class="navegacao-link">Sobre</li>
					</ul>
				</nav>
			</header>
			
			 
			 <ul class="clientes">
			 	<c:forEach items="${clientes}" var="cliente">
			 		<li>
			 			<p>Nome: ${cliente.nome}</p>
			 			<p>Nome: ${cliente.sobrenome}</p>
			 			<p>Nome: ${cliente.email}</p>
			 			<p>Nome: ${cliente.celular}</p>
			 		</li>
			 	</c:forEach>
			 </ul>
			 
			  <div class="agendado-imagens">
				<a href="agendamento.html">
					<img alt="" src="img/seta.png">
				</a>
				
				<a href="/platinado/clientes">
					<img alt="" src="img/lista.png">
				</a>
			</div>
			
			<footer class="rodape">
				<img class="logo-rodape" alt="" src="img/logo-rodape.png">
				<nav>
					<ul class="navegacao-rodape">
						<li class="navegacao-rodape-link">Principal</li>
						<li class="navegacao-rodape-link">Galeria</li>
						<li class="navegacao-rodape-link">Localiza��o</li>
						<li class="navegacao-rodape-link">Sobre</li>
					</ul>
				</nav>
			</footer>
		</body>
	</html>