package com.ibm7.hellobank.services;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ibm7.hellobank.daos.ClienteDAO;
import com.ibm7.hellobank.dtos.requests.RequestClientDto;
import com.ibm7.hellobank.dtos.responses.ResponseClientDto;
import com.ibm7.hellobank.models.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService {
  @Autowired
  private ClienteDAO clientDao;

  @Autowired
  private ModelMapper modelMapper;

  public ResponseClientDto save(RequestClientDto requestClientDto) {
    Cliente entity = modelMapper.map(requestClientDto, Cliente.class);
    Cliente saved = clientDao.save(entity);
    return modelMapper.map(saved, ResponseClientDto.class);
  }

}
