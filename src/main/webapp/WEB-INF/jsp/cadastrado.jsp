<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
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
		
		<main>
			<h2 class="logado-texto">Olá ${login}, você foi cadastrado com sucesso!</h2>
			
			<h2 class="logado-texto">Escolha se quer agendar o corte ou consultar seus agendamentos.</h2>
			
			<div class="agendado-imagens">
				<a href="/platinado/entrada?acao=NovoClienteFormulario">
					<img alt="" src="img/seta.png">
				</a>
				
				<a href="/platinado/entrada?acao=ListaClientes">
					<img alt="" src="img/lista.png">
				</a>
			</div>
		</main>
		
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