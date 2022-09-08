package com.ibm7.hellobank.daos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm7.hellobank.models.Conta;

@Repository
public interface ContaDAO extends CrudRepository<Conta, Integer> {

}
