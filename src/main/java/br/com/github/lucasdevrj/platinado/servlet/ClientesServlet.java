package br.com.github.lucasdevrj.platinado.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/clientes")
public class ClientesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {
		BancoDados bancoDados = new BancoDados();
		List<Cliente> clientes = bancoDados.getClientes();
		
		requisicao.setAttribute("clientes", clientes);
		
		RequestDispatcher envio = requisicao.getRequestDispatcher("/lista.jsp");
		envio.forward(requisicao, resposta);
		
		System.out.println(clientes.toString());
	}

}
