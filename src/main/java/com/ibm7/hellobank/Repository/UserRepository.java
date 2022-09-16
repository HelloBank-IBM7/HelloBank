package com.ibm7.hellobank.Repository;

import com.ibm7.hellobank.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
