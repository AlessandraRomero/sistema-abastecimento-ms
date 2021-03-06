package com.ifms.backend.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import com.ifms.backend.entities.Combustivel;
import com.ifms.backend.entities.Veiculo;

public class VeiculoDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	@NotBlank(message = "O campo é obrigatório")
	private Integer ano;
	@NotBlank(message = "O campo é obrigatório")
	private String placa;
	@NotBlank(message = "O campo é obrigatório")
	private String renavan;
	@NotBlank(message = "O campo é obrigatório")
	private String patrimonio;
	@NotBlank(message = "O campo é obrigatório")
	private String chassi;
	@NotBlank(message = "O campo é obrigatório")
	private String versao;
	@NotBlank(message = "O campo é obrigatório")
	private String capacidadeTanque;
	@NotBlank(message = "O campo é obrigatório")
	private Combustivel tipoCombustivel;

	public VeiculoDto() {
	}

	public VeiculoDto(Long id, Integer ano, String placa, String renavan, String patrimonio, String chassi,
			String versao, String capacidadeTanque, Combustivel tipoCombustivel) {
		this.id = id;
		this.ano = ano;
		this.placa = placa;
		this.renavan = renavan;
		this.patrimonio = patrimonio;
		this.chassi = chassi;
		this.versao = versao;
		this.capacidadeTanque = capacidadeTanque;
		this.tipoCombustivel = tipoCombustivel;
	}

	public VeiculoDto(Veiculo entity) {
		this.id = entity.getId();
		this.ano = entity.getAno();
		this.placa = entity.getPlaca();
		this.renavan = entity.getRenavan();
		this.patrimonio = entity.getPatrimonio();
		this.chassi = entity.getChassi();
		this.versao = entity.getVersao();
		this.capacidadeTanque = entity.getCapacidadeTanque();
		this.tipoCombustivel = entity.getTipoCombustivel();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getRenavan() {
		return renavan;
	}

	public void setRenavan(String renavan) {
		this.renavan = renavan;
	}

	public String getPatrimonio() {
		return patrimonio;
	}

	public void setPatrimonio(String patrimonio) {
		this.patrimonio = patrimonio;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getVersao() {
		return versao;
	}

	public void setVersao(String versao) {
		this.versao = versao;
	}

	public String getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(String capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	public Combustivel getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(Combustivel tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

}
