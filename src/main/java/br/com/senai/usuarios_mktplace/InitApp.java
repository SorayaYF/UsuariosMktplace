package br.com.senai.usuarios_mktplace;

import br.com.senai.usuarios_mktplace.core.domain.Usuario;

public class InitApp {

	public static void main(String[] args) {
		Usuario usuario = new Usuario("jose.silva", "José da Silva", "jose2023");
		usuario.getLogin();
	}
}
