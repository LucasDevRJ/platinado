package br.com.github.lucasdevrj.platinado.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Logout implements Acao {

	@Override
	public String executa(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
		
		HttpSession sessao = requisicao.getSession();
//		sessao.removeAttribute("usuario");
		sessao.invalidate();
		
		return "redirect:entrada?acao=FormularioLogin";
	}

}
