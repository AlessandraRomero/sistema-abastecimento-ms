package com.ifms.backend.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class AutoPosto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeFantasia;
	private String telefone;
	private String email;
	private String cnpj;
	private String endereco;

	
	@OneToMany(mappedBy = "autoposto")
	private List<Abastecimento> abastecimento;
	
	@ManyToOne
	@JoinColumn(name = "cidade_id")
	private Cidade cidade;

	public AutoPosto() {

	}

	public AutoPosto(Long id, String nomeFantasia, String telefone, String email, String cnpj, String endereco, Cidade cidade) {
		super();
		this.id = id;
		this.nomeFantasia = nomeFantasia;
		this.telefone = telefone;
		this.email = email;
		this.cnpj = cnpj;
		this.endereco = endereco;
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

	
	public List<Abastecimento> getAbastecimento() {
		return abastecimento;
	}

	public void setAbastecimento(List<Abastecimento> abastecimento) {
		this.abastecimento = abastecimento;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	

	public Cidade getCidade() {
		return cidade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoPosto other = (AutoPosto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	

	
	

}
