package br.com.carsapi.usuario.cadastrarveiculos;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

import br.com.carsapi.usuario.cadastrausuario.Usuario;
import br.com.carsapi.usuario.cadastrausuario.UsuarioRepository;

public class VeiculoForm {
	private String Valor;
	private String Marca;
	private String Modelo;
	private Integer AnoModelo;
	private DiaRodizio rodizio;

	public VeiculoForm(String Valor, String Marca, String Modelo, int AnoModelo) {
		super();
		this.Valor = Valor;
		this.Marca = Marca;
		this.Modelo = Modelo;
		this.AnoModelo = AnoModelo;

	}

	public DiaRodizio rodizio() {

		String finalplaca = AnoModelo.toString().substring(3);
		System.out.println(finalplaca);
		
		if (Integer.parseInt(finalplaca) == 0 || Integer.parseInt(finalplaca) == 1) {
			return DiaRodizio.segunda_feira;
		} else if (Integer.parseInt(finalplaca) == 2 || Integer.parseInt(finalplaca) == 3) {
			return  DiaRodizio.terça_feira;
		} else if (Integer.parseInt(finalplaca) == 4 || Integer.parseInt(finalplaca) == 5) {
			return  DiaRodizio.quarta_feira;
		} else if (Integer.parseInt(finalplaca) == 6 || Integer.parseInt(finalplaca) == 7) {
			return DiaRodizio.quinta_feira;
		} 
		return DiaRodizio.sexta_feira;
		
	}

	public Veiculos converte(Usuario donoCarro) {
   
		return new Veiculos(Valor, Marca, Modelo, AnoModelo, donoCarro, rodizio());
	}

}
