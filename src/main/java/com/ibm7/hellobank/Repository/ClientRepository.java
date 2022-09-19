package com.ibm7.hellobank.Repository;

import com.ibm7.hellobank.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
