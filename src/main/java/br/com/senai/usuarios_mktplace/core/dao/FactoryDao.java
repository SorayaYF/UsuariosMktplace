package br.com.senai.usuarios_mktplace.core.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import br.com.senai.usuarios_mktplace.core.dao.postgresql.DaoPostgresUsuario;

@Service
public class FactoryDao {

	@Bean
	public DaoUsuario getDaoUsuario() {
		return new DaoPostgresUsuario();
	}

}
