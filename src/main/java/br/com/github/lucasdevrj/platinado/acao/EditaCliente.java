package br.com.github.lucasdevrj.platinado.acao;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.github.lucasdevrj.platinado.modelo.BancoDados;
import br.com.github.lucasdevrj.platinado.modelo.Cliente;

public class EditaCliente {

	public void executa(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
		String nome = requisicao.getParameter("nome");
		String sobrenome = requisicao.getParameter("sobrenome");
		String email = requisicao.getParameter("email");
		String celular = requisicao.getParameter("celular");
		String data = requisicao.getParameter("dataAgendamento");
		String parametroId = requisicao.getParameter("id");
		Integer id = Integer.valueOf(parametroId);
		
		Date dataAgendamento = null;
		
		try {
			SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy");
			dataAgendamento = dataFormatada.parse(data);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		BancoDados bancoDados = new BancoDados();
		Cliente cliente = bancoDados.pesquisaCliente(id);
		cliente.setNome(nome);
		cliente.setSobrenome(sobrenome);
		cliente.setEmail(email);
		cliente.setCelular(celular);
		cliente.setDataAgendamento(dataAgendamento);
		
		System.out.println("Cliente editado: " + id);
		
		resposta.sendRedirect("entrada?acao=ListaClientes");
	}
}
