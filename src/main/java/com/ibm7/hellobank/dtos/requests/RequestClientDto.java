package com.ibm7.hellobank.dtos.requests;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.br.CPF;

import lombok.Data;

@Data
public class RequestClientDto {
  private Integer idCliente;
  @NotBlank
  private String nome;
  @NotBlank
  @CPF
  private String cpfCliente;
  @NotBlank
  @Email
  private String email;
  @NotBlank
  private String senha;
  @NotBlank
  private String telefone;
  @NotBlank
  private String endereco;
}
