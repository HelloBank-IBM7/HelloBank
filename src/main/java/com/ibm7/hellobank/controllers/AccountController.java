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
import com.ibm7.hellobank.dtos.requests.RequestAccountDto;
import com.ibm7.hellobank.dtos.responses.ResponseAccountDto;
import com.ibm7.hellobank.services.AccountService;

@RestController
@RequestMapping("/conta")
public class AccountController {
  @Autowired
  private AccountService accountService;

  @PostMapping
  public ResponseEntity<?> post(@Valid @RequestBody RequestAccountDto requestAccount,
      UriComponentsBuilder uriComponentsBuilder) {
    ResponseAccountDto responseAccountDto = accountService.save(requestAccount);
    URI uri = uriComponentsBuilder.path("/conta/{id}").buildAndExpand(responseAccountDto.getId()).toUri();
    return ResponseEntity.created(uri).body(responseAccountDto);
  }

}