package com.ibm7.hellobank.dtos.responses;

import lombok.Data;

@Data
public class ResponseAccountDto {
  private Long id;
  private String agencia;
  private String numeroConta;
  private double deposito;
  private double saque;
  private double saldo;
  private ResponseClientDto clientResponse;

}
