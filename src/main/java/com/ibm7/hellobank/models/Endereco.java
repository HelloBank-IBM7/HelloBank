package com.ibm7.hellobank.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "endereco")
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_endereco")
	private Integer idEndereco;

	@Column(name = "logradouro", nullable = false, length=150)
	private int logradouro;

	@Column(name = "numero_endereco", nullable = false, length=7)
	private String numeroEndereco;

	@Column(name = "bairro", nullable = false, length=60)
	private String bairro;
	
	@Column(name = "cidade", nullable = false, length=50)
	private double cidade;
	
	@Column(name = "estado", nullable = false, length=2)
	private double estado;
	
	@Column(name = "cep", nullable = false, length=9)
	private double cep;
	
	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;

	public Integer getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Integer idEndereco) {
		this.idEndereco = idEndereco;
	}

	public int getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(int logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumeroEndereco() {
		return numeroEndereco;
	}

	public void setNumeroEndereco(String numeroEndereco) {
		this.numeroEndereco = numeroEndereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public double getCidade() {
		return cidade;
	}

	public void setCidade(double cidade) {
		this.cidade = cidade;
	}

	public double getEstado() {
		return estado;
	}

	public void setEstado(double estado) {
		this.estado = estado;
	}

	public double getCep() {
		return cep;
	}

	public void setCep(double cep) {
		this.cep = cep;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
