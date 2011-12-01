package br.com.cruzeseucachorro.util;





import br.com.cruzeseucachorro.dao.UsuarioDao;
import br.com.cruzeseucachorro.entity.Usuario;

public class HibernateUtil {
	
  	
  	public static void main(String[] args){
		
		Usuario usuario = new UsuarioDao().criacaoDeUsuario();
		new UsuarioDao().salva(usuario);
		
	}
	
}
