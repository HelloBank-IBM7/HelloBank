package com.ibm7.hellobank.dtos.responses;

import java.util.Map;

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
public Map<String, ?> getIdConta() {
	// TODO Auto-generated method stub
	return null;
}

}
