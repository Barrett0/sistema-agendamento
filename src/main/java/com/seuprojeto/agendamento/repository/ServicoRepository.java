package com.seuprojeto.agendamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seuprojeto.agendamento.model.Servico;

public interface ServicoRepository extends JpaRepository<Servico, Long> {

}
