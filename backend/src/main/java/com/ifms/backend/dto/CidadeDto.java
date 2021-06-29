package com.ifms.backend.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import com.ifms.backend.entities.Cidade;
import com.ifms.backend.entities.Estado;

public class CidadeDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	@NotBlank(message = "O campo é obrigatório")
	private String nome;
	@NotBlank(message = "O campo é obrigatório")
	private Estado estado;

	public CidadeDto() {
	}

	public CidadeDto(Estado estado, Long id, String nome) {
		this.estado = estado;
		this.id = id;
		this.nome = nome;
	}

	public CidadeDto(Cidade entity) {
		this.estado = entity.getEstado();
		this.id = entity.getId();
		this.nome = entity.getNome();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	

}
