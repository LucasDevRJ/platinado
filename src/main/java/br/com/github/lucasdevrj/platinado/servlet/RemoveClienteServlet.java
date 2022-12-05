package br.com.github.lucasdevrj.platinado.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.github.lucasdevrj.platinado.modelo.BancoDados;

//@WebServlet("/removeCliente")
public class RemoveClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
		String parametroId = requisicao.getParameter("id");
		Integer id = Integer.valueOf(parametroId);
		
		System.out.println(id);
		
		BancoDados bancoDados = new BancoDados();
		bancoDados.removeCliente(id);
		
		resposta.sendRedirect("clientes");
	}

}
