package com.seuprojeto.agendamento.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seuprojeto.agendamento.model.Cliente;
import com.seuprojeto.agendamento.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	private final ClienteRepository repository;
	
	public ClienteController(ClienteRepository repository) {
		this.repository = repository;
		
	}

	@PostMapping
	public Cliente criar (@RequestBody  Cliente cliente) {
		return repository.save(cliente);
	}
	@GetMapping
	public List<Cliente>listar(){
		return repository.findAll();
	}
	
}
