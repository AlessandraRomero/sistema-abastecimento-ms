package com.ifms.backend.dto;

import java.io.Serializable;

import com.ifms.backend.entities.Tipo;

public class TipoDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String descricao;

	public TipoDto() {
	}

	public TipoDto(Long id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public TipoDto(Tipo entity) {
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
