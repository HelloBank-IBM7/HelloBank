package com.ibm7.hellobank.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm7.hellobank.daos.ClientDao;
import com.ibm7.hellobank.dtos.requests.RequestClientDto;
import com.ibm7.hellobank.dtos.responses.ResponseClientDto;
import com.ibm7.hellobank.models.ClientEntity;

@Service
public class ClientService {
  @Autowired
  private ClientDao clientDao;

  @Autowired
  private ModelMapper modelMapper;

  public ResponseClientDto save(RequestClientDto requestClientDto) {
    ClientEntity entity = modelMapper.map(requestClientDto, ClientEntity.class);
    ClientEntity saved = clientDao.save(entity);
    return modelMapper.map(saved, ResponseClientDto.class);
  }

}