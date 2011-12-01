package br.com.cruzeseucachorro.interceptor;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.SessionScoped;
import br.com.cruzeseucachorro.entity.Usuario;


/**
 * @author tarcilio
 * Classe informacoes do usuario logado
 */
@Component
@SessionScoped
public class UsuarioInfo {
	
	/**
	 * 
	 */
	 Usuario usuarioEntity;

		
	public Usuario getUsuarioEntity() {
		return usuarioEntity;
	}


	public void login(Usuario usuarioEntity){
		
		this.usuarioEntity = usuarioEntity;
	}


	public void logout(){
		
		this.usuarioEntity = null;
	}
	
}
