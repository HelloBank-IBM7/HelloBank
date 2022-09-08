package com.ibm7.hellobank.dtos.requests;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class RequestAccountDto {
  private Long id;
  @NotBlank
  private String agencia;
  @NotBlank
  private String numeroConta;
  private String deposito;
  private String saque;
  private RequestClientDto clientRequest;

}
