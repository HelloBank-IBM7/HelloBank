package com.ibm7.hellobank.Repository;

import com.ibm7.hellobank.Model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {

}
