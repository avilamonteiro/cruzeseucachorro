package br.com.cruzeseucachorro.dao;

import javax.persistence.Query;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import br.com.caelum.vraptor.ioc.Component;
import br.com.cruzeseucachorro.entity.Usuario;
import br.com.cruzeseucachorro.util.CriadorDeSession;
import br.com.cruzeseucachorro.util.IUsuario;

@Component
public class UsuarioDao implements IUsuario {

	private final Session session;
	private final Transaction tx;
	private Usuario usuario;
	private EntityManager manager;

	public UsuarioDao() {

		this.session = CriadorDeSession.getSession();
		this.tx = session.beginTransaction();
		// this.manager = manager;

	}

	public Usuario criacaoDeUsuario(Usuario usuario) {
		
		
		
		usuario = new Usuario();
		usuario.setSobreNome("de avila monteiro");
		usuario.setNome("tarcilio");
		usuario.setDataNascimento("27/12/1985");
		usuario.setEmail("avilamonteiro@gmail.com");
		usuario.setUsuarioLogin("tarcilio");
		usuario.setUsuarioSenha("tarcilio");
		usuario.setUsuarioPerguntaSenha("Qual o nome do seu cachorro");
		usuario.setUsuario_resposta_senha("boluxa");
		return usuario;
	}

	@Override
	public void salva(Usuario login) {

		session.save(login);
		tx.commit();
	}

	@Override
	public void remove(Usuario usuario) {

		session.delete(usuario);
		tx.commit();

	}

	@Override
	/*
	 * public Usuario procura(String email, String senha) {
	 * 
	 * try{ Query query = (Query)
	 * manager.createQuery("from usuario where email = :email and senha = :senha"
	 * ); query.setParameter("email", email); query.setParameter("senha",
	 * senha); return (Usuario) query.getSingleResult(); }catch(Exception e){
	 * e.getMessage(); return null; }
	 * 
	 * }
	 */
	public Usuario procura(String login, String senha) {
		
		//Usuario newUsuario = null;
		
		try {
			
			Usuario newUsuario = (Usuario) session.createCriteria(Usuario.class)
			.add(Restrictions.eq("email", login))
			.add(Restrictions.eq("usuarioSenha", senha))
			.uniqueResult();
			
			if(newUsuario != null){
				return newUsuario;
			}else{
				return newUsuario;
			}	
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void atualiza(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void refresh(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario criacaoDeUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

}
