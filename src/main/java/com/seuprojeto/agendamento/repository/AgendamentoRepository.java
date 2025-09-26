package com.seuprojeto.agendamento.repository;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;

import com.seuprojeto.agendamento.model.Agendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long>{

	boolean
	existsByDataHora(LocalDateTime dataaHora);
}
