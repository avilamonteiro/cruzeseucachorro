package br.com.cruzeseucachorro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.validator.constraints.Length;

import br.com.caelum.vraptor.ioc.SessionScoped;

@Table(name = "csc_usuario")
@Entity
@SessionScoped
public class Usuario {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;

	@Column(name = "usuario_nome")
	@Length(min = 3, max = 20)
	private String nome;

	@Length(min = 3, max = 20)
	@Column(name = "usuario_sobrenome")
	private String sobreNome;

	@Length(min = 3, max = 20)
	@Column(name = "usuario_data_nascimento")
	private String dataNascimento;

	@Length(min = 3, max = 20)
	@Column(name = "usuario_email")
	private String email;

	@Length(min = 3, max = 20)
	@Column(name = "usuario_login")
	private String usuarioLogin;

	@Length(min = 3, max = 20)
	@Column(name = "usuario_senha")
	private String usuarioSenha;

	@Length(min = 3, max = 20)
	@Column(name = "usuario_pergunta_senha")
	private String usuarioPerguntaSenha;

	@Length(min = 3, max = 20)
	@Column(name = "usuario_resposta_senha")
	private String usuario_resposta_senha;

	public String getUsuarioLogin() {
		return usuarioLogin;
	}

	public void setUsuarioLogin(String usuarioLogin) {
		this.usuarioLogin = usuarioLogin;
	}

	public String getUsuarioSenha() {
		return usuarioSenha;
	}

	public void setUsuarioSenha(String usuarioSenha) {
		this.usuarioSenha = usuarioSenha;
	}

	public String getUsuarioPerguntaSenha() {
		return usuarioPerguntaSenha;
	}

	public void setUsuarioPerguntaSenha(String usuarioPerguntaSenha) {
		this.usuarioPerguntaSenha = usuarioPerguntaSenha;
	}

	public String getUsuario_resposta_senha() {
		return usuario_resposta_senha;
	}

	public void setUsuario_resposta_senha(String usuario_resposta_senha) {
		this.usuario_resposta_senha = usuario_resposta_senha;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}
