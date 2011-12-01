package br.com.cruzeseucachorro.controller;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.blank.IndexController;
import br.com.caelum.vraptor.validator.Validations;
import br.com.cruzeseucachorro.dao.UsuarioDao;
import br.com.cruzeseucachorro.entity.Usuario;
import br.com.cruzeseucachorro.interceptor.Public;

@Resource
public class CadastrousuarioController {
	
	UsuarioDao dao;
	
	@Public
	@Post
	public void adiciona(Usuario usuario){
	
		final Usuario usuarioAtual = dao.criacaoDeUsuario();
		if(usuarioAtual!=null){
	//		session.setSession(usuarioAtual);
	//		result.redirectTo(IndexController.class).index();
		}else{
			//result.include("error", "E-mail ou Senha Incorreta!").redirectTo(this).login();
			//validator.add(new ValidationMessage("error", "E-mail ou Senha Incorreta!"));
		//	validator.checking(new Validations() {{
		//	    that(usuarioAtual, is(notNullValue()), "Login", "erro.invalido_login_ou_password");
		//	}});
			
		//	validator.onErrorUsePageOf(this).login();
		}
	}

}
