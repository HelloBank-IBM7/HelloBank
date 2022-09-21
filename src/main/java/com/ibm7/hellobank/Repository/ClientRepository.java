package com.ibm7.hellobank.Repository;

import com.ibm7.hellobank.Model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    @Query(value = "select * from cliente where nome_cliente like %:nome%", nativeQuery = true)
    public Client buscaCliente(String nome);

    @Query(value = "select * from cliente where id_cliente = :id", nativeQuery = true)
    public Client buscaCliente(Integer id);

}
