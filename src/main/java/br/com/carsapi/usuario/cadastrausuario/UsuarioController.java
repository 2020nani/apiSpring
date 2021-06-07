package br.com.carsapi.usuario.cadastrausuario;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuariorepository;
	
	@PostMapping(value = "/usuarios")
	public void criaUsuario(@RequestBody @Valid UsuarioForm usuarioform) {
		
		Usuario novousuario = usuarioform.converte();
		usuariorepository.save(novousuario);
	}

}
