package br.com.github.lucasdevrj.platinado.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.github.lucasdevrj.platinado.modelo.BancoDados;
import br.com.github.lucasdevrj.platinado.modelo.Cliente;

public class NovoCliente {

	public void executa(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
		String nome = requisicao.getParameter("nome");
		String sobrenome = requisicao.getParameter("sobrenome");
		String email = requisicao.getParameter("email");
		String celular = requisicao.getParameter("celular");
		String data = requisicao.getParameter("dataAgendamento");
		
		Date dataAgendamento = null;
		
		try {
			SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
			dataAgendamento = dataFormatada.parse(data);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		Cliente cliente = new Cliente(nome, sobrenome, celular, email);
		cliente.setDataAgendamento(dataAgendamento);
		
		BancoDados bancoDados = new BancoDados();
		bancoDados.adicionaCliente(cliente);
		
		requisicao.setAttribute("nome", cliente.getNome());
		requisicao.setAttribute("sobrenome", cliente.getSobrenome());
		requisicao.setAttribute("email", cliente.getEmail());
		requisicao.setAttribute("celular", cliente.getCelular());
		
		resposta.sendRedirect("entrada?acao=ListaClientes");
		
		System.out.println(cliente.toString());
		System.out.println(bancoDados.getClientes().size());
	}
}
