package br.com.senai.usuarios_mktplace;

import br.com.senai.usuarios_mktplace.core.dao.ManagerDb;

public class InitApp {
	
	public static void main(String[] args) {
		ManagerDb.getInstance().getConexao();
		System.out.println("Conectou ao banco");
	}
}
