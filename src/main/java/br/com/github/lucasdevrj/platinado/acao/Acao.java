package br.com.github.lucasdevrj.platinado.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Acao {

	public String executa(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException;
}
