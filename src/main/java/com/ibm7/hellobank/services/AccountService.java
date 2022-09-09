package com.ibm7.hellobank.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm7.hellobank.daos.AccountDao;
import com.ibm7.hellobank.dtos.requests.RequestAccountDto;
import com.ibm7.hellobank.dtos.responses.ResponseAccountDto;
import com.ibm7.hellobank.models.AccountEntity;

@Service
public class AccountService {

  @Autowired
  private AccountDao accountDao;

  @Autowired
  private ModelMapper modelMapper;

  public ResponseAccountDto save(RequestAccountDto requestAccountDto) {
    AccountEntity entity = modelMapper.map(requestAccountDto, AccountEntity.class);
    AccountEntity saved = accountDao.save(entity);
    return modelMapper.map(saved, ResponseAccountDto.class);
  }

}