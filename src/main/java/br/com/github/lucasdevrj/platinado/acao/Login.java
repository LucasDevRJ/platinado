package br.com.github.lucasdevrj.platinado.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.github.lucasdevrj.platinado.modelo.BancoDados;
import br.com.github.lucasdevrj.platinado.modelo.Usuario;

public class Login implements Acao {

	@Override
	public String executa(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
		String login = requisicao.getParameter("login");
		String senha = requisicao.getParameter("senha");
		
		BancoDados bancoDados = new BancoDados();
		Usuario usuario = bancoDados.existeUsuario(login, senha);
		
		System.out.println(bancoDados.getUsuarios());
		
		if (usuario != null) {
			System.out.println("Usuário existe!!");
			HttpSession sessao = requisicao.getSession();
			sessao.setAttribute("usuario", usuario);
			return "forward:logado.jsp";
		} else {
			System.out.println("Usuário não existe");
			return "redirect:entrada?acao=FormularioLogin";
		}
		
	}

}
