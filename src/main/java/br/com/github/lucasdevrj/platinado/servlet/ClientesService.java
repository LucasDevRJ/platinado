package br.com.github.lucasdevrj.platinado.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

import br.com.github.lucasdevrj.platinado.modelo.BancoDados;
import br.com.github.lucasdevrj.platinado.modelo.Cliente;

@WebServlet("/clientes")
public class ClientesService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest requisicao, HttpServletResponse resposta) throws ServletException, IOException {

		//Aplicação com XML
		List<Cliente> listaClientes =  new BancoDados().getClientes();
		
		XStream xtream = new XStream();
		xtream.alias("cliente", Cliente.class);
		String xml = xtream.toXML(listaClientes);
		
		resposta.setContentType("application/xml");
		resposta.getWriter().print(xml);
		
		//Aplicação com JSON
//		List<Cliente> listaClientes =  new BancoDados().getClientes();
//		
//		Gson gson = new Gson();
//		String json = gson.toJson(listaClientes);
//		
//		resposta.setContentType("application/json");
//		resposta.getWriter().print(json);
	}

}
