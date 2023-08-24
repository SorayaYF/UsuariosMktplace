package br.com.senai.usuarios_mktplace;

import br.com.senai.usuarios_mktplace.core.service.UsuarioService;

public class InitApp {
	
	public static void main(String[] args) {
		UsuarioService service = new UsuarioService();
		service.criarPor("Jumenta Linda", "1212 Abcd");
	}
}
