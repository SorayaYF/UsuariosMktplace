package br.com.senai.usuarios_mktplace;

import br.com.senai.usuarios_mktplace.core.service.UsuarioService;

public class InitApp {

	public static void main(String[] args) {
		UsuarioService service = new UsuarioService();
		System.out.println(new UsuarioService().removerAcentoDo("José da Silva"));
		System.out.println(service.fracionar("José da Silva Alburquerque dos Anjos e Bragança"));
		System.out.println(service.gerarLoginPor("José da Silva Alburquerque dos Anjos e Bragança"));
		System.out.println(service.gerarHashDa("jose123456"));
	}
}
