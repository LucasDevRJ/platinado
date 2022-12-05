package br.com.github.lucasdevrj.platinado.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
		String acao = requisicao.getParameter("acao");
		
		if (acao.equals("listaClientes")) {
			System.out.println("Listando clientes");
		} else if (acao.equals("removeCliente")) {
			System.out.println("Removendo ciente");
		} else if (acao.equals("exibeCliente")) {
			System.out.println("Exibindo cliente");
		}
	}
}
