package br.com.github.lucasdevrj.platinado.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BancoDados {
	
	private static List<Cliente> clientes = new ArrayList<>();
	private static List<Usuario> usuarios = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	private static Integer chaveSequencialUsuario = 1;

	public void adicionaChaveSequencial(Cliente cliente) {
		cliente.setId(chaveSequencial++);
	}
	
	public void adicionaChaveSequencialUsuario(Usuario usuario) {
		usuario.setId(chaveSequencialUsuario++);
	}

	public void adicionaCliente(Cliente cliente) {
		adicionaChaveSequencial(cliente);
		BancoDados.clientes.add(cliente);
	}
	
	public void adicionaUsuario(Usuario usuario) {
		adicionaChaveSequencialUsuario(usuario);
		BancoDados.usuarios.add(usuario);
	}
	
	public List<Cliente> getClientes() {
		return BancoDados.clientes;
	}
	
	public List<Usuario> getUsuarios() {
		return BancoDados.usuarios;
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

	public Usuario existeUsuario(String login, String senha) {
		for (Usuario usuario : usuarios) {
			if (usuario.ehIgual(login, senha)) {
				return usuario;
			}
		}
		return null;
	}
}
