package br.com.carsapi.usuario.listaveiculos;

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
	public List<Veiculos> listaUsuario(@PathVariable("id") Long id)throws BindException {
		List<Veiculos> veiculos = veiculosrepository.findByDonoCarroId(id);
		if(veiculos.size()>0) {
		return veiculos;
		}
		BindException problemaComEstoque = new BindException(veiculos, "compraForm");
		problemaComEstoque.reject(null,"Este usuario nao existe em nosso banco de dados");

		throw problemaComEstoque;
		
	}

}
