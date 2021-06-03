package br.com.carsapi.usuario.cadastrarveiculos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import br.com.carsapi.usuario.beansvalidationcriadas.ExisteObjeto;
import br.com.carsapi.usuario.cadastrausuario.Usuario;

public class DadosForm {

	@NotBlank
	private String Marca;

	@NotBlank
	private String Modelo;

	@NotBlank
	private String AnoModelo;
	
	@NotNull
	@Positive
	@ExisteObjeto(domainClass = Usuario.class, fieldName = "id")
	private Long usuarioId;

	

	public DadosForm(@NotBlank String marca, @NotBlank String modelo, @NotBlank String anoModelo,
			@NotNull @Positive Long usuarioId) {
		super();
		Marca = marca;
		Modelo = modelo;
		AnoModelo = anoModelo;
		this.usuarioId = usuarioId;
	}

	public String getMarca() {
		return Marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public String getAnoModelo() {
		return AnoModelo;
	}
	
	public Long getUsuarioId() {
		return usuarioId;
	}

}
