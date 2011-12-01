package br.com.cruzeseucachorro.business;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.cruzeseucachorro.entity.Usuario;

public class UsuarioBusiness {

	private EntityManager manager;

	public UsuarioBusiness(EntityManager manager) {
		this.manager = manager;
	}

	public Usuario Autenticar(String email, String password) {

		try {
			Query query = (Query) manager
					.createQuery("from Usuario where email"
							+ " = :email and senha = :senha");
			query.setParameter("email", email);
			query.setParameter("password", password);
			return (Usuario)query.getSingleResult();
		} catch (Exception e) {
			return null;
		}
		
	}

}
