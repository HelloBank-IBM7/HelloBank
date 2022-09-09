package com.ibm7.hellobank.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_cliente")
  private Integer idCliente;

  @Column(name = "nome_cliente", nullable = false, length = 90)
  private String nome;

  @Column(name = "email_cliente", nullable = false, length = 50)
  private String email;

  @Column(name = "telefone_cliente", nullable = false, length = 20)
  private String telefone;

  @Column(name = "cpf_cliente", nullable = false, length = 15)
  private String cpf;

}
