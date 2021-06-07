package br.com.carsapi.usuario.cadastrarveiculos;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.carsapi.usuario.cadastrausuario.Usuario;
import br.com.carsapi.usuario.cadastrausuario.UsuarioRepository;

@RestController
public class VeiculoController {
	
	@Autowired
	private DadosVeiculo dadosveiculo;
	
	@Autowired
	private UsuarioRepository usuariorepository;
	
	@Autowired
	private VeiculoRepository veiculorepository;
	
	@PostMapping(value = "/veiculos")
	@Transactional
	public String criaVeiculo(@RequestBody @Valid DadosForm dadosform) {
		Usuario donoCarro = usuariorepository.findById(dadosform.getUsuarioId()).get();
		
		VeiculoForm veiculo = dadosveiculo.buscaValor(dadosform.getMarca(),dadosform.getModelo(),dadosform.getAnoModelo());
		
	    Veiculos veiculos = veiculo.converte(donoCarro);
	    
	    veiculorepository.save(veiculos);
		return veiculos.toString();
	}
	
	

}
