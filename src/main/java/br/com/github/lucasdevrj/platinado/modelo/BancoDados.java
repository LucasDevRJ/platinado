package br.com.github.lucasdevrj.platinado.modelo;

import java.util.ArrayList;
import java.util.Iterator;
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

	public void removeCliente(Integer id) {
		Iterator<Cliente> iterator = clientes.iterator();
		
		while (iterator.hasNext()) {
			Cliente cliente = iterator.next();
			
			if (cliente.getId() == id) {
				iterator.remove();
			}
		}
	}

	public Cliente pesquisaCliente(Integer id) {
		for (Cliente cliente : clientes) {
			if (cliente.getId() == id) {
				return cliente;
			}
		}
		
		return null;
	}
}
