package br.com.github.lucasdevrj.platinado.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/clientes")
public class ClientesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
		BancoDados bancoDados = new BancoDados();
		List<Cliente> clientes = bancoDados.getClientes();
		
		PrintWriter saida = resposta.getWriter();
		
		saida.println("<html>");
		saida.println("<body>");
		saida.println("<ul>");
		
		for (Cliente cliente : clientes) {
			saida.println("<li>");
			saida.println("<p>Nome: " + cliente.getNome() + "</p>");
			saida.println("<p>Sobrenome: " + cliente.getSobrenome() + "</p>");
			saida.println("<p>E-mail: " + cliente.getEmail() + "</p>");
			saida.println("<p>Celular: " + cliente.getCelular() + "</p>");
			saida.println("</li>");
		}
		
		saida.println("</ul>");
		saida.println("</body>");
		saida.println("</html>");
	}

}
