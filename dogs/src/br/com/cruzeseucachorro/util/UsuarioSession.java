package br.com.cruzeseucachorro.util;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.SessionScoped;
import br.com.cruzeseucachorro.entity.Usuario;

@Component
@SessionScoped
public class UsuarioSession {

	private Usuario session;

	public boolean isLogado(){
		return session != null; 
	}
	
	public void logout(){
		session = null;
	}
	
	public Usuario getSession() {
		return session;
	}

	public void setSession(Usuario session) {
		this.session = session;
	}

	// passa qual usuario esta sendo logado
	public void login(Usuario usuario){
		this.session = usuario;
		
	}
	
}
