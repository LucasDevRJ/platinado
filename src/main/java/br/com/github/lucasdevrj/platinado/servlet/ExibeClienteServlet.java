package br.com.github.lucasdevrj.platinado.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/exibeCliente")
public class ExibeClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
		String parametroId = requisicao.getParameter("id");
		Integer id = Integer.valueOf(parametroId);
		
		BancoDados bancoDados = new BancoDados();
		
		Cliente cliente = bancoDados.pesquisaCliente(id);
		
		requisicao.setAttribute("cliente", cliente);
		
		RequestDispatcher envia = requisicao.getRequestDispatcher("/editaAgenda.jsp");
		envia.forward(requisicao, resposta);
	}

}
