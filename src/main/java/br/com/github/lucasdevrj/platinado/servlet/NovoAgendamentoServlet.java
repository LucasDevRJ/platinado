package br.com.github.lucasdevrj.platinado.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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

	protected void doPost(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
		String nome = requisicao.getParameter("nome");
		String sobrenome = requisicao.getParameter("sobrenome");
		String email = requisicao.getParameter("email");
		String celular = requisicao.getParameter("celular");
		
		Cliente cliente = new Cliente(nome, sobrenome, celular, email);
		
		BancoDados bancoDados = new BancoDados();
		bancoDados.adicionaCliente(cliente);
		
		RequestDispatcher envio = requisicao.getRequestDispatcher("/agendado.jsp");
		requisicao.setAttribute("nome", cliente.getNome());
		requisicao.setAttribute("sobrenome", cliente.getSobrenome());
		requisicao.setAttribute("email", cliente.getEmail());
		requisicao.setAttribute("celular", cliente.getCelular());
		envio.forward(requisicao, resposta);
		
		System.out.println(cliente.toString());
		System.out.println(bancoDados.getClientes().size());
	}

}
