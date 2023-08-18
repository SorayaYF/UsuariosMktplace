package br.com.senai.usuarios_mktplace.core.dao;

import br.com.senai.usuarios_mktplace.core.domain.Usuario;

public interface DaoUsuario {

	public void inserir(Usuario usuario);

	public void alterar(Usuario usuario);

	public Usuario buscarPor(String login);

}
