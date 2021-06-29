package com.ifms.backend.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import com.ifms.backend.entities.Estado;

public class EstadoDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	@NotBlank(message = "O campo é obrigatório")
	private String uf;

	public EstadoDto() {
	}

	public EstadoDto(Long id, String uf) {
		this.id = id;
		this.uf = uf;
	}

	public EstadoDto(Estado entity) {
		this.id = entity.getId();
		this.uf = entity.getUf();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}
