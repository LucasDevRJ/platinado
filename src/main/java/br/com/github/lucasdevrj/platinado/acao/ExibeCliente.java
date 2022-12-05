package br.com.github.lucasdevrj.platinado.acao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.github.lucasdevrj.platinado.modelo.BancoDados;
import br.com.github.lucasdevrj.platinado.modelo.Cliente;

public class ExibeCliente {

	public void executa(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
		String parametroId = requisicao.getParameter("id");
		Integer id = Integer.valueOf(parametroId);
		
		BancoDados bancoDados = new BancoDados();
		
		Cliente cliente = bancoDados.pesquisaCliente(id);
		
		requisicao.setAttribute("cliente", cliente);
		
		System.out.println("Cliente exibido: " + id);
		
		RequestDispatcher envia = requisicao.getRequestDispatcher("/editaAgenda.jsp");
		envia.forward(requisicao, resposta);
	}
}
