package br.com.github.lucasdevrj.platinado.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.github.lucasdevrj.platinado.modelo.BancoDados;
import br.com.github.lucasdevrj.platinado.modelo.Cliente;

public class ListaClientes {

	public void executa(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
		System.out.println("Listando clientes");
		
		BancoDados bancoDados = new BancoDados();
		List<Cliente> clientes = bancoDados.getClientes();
		
		requisicao.setAttribute("clientes", clientes);
		
//		resposta.sendRedirect("lista");
		
		RequestDispatcher envio = requisicao.getRequestDispatcher("/lista.jsp");
		envio.forward(requisicao, resposta);
		
		System.out.println(clientes.toString());
	}
}