package com.ibm7.hellobank.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm7.hellobank.models.AccountEntity;

@Repository
public interface AccountDao extends JpaRepository<AccountEntity, Long>{
	

	

	
	

}
