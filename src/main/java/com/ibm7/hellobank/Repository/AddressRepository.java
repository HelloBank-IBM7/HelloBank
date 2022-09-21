package com.ibm7.hellobank.Repository;

import com.ibm7.hellobank.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AddressRepository extends JpaRepository<Address, Integer> {

    @Query(value = "select * from endereco where id_endereco = :id", nativeQuery = true)
    public Address buscaEndereco(Integer id);
}
