package com.ifms.backend.dto;

import java.io.Serializable;

import com.ifms.backend.entities.Lotacao;

public class LotacaoDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String descricao;
	private String endereco;
	private String email;
	private String site;
	private String telefone;

	public LotacaoDto() {
	}

	public LotacaoDto(Long id, String descricao, String endereco, String email, String site, String telefone) {
		this.id = id;
		this.descricao = descricao;
		this.endereco = endereco;
		this.email = email;
		this.site = site;
		this.telefone = telefone;
	}

	public LotacaoDto(Lotacao entity) {
		this.id = entity.getId();
		this.descricao = entity.getDescricao();
		this.endereco = entity.getEndereco();
		this.email = entity.getEmail();
		this.site = entity.getSite();
		this.telefone = entity.getTelefone();
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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
