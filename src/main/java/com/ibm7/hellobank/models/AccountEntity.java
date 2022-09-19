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
@Table(name = "conta")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountEntity {

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
  @JoinColumn(name = "id_cliente")
  private ClientEntity client;

}
