package br.com.github.lucasdevrj.platinado.servlet;

public class Cliente {

	private Integer id;
	private String nome;
	private String sobrenome;
	private String celular;
	private String email;
	
	public Cliente(String nome, String sobrenome, String celular, String email) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.celular = celular;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + "\nSobrenome: " 
		+ this.sobrenome + "\nE-mail: " + this.email + "\nCelular: " 
		+ this.celular;
	}
}
