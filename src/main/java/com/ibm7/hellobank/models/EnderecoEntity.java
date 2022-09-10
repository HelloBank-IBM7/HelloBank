package com.ibm7.hellobank.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "endereco")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_endereco")
	private Integer idEndereco;

	@Column(name = "logradouro", nullable = false, length = 150)
	private int logradouro;

	@Column(name = "numero_endereco", nullable = false, length = 7)
	private String numeroEndereco;

	@Column(name = "bairro", nullable = false, length = 60)
	private String bairro;

	@Column(name = "cidade", nullable = false, length = 50)
	private double cidade;

	@Column(name = "estado", nullable = false, length = 2)
	private double estado;

	@Column(name = "cep", nullable = false, length = 9)
	private double cep;

	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private ClientEntity client;

}
