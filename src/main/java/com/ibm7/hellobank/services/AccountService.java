package com.ibm7.hellobank.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm7.hellobank.daos.ContaDAO;
import com.ibm7.hellobank.dtos.requests.RequestAccountDto;
import com.ibm7.hellobank.dtos.responses.ResponseAccountDto;
import com.ibm7.hellobank.models.Conta;

@Service
public class AccountService {

  @Autowired
  private ContaDAO accountDao;

  @Autowired
  private ModelMapper modelMapper;

  public ResponseAccountDto save(RequestAccountDto requestAccountDto) {
    Conta entity = modelMapper.map(requestAccountDto, Conta.class);
    Conta saved = accountDao.save(entity);
    return modelMapper.map(saved, ResponseAccountDto.class);
  }

}
