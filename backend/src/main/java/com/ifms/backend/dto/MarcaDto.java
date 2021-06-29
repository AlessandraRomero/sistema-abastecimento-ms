package com.ifms.backend.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import com.ifms.backend.entities.Marca;

public class MarcaDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	@NotBlank(message = "O campo é obrigatório")
	private String descricao;

	public MarcaDto() {
	}

	public MarcaDto(Long id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public MarcaDto(Marca entity) {
		this.id = entity.getId();
		this.descricao = entity.getDescricao();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
