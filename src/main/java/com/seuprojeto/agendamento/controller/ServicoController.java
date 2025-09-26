package com.seuprojeto.agendamento.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seuprojeto.agendamento.model.Servico;
import com.seuprojeto.agendamento.repository.ServicoRepository;

@RestController
@RequestMapping("/servicos")
public class ServicoController {
   
	private final ServicoRepository repository;
	
	public ServicoController (ServicoRepository repository) {
		this.repository = repository;
	}
	 @PostMapping
	 public Servico criar (@RequestBody Servico servico ) {
		 return repository.save(servico);
		 
	 }
	@GetMapping
	public List<Servico> listar (){
		return repository.findAll();
	}
}
