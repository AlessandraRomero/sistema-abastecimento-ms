package com.ifms.backend.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ifms.backend.dto.VeiculoDto;
import com.ifms.backend.services.VeiculoService;

@RestController
@RequestMapping(value = "/Veiculo")
public class VeiculoResource {

	@Autowired
	private VeiculoService service;

	public ResponseEntity<List<VeiculoDto>> findAll() {
		List<VeiculoDto> lista = service.findAll();
		return ResponseEntity.ok().body(lista);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<VeiculoDto> findById(@PathVariable Long id) {
		VeiculoDto dto = service.findById(id);
		return ResponseEntity.ok().body(dto);
	}

	@PostMapping
	public ResponseEntity<VeiculoDto> insert(@RequestBody VeiculoDto dto) {
		dto = service.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}

	@PutMapping(value = "/{id}")
	public ResponseEntity<VeiculoDto> update(@PathVariable Long id, @RequestBody VeiculoDto dto) {
		dto = service.update(id, dto);
		return ResponseEntity.ok().body(dto);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<VeiculoDto> delete(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();

	}
}
