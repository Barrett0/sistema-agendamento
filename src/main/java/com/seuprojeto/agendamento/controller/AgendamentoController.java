package com.seuprojeto.agendamento.controller;

import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seuprojeto.agendamento.model.Agendamento;
import com.seuprojeto.agendamento.repository.AgendamentoRepository;

@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {
	
	
	private final AgendamentoRepository repository;
	
	public AgendamentoController (AgendamentoRepository  repository) {
		this.repository = repository;
	}
	@PostMapping
	public Agendamento criar (@RequestBody Agendamento agendamento) {
		return repository.save(agendamento);
	}
     @GetMapping
     public List<Agendamento>listar(){
    	 return repository.findAll();
    	 
     }
}
