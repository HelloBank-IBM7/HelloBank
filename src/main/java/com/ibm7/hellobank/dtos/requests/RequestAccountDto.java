package com.ibm7.hellobank.dtos.requests;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class RequestAccountDto {
  private Integer idConta;
  @NotBlank
  private String agencia;
  @NotBlank
  private String numeroConta;
  private RequestClientDto clientRequest;

}
