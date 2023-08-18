package br.com.senai.usuarios_mktplace;

import br.com.senai.usuarios_mktplace.core.dao.DaoUsuario;
import br.com.senai.usuarios_mktplace.core.dao.FactoryDao;
import br.com.senai.usuarios_mktplace.core.domain.Usuario;

public class InitApp {

	public static void main(String[] args) {
		DaoUsuario dao = FactoryDao.getInstance().getDaoUsuario();
		Usuario usuario = dao.buscarPor("asd");
		if (usuario == null) {
			System.out.println("Não existe usuário");
		} else {
			System.out.println(usuario.getNomeCompleto());
		}
	}
}
