<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/novoAgendamento" var="enderecoServletNovoAgendamento"/>

<!DOCTYPE html>
<html>
	<head>
		<title>Platinado | Agenda</title>
		<meta charset="UTF-8">
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
		
		<form action="${enderecoServletNovoAgendamento}" method="POST">
			<div class="formulario">
				<h2>Agende seu corte!</h2>
				
				<div class="formulario-campo">
					<label for="nome">Nome:</label>
					<input type="text" name="nome" placeholder="Digite seu nome"/ required>
				</div>
				
				<div class="formulario-campo">
					<label for="sobrenome">Sobrenome:</label>
					<input type="text" name="sobrenome" placeholder="Digite seu sobrenome" required/>
				</div>
				
				<div class="formulario-campo">
					<label for="email">E-mail:</label>
					<input type="email" name="email" placeholder="Digite seu e-mail" required/>
				</div>
				
				<div class="formulario-campo">
					<label for="celular">Celular:</label>
					<input type="tel" name="celular" placeholder="Digite seu número de celular" required/>
				</div>
				
				<div>
					<input class="botao" type="submit"/>
				</div>
				
				<img class="formulario-imagem" alt="" src="img/formulario.jpg">
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