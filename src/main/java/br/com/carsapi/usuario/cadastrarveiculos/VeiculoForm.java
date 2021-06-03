package br.com.carsapi.usuario.cadastrarveiculos;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import br.com.carsapi.usuario.cadastrausuario.Usuario;
import br.com.carsapi.usuario.cadastrausuario.UsuarioRepository;

public class VeiculoForm {
	 private String Valor;
	 private String Marca;
	 private String Modelo;
	 private int AnoModelo;
	 
	  
	  
	public VeiculoForm(String Valor, String Marca, String Modelo, int AnoModelo) {
		super();
		this.Valor = Valor;
		this.Marca = Marca;
		this.Modelo = Modelo;
		this.AnoModelo = AnoModelo;
		
	}
	

	public Veiculos converte(Usuario donoCarro) {
		
		
		return new Veiculos(Valor, Marca, Modelo, Marca, donoCarro);
	}
	

	@Override
	public String toString() {
		return "VeiculoForm [Valor=" + Valor + ", Marca=" + Marca + ", Modelo=" + Modelo + ", AnoModelo=" + AnoModelo
				+ "]";
	}

	 
}
