package br.com.cruzeseucachorro.util;

import br.com.cruzeseucachorro.entity.Usuario;

/**
 * @author tarcilio
 *
 */
public interface IUsuario {
	
	
	public Usuario procura(String email, String senha);
	
	//UsuarioEntity procura(String login);
	
	public  Usuario criacaoDeUsuario();
	
	public void salva(Usuario login);
	
	public void remove(Usuario usuario);
	
	public void atualiza(Usuario usuario);
	
	public void refresh(Usuario usuario);
	
	//void refresh(UsuarioEntity usuario);
	
	//void update(UsuarioEntity usuario);
	
	//List<UsuarioEntity> listarTodosUsuarios();
	
	//boolean usuarioComOMesmoLogin(String login);
	

}
