package com.ibm7.hellobank.controllers;

import java.net.URI;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import com.ibm7.hellobank.dtos.requests.RequestClientDto;
import com.ibm7.hellobank.dtos.responses.ResponseClientDto;
import com.ibm7.hellobank.services.ClienteServiceImpl;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
  @Autowired
  private ClienteServiceImpl clientService;

//  @PostMapping
//  public ResponseEntity<ResponseClientDto> post(@Valid @RequestBody RequestClientDto requestClient,
//      UriComponentsBuilder uriComponentsBuilder) {
//    ResponseClientDto responseClientDTO = clientService.save(requestClient);
//    URI uri = uriComponentsBuilder.path("/clients/{id}").buildAndExpand(responseClientDTO.getIdCliente()).toUri();
//    return ResponseEntity.created(uri).body(responseClientDTO);
//  }

}
