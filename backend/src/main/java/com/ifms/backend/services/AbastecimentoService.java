package com.ifms.backend.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ifms.backend.dto.AbastecimentoDto;
import com.ifms.backend.entities.Abastecimento;
import com.ifms.backend.repositories.AbastecimentoRepository;
import com.ifms.backend.services.exceptions.ResourceNotFoundException;

@Service
public class AbastecimentoService {

	@Autowired
	private AbastecimentoRepository repository;

	@Transactional(readOnly = true)
	public List<AbastecimentoDto> findAll() {
		List<Abastecimento> list = repository.findAll();
		return list.stream().map(abastecimento -> new AbastecimentoDto(abastecimento)).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public AbastecimentoDto findById(Long id) {
		Optional<Abastecimento> obj = repository.findById(id);
		Abastecimento abastecimento = obj.orElseThrow(() -> new ResourceNotFoundException("O abastecimento solicitado não foi encontrado"));
		return new AbastecimentoDto(abastecimento);
	}


}
