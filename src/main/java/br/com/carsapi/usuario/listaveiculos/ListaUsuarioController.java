package br.com.carsapi.usuario.listaveiculos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.carsapi.usuario.cadastrarveiculos.VeiculoRepository;
import br.com.carsapi.usuario.cadastrarveiculos.Veiculos;

@RestController
public class ListaUsuarioController {
	
	@Autowired
	private VeiculoRepository veiculosrepository;
	
	@GetMapping("/veiculos/{id}")
	public List<VeiculosDto> listaUsuario(@PathVariable("id") Long id) throws BindException {
		
		List<Veiculos> veiculos = veiculosrepository.findByDonoCarroId(id);
		List<VeiculosDto> veiculoDto = new ArrayList<VeiculosDto>();
		if(veiculos.size()>0) {
		
			veiculos.forEach(veiculo -> {
				VeiculosDto objeto = new VeiculosDto(veiculo);
				veiculoDto.add(objeto);
			});
			
			return veiculoDto;
	   
		}
		BindException problemaComEstoque = new BindException(veiculos, "compraForm");
		problemaComEstoque.reject(null,"Este usuario nao existe em nosso banco de dados");

		throw problemaComEstoque;
		
	}

	

}
