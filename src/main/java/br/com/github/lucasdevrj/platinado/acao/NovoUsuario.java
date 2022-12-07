package br.com.github.lucasdevrj.platinado.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.github.lucasdevrj.platinado.modelo.BancoDados;
import br.com.github.lucasdevrj.platinado.modelo.Usuario;

public class NovoUsuario implements Acao{

	public String executa(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
		String login = requisicao.getParameter("login");
		String senha = requisicao.getParameter("senha");
	
		Usuario usuario = new Usuario(login, senha);
		
		BancoDados bancoDados = new BancoDados();
		bancoDados.adicionaUsuario(usuario);
		
		requisicao.setAttribute("login", usuario.getLogin());
		requisicao.setAttribute("senha", usuario.getSenha());
		
		return "redirect:entrada?acao=ListaClientes";
	}
}
