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

public class FormularioLogin implements Acao{

	public String executa(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
		
		
		return "forward:login.jsp";
	}
}
