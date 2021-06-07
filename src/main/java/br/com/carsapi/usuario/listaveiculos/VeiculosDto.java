package br.com.carsapi.usuario.listaveiculos;

import java.util.Calendar;
import java.util.GregorianCalendar;


import br.com.carsapi.usuario.cadastrarveiculos.DiaRodizio;
import br.com.carsapi.usuario.cadastrarveiculos.Veiculos;
import br.com.carsapi.usuario.cadastrausuario.Usuario;

public class VeiculosDto {
	private Long id;

	private String Valor;
	
	private String marca;

	private String modelo;

	private Integer ano;

	private Usuario donoCarro;

	private DiaRodizio rodizio;
	
	private boolean rodizioAtivo;

	public VeiculosDto() {
		// TODO Auto-generated constructor stub
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



	public boolean isRodizioAtivo() {
		return rodizioAtivo;
	}



	public VeiculosDto(Veiculos veiculo) {
		
		id = veiculo.getId();
		Valor = veiculo.getValor();
		marca = veiculo.getMarca();
		modelo = veiculo.getModelo();
		ano = veiculo.getAno();
		donoCarro = veiculo.getDonoCarro();
		rodizio = veiculo.getRodizio();
		rodizioAtivo = rodizioAtivo(rodizio);
	}
	
	public boolean rodizioAtivo(DiaRodizio diaRodizio) {
		GregorianCalendar gc = new GregorianCalendar();
		Integer diaSemana = gc.get(Calendar.DAY_OF_WEEK);
		System.out.println(diaSemana + "" + diaRodizio);
		if (diaSemana == 1 && diaRodizio == DiaRodizio.segunda_feira) {
			return true;
		} else if (diaSemana == 2 && diaRodizio == DiaRodizio.terça_feira) {
			return true;
		} else if (diaSemana == 3 && diaRodizio == DiaRodizio.quarta_feira) {
			return true;
		} else if (diaSemana == 4 && diaRodizio == DiaRodizio.quinta_feira) {
			return true;
		} else if (diaSemana == 5 && diaRodizio == DiaRodizio.sexta_feira) {
			return true;
		}
		return false;

	}

}
