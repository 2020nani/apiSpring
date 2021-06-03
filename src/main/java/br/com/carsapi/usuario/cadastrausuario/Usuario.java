package br.com.carsapi.usuario.cadastrausuario;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.br.CPF;

import br.com.carsapi.usuario.cadastrarveiculos.Veiculos;

@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String nome;
	
	@NotBlank
	@Email
	@Column(unique=true)
	private String email;
	
	@NotBlank
	@CPF
	@Column(unique=true)
	private String cpf;
	
	
	@Deprecated
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(@NotBlank String nome, @NotBlank @Email String email, @NotBlank @CPF String cpf) {
		super();
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}
	
	

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", email=" + email + ", cpf=" + cpf + "]";
	}
	
	
}
