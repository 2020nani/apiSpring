package br.com.carsapi.usuario.cadastrausuario;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.br.CPF;

import br.com.carsapi.usuario.beansvalidationcriadas.ValorUnico;

public class UsuarioForm {
	
	@NotBlank
	private String nome;
	
	@NotBlank
	@Email
	@ValorUnico(domainClass = Usuario.class, fieldName = "email")
	private String email;
	
	@NotBlank
	@CPF
	@ValorUnico(domainClass = Usuario.class, fieldName = "cpf")
	private String cpf;

	public UsuarioForm(@NotBlank String nome, @NotBlank @Email String email, @NotBlank @CPF String cpf) {
		super();
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}

	public Usuario converte() {
		
		return new Usuario(nome, email, cpf);
	}

	
}
