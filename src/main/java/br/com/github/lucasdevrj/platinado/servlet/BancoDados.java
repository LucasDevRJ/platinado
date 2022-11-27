package br.com.github.lucasdevrj.platinado.servlet;

import java.util.ArrayList;
import java.util.List;

public class BancoDados {
	
	private static List<Cliente> clientes = new ArrayList<>();

	public void adicionaCliente(Cliente cliente) {
		BancoDados.clientes.add(cliente);
	}
}
