package com.ibm7.hellobank.Repository;

import com.ibm7.hellobank.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
