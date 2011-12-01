package br.com.cruzeseucachorro.controller;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

import java.util.ArrayList;
import java.util.List;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.blank.IndexController;
import br.com.caelum.vraptor.validator.ValidationMessage;
import br.com.caelum.vraptor.validator.Validations;
import br.com.cruzeseucachorro.business.UsuarioBusiness;
import br.com.cruzeseucachorro.dao.UsuarioDao;
import br.com.cruzeseucachorro.entity.Usuario;
import br.com.cruzeseucachorro.interceptor.Public;
import br.com.cruzeseucachorro.interceptor.UsuarioInfo;
import br.com.cruzeseucachorro.util.UsuarioSession;

@Resource
public class HomeController {

	private final Result result;
	private final Validator validator;
	private final UsuarioInfo usuario;
	private final UsuarioDao dao;
//	private final UsuarioBusiness business;
	private final UsuarioSession session;

	HomeController(UsuarioInfo usuario, Result result, Validator validator,
			UsuarioDao dao,UsuarioSession session) {
		this.usuario = usuario;
		this.validator = validator;
		this.result = result;
		this.dao = dao;
		
		this.session = session;
	}

	public void adiciona() {

	}

	@Public
	@Post("/login")
	public void login(String login, String senha){
	
		final Usuario usuarioAtual = dao.procura(login, senha);
		if(usuarioAtual!=null){
			session.setSession(usuarioAtual);
			result.redirectTo(HomeController.class).login();
		}else{
			result.include("error", "E-mail ou Senha Incorreta!").redirectTo(this).login();
			//validator.add(new ValidationMessage("error", "E-mail ou Senha Incorreta!"));
			//validator.checking(new Validations() {{
			  //  that(usuarioAtual, is(notNullValue()), "Login", "erro.invalido_login_ou_password");
				//result.include("error", "E-mail ou senha incorreta !").redirectTo(this).;
		//	}});
			
			validator.onErrorUsePageOf(this).login();
		}
	}

	@Get("/logout")	
	public void logout() {
		session.logout();
		result.redirectTo(this).login();
	}



	public String mostraLoginAdicionado() {
		String str = "";

		return str;
	}

	
	@Path("/")
	public void login() {

	}
	

	public void form() {

	}


}
