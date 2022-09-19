package com.ibm7.hellobank.Repository;

import com.ibm7.hellobank.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(value = "select * from usuario where nome_usuario = :usuario and senha_usuario = :senha", nativeQuery = true)
    public User Login(String usuario, String senha);
}
