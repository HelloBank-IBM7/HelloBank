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
@Table(name ="conta")

public class Conta {
	
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_conta")
  private Integer idConta;
  
  @Column(name = "agencia_conta")
  private int agencia;
  
  @Column(name = "numero_conta")
  private String numeroConta;
 
  @Column(name = "saldo")
  private double saldo;

  @ManyToOne
  @JoinColumn (name="id_cliente")
  private Cliente cliente;

public Integer getIdConta() {
	return idConta;
}

public void setIdConta(Integer idConta) {
	this.idConta = idConta;
}

public int getAgencia() {
	return agencia;
}

public void setAgencia(int agencia) {
	this.agencia = agencia;
}

public String getNumeroConta() {
	return numeroConta;
}

public void setNumeroConta(String numeroConta) {
	this.numeroConta = numeroConta;
}

public double getSaldo() {
	return saldo;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
}

public Cliente getCliente() {
	return cliente;
}

public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}
  

}
