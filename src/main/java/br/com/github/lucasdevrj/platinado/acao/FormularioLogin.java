package br.com.github.lucasdevrj.platinado.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormularioLogin implements Acao {

	@Override
	public String executa(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
		return "forward:login.jsp";
	}

}
