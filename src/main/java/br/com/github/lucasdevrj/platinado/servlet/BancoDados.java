package br.com.github.lucasdevrj.platinado.servlet;

import java.util.ArrayList;
import java.util.List;

public class BancoDados {
	
	private static List<Cliente> clientes = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	public void adicionaChaveSequencial(Cliente cliente) {
		cliente.setId(chaveSequencial++);
	}

	public void adicionaCliente(Cliente cliente) {
		adicionaChaveSequencial(cliente);
		BancoDados.clientes.add(cliente);
	}
	
	public List<Cliente> getClientes() {
		return BancoDados.clientes;
	}
}
