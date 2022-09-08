package com.ibm7.hellobank.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm7.hellobank.models.Cliente;

@Repository
public interface ClienteDAO extends JpaRepository<Cliente, Integer> {

}
