package br.com.github.lucasdevrj.platinado.modelo;

public class Usuario {

    private String login;
    private String senha;
    
    public Usuario(String login, String senha) {
    	this.login = login;
    	this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean ehIgual(String login, String senha) {
        if(!this.login.equals(login)) {
            return false;
        }

        if(!this.senha.equals(senha)) {
            return false;
        }

        return true;
    }
}