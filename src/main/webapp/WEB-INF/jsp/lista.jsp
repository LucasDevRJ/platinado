<%@ page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page import="br.com.github.lucasdevrj.platinado.modelo.Cliente"%>
<%@ page import="java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>Platinado</title>
			<link rel="stylesheet" href="css/reset.css">
			<link href="css/style.css" rel="stylesheet" type="text/css">
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
			
			<div class="conteudo-clientes">
				<c:forEach items="${clientes}" var="cliente">
				 	<ul class="clientes">
					 		<li>
					 			<fmt:formatDate value="${cliente.dataAgendamento}" var="dataAgendamento" pattern="dd/MM/yyyy"/>
					 			<p>Nome: ${cliente.nome}</p>
					 			<p>Sobrenome: ${cliente.sobrenome}</p>
					 			<p>E-mail: ${cliente.email}</p>
					 			<p>Celular: ${cliente.celular}</p>
					 			<p>Data: ${dataAgendamento}</p>
					 			<div class="clientes-icones">
					 				<a href="/platinado/entrada?acao=ExibeCliente&id=${cliente.id}">
					 					<img alt="" src="img/lapis.png">
					 				</a>
					 				
					 				<a href="/platinado/entrada?acao=RemoveCliente&id=${cliente.id}">
					 					<img alt="" src="img/excluir.png">
					 				</a>
					 			</div>
					 		</li>
				 		</ul>
			 	</c:forEach>
			</div>
			 
			  <div class="agendado-imagens">
				<a href="/platinado/entrada?acao=NovoClienteFormulario">
					<img alt="" src="img/seta.png">
				</a>
				
				<a href="/platinado/entrada?acao=ListaClientes">
					<img alt="" src="img/lista.png">
				</a>
			</div>
			
			<footer class="rodape">
				<img class="logo-rodape" alt="" src="img/logo-rodape.png">
				<nav>
					<ul class="navegacao-rodape">
						<li class="navegacao-rodape-link">Principal</li>
						<li class="navegacao-rodape-link">Galeria</li>
						<li class="navegacao-rodape-link">Localização</li>
						<li class="navegacao-rodape-link">Sobre</li>
					</ul>
				</nav>
			</footer>
		</body>
	</html>