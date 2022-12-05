package br.com.github.lucasdevrj.platinado.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.github.lucasdevrj.platinado.modelo.BancoDados;
import br.com.github.lucasdevrj.platinado.modelo.Cliente;

@WebServlet("/exibeAgendamento")
public class exibeAgendamentoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
		String parametroId = requisicao.getParameter("id");
		Integer id = Integer.valueOf(parametroId);

		BancoDados banco = new BancoDados();

		Cliente cliente = banco.pesquisaCliente(id);

		System.out.println(cliente.getNome());

		requisicao.setAttribute("cliente", cliente);

		RequestDispatcher rd = requisicao.getRequestDispatcher("/editaAgenda.jsp");
		rd.forward(requisicao, resposta);
	}

}
