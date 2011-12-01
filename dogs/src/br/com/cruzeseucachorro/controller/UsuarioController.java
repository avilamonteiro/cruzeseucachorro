package br.com.cruzeseucachorro.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.cruzeseucachorro.dao.UsuarioDao;
import br.com.cruzeseucachorro.interceptor.Public;
import br.com.cruzeseucachorro.util.UsuarioSession;

public class UsuarioController {

	private final Validator validator;
	private final Result result;
	private final UsuarioSession usuarioSession;
	private final UsuarioDao dao;

	UsuarioController(Validator validator, Result result,
			UsuarioSession usuarioSession, UsuarioDao dao) {

		this.validator = validator;
		this.result = result;
		this.usuarioSession = usuarioSession;
		this.dao = dao;

	}
	
	/**
	 * Accepts HTTP GET requests.
	 * URL:  /home
	 * View: /WEB-INF/jsp/usuario/home.jsp
	 *
	 * Shows user's home page containing his Dvd collection.
	 */
	@Path("/")
	@Get
	public void home() {
	    dao.refresh(usuarioSession.getSession());
	  //  result.include("dvdTypes", DvdType.values());
	}

	/**
	 * Accepts HTTP POST requests.
	 * URL:	 /usuario
	 * View: /WEB-INF/jsp/usuario/adicionar.jsp
	 * Adds new users to the database.
	 */ 
	@Post
	@Public
	@Path("/usuario")
	public void adicionar() {

	}

}
