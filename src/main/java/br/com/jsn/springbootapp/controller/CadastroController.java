package br.com.jsn.springbootapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.jsn.springbootapp.entity.Cadastro;

@RestController
@RequestMapping(value = "/cadastro")
public class CadastroController implements Crud<Cadastro> {

	
	@GetMapping(value="/teste")
	public String test() {
		return "MUNIZ SOARES ENGENHARIA DE SOFTWATE";
	}

	@Override
	public ResponseEntity<String> criar(Cadastro model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<String> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<String> buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<String> atualizar(Cadastro model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<String> deletar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}