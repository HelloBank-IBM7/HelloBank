package com.ibm7.hellobank.Repository;

import com.ibm7.hellobank.Model.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationRepository extends JpaRepository<Operation, Integer> {

}
