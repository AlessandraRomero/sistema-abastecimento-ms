package com.ifms.backend.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ifms.backend.dto.AbastecimentoDto;
import com.ifms.backend.services.AbastecimentoService;


public class AbastecimentoResource {

	@Autowired
	private AbastecimentoService service;

	public ResponseEntity<List<AbastecimentoDto>> findAll() {
		List<AbastecimentoDto> lista = service.findAll();
		return ResponseEntity.ok().body(lista);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<AbastecimentoDto> findById(@PathVariable Long id) {
		AbastecimentoDto dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}
}
