package br.com.senai.usuarios_mktplace.core.dao;

import br.com.senai.usuarios_mktplace.core.dao.postgresql.DaoPostgresUsuario;

public class FactoryDao {

	private static FactoryDao instance;

	private FactoryDao() {}

	public DaoUsuario getDaoUsuario() {
		return new DaoPostgresUsuario();
	}

	public static FactoryDao getInstance() {
		if (instance == null) {
			instance = new FactoryDao();
		}
		return instance;
	}
}
