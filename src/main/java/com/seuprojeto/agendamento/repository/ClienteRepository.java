package com.seuprojeto.agendamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seuprojeto.agendamento.model.Cliente;

public  interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
