package com.ibm7.hellobank.dtos.responses;

import lombok.Data;

@Data
public class ResponseClientDto {
  private Long id;
  private String nome;
  private String cpf;
  private String email;
  private String telefone;
  private String endereco;

}
