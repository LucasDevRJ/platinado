package br.com.github.lucasdevrj.platinado.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovoAgendamentoServlet
 */
@WebServlet("/novoAgendamento")
public class NovoAgendamentoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
		PrintWriter saida = resposta.getWriter();
		String nome = requisicao.getParameter("nome");
		String sobrenome = requisicao.getParameter("sobrenome");
		
		saida.println("<html>");
		saida.println("<body>");
		saida.println("<p>Olá " + nome + " " + sobrenome + ", você foi agendado com sucesso!</p>");
		saida.println("<a href='agendamento.html'>Voltar.</a>");
		saida.println("</body>");
		saida.println("</html>");
		
		System.out.println("Agendamento cloncluído!");
	}

}
