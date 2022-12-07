package br.com.github.lucasdevrj.platinado.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.github.lucasdevrj.platinado.acao.EditaCliente;
import br.com.github.lucasdevrj.platinado.acao.ExibeCliente;
import br.com.github.lucasdevrj.platinado.acao.ListaClientes;
import br.com.github.lucasdevrj.platinado.acao.NovoCliente;
import br.com.github.lucasdevrj.platinado.acao.RemoveCliente;
import br.com.github.lucasdevrj.platinado.modelo.BancoDados;

@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
		String acao = requisicao.getParameter("acao");
		String nome = null;
		
		if (acao.equals("ListaClientes")) {
			ListaClientes lista = new ListaClientes();
			nome = lista.executa(requisicao, resposta);
		} else if (acao.equals("RemoveCliente")) {
			RemoveCliente remove = new RemoveCliente();
			nome = remove.executa(requisicao, resposta);
		} else if (acao.equals("ExibeCliente")) {
			ExibeCliente exibe = new ExibeCliente();
			nome = exibe.executa(requisicao, resposta);
		} else if (acao.equals("EditaCliente")) {
			EditaCliente edita = new EditaCliente();
			nome = edita.executa(requisicao, resposta);
		} else if (acao.equals("NovoCliente")) {
			NovoCliente adiciona = new NovoCliente();
			nome = adiciona.executa(requisicao, resposta);
		}
		
		String[] tipoEndereco = nome.split(":");
				
		if (tipoEndereco[0].equals("forward")) {
			RequestDispatcher envio = requisicao.getRequestDispatcher(tipoEndereco[1]);
			envio.forward(requisicao, resposta);
		} else {
			resposta.sendRedirect(tipoEndereco[1]);
		}
	}
}
