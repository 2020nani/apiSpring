package br.com.carsapi.usuario.cadastrarveiculos;

import java.util.List;

import javax.validation.Valid;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@FeignClient(url = "https://parallelum.com.br/fipe/api/v1/carros/marcas", name = "buscaValor")
public interface DadosVeiculo {
	
	
	 @GetMapping(value="/{Marca}/modelos/{Modelo}/anos/{AnoModelo}")
	 public VeiculoForm buscaValor (@PathVariable("Marca") String Marca, @PathVariable("Modelo") String Modelo,@PathVariable("AnoModelo") String AnoModelo);

	;
}
