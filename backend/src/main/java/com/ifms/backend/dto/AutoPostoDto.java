package com.ifms.backend.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CNPJ;

import com.ifms.backend.entities.AutoPosto;
import com.ifms.backend.entities.Cidade;

public class AutoPostoDto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	@Size(min = 5, max = 120, message = "O tamanho mínimo é de 5 e no máximo é de 120 caracteres")
	@NotBlank(message = "O campo é obrigatório")
	private String nomeFantasia;
	@NotBlank(message = "O campo é obrigatório")
	private String telefone;
	@Email
	private String email;
	@CNPJ
	private String cnpj;
	@NotBlank(message = "O campo é obrigatório")
	private String endereco;
	@NotBlank(message = "O campo é obrigatório")
	private Cidade cidade;
	
	public AutoPostoDto(){
		
	}

	public AutoPostoDto(Long id, String nomeFantasia, String telefone, String email, String cnpj, String endereco, Cidade cidade) {
		this.id = id;
		this.nomeFantasia = nomeFantasia;
		this.telefone = telefone;
		this.email = email;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.cidade = cidade;
	}
	
	public AutoPostoDto(AutoPosto entity) {
		this.nomeFantasia = entity.getNomeFantasia();
		this.telefone = entity.getTelefone();
		this.email = entity.getEmail();
		this.cnpj = entity.getCnpj();
		this.endereco = entity.getEndereco();
		this.cidade = entity.getCidade();
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
