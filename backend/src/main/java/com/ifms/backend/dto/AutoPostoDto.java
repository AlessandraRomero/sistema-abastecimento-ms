package com.ifms.backend.dto;

import java.io.Serializable;


import com.ifms.backend.entities.AutoPosto;

public class AutoPostoDto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nomeFantasia;
	private String telefone;
	private String email;
	private String cnpj;
	private String endereco;
	
	public AutoPostoDto(){
		
	}

	public AutoPostoDto(Long id, String nomeFantasia, String telefone, String email, String cnpj, String endereco) {
		this.id = id;
		this.nomeFantasia = nomeFantasia;
		this.telefone = telefone;
		this.email = email;
		this.cnpj = cnpj;
		this.endereco = endereco;
	}
	
	public AutoPostoDto(AutoPosto entity) {
		this.nomeFantasia = entity.getNomeFantasia();
		this.telefone = entity.getTelefone();
		this.email = entity.getEmail();
		this.cnpj = entity.getCnpj();
		this.endereco = entity.getEndereco();
	}
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	
}
