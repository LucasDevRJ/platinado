package br.com.github.lucasdevrj.platinado.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/entrada")
public class Monitoramento implements Filter{

	@Override
	public void doFilter(ServletRequest requisicao, ServletResponse resposta, FilterChain cadeia) throws IOException, ServletException {
		long antes = System.currentTimeMillis();
		
		String acao = requisicao.getParameter("acao");
		
		cadeia.doFilter(requisicao, resposta);
		
		long depois = System.currentTimeMillis();
		
		System.out.println(depois - antes);
	}

}
