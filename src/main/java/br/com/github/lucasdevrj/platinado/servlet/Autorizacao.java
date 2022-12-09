package br.com.github.lucasdevrj.platinado.servlet;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/entrada")
public class Autorizacao extends HttpFilter implements Filter {

	public void doFilter(ServletRequest servletRequisicao, ServletResponse servletResposta, FilterChain cadeia) throws IOException, ServletException {
		HttpServletRequest requisicao = (HttpServletRequest) servletRequisicao;
		HttpServletResponse resposta = (HttpServletResponse) servletResposta;
		
		HttpSession sessao = requisicao.getSession();
		
		String parametroAcao = requisicao.getParameter("acao");
		
		boolean usuarioLogado = sessao.getAttribute("usuario") == null;
		boolean acaoProtegida = !(parametroAcao.equals("Login") || parametroAcao.equals("FormularioLogin") || parametroAcao.equals("Cadastrar") || parametroAcao.equals("NovoUsuario"));
		
		if (usuarioLogado && acaoProtegida) {
			resposta.sendRedirect("entrada?acao=Login");
			return;
		}
		
		cadeia.doFilter(requisicao, resposta);
	}
}
