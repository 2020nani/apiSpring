package br.com.carsapi.usuario.cadastrarveiculos;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import br.com.carsapi.usuario.cadastrausuario.Usuario;

@Entity
public class Veiculos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String Valor;
	@NotBlank
	private String marca;

	@NotBlank
	private String modelo;

	@NotNull
	private Integer ano;

	@ManyToOne
	@NotNull
	private Usuario donoCarro;
	
	@Enumerated
	private DiaRodizio rodizio;

	@Deprecated
	public Veiculos() {
		// TODO Auto-generated constructor stub
	}

	public Veiculos(@NotBlank String valor, @NotBlank String marca, @NotBlank String modelo, @NotNull Integer ano,
			@NotNull Usuario donoCarro, DiaRodizio rodizio ) {
		super();
		Valor = valor;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.donoCarro = donoCarro;
		this.rodizio = rodizio;
	}

	public Long getId() {
		return id;
	}

	public String getValor() {
		return Valor;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public Integer getAno() {
		return ano;
	}

	public Usuario getDonoCarro() {
		return donoCarro;
	}
	public DiaRodizio getRodizio() {
		return rodizio;
	}

	@Override
	public String toString() {
		return "Veiculos [id=" + id + ", Valor=" + Valor + ", marca=" + marca + ", modelo=" + modelo + ", ano=" + ano
				+ ", donoCarro=" + donoCarro + ", rodizio=" + rodizio + "]";
	}

	

}
