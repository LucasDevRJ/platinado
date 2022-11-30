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
						<li class="navegacao-link">LocalizaÃ§Ã£o</li>
						<li class="navegacao-link">Sobre</li>
					</ul>
				</nav>
			</header>
			
			<div class="agendado-conteudo">
				<div>
					<h2 class="agendado-texto">Olá ${nome} ${sobrenome}, você foi agendado com sucesso!</h2>
				</div>
				<div>
					<img class="agendado-imagem" alt="" src="img/agendado.png">
				</div>
			</div>
			
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
						<li class="navegacao-rodape-link">Localização</li>
						<li class="navegacao-rodape-link">Sobre</li>
					</ul>
				</nav>
			</footer>
		</body>
	</html>