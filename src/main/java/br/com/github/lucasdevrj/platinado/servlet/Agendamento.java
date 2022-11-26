package br.com.github.lucasdevrj.platinado.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/agendamento")
public class Agendamento extends HttpServlet {//Classe para estender Servlet http

	@Override//método que pega a requisição do usuário e devolve a resposta
	protected void service(HttpServletRequest requisicao, HttpServletResponse resposta) throws IOException {
		//Escrevendo no html com Servlet
		PrintWriter saida = resposta.getWriter();
		saida.println("<html>");
		saida.println("<body>");
		saida.println("<p>Escrevendo no html com servlet</p>");
		saida.println("</body>");
		saida.println("</html>");
		
		System.out.println("O Servlet foi chamado!");
	}
}
