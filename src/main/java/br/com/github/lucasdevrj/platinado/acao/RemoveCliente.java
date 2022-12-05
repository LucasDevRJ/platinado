package br.com.github.lucasdevrj.platinado.acao;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.github.lucasdevrj.platinado.modelo.BancoDados;

public class RemoveCliente {

	public void executa(HttpServletRequest requisicao, HttpServletResponse resposta) throws IOException {
		String parametroId = requisicao.getParameter("id");
		Integer id = Integer.valueOf(parametroId);
		
		System.out.println("Remoção do cliente: " + id);
		
		BancoDados bancoDados = new BancoDados();
		bancoDados.removeCliente(id);
		
		System.out.println("Cliente removido: " + id);
		
		resposta.sendRedirect("entrada?acao=ListaClientes");
	}
}
