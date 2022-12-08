<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada" var="enderecoServletLogin"/>
<c:url value="/entrada?acao=NovoUsuario" var="enderecoServletNovoUsuario"/>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Entre</title>
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
		
		<form action="${enderecoServletLogin}" method="POST">
			<div class="formulario">
				<div class="formulario-campo">
					<label for="usuario">Usuário:</label>
					<input type="text" name="usuario" placeholder="Digite seu nome de usuário" required="required">
				</div>
				
				<div class="formulario-campo">
					<label for="senha">Senha:</label>
					<input type="password" name="senha" placeholder="Digite a sua senha de usuário" required="required">
				</div>
				
				<div>
					<input name="acao" value="Login" class="botao" type="submit">
				</div>
				
				<div class="conta">
					Não possui conta? <a href="${enderecoServletNovoUsuario}">Crie aqui</a>
				</div>
			</div>
		</form>
		
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