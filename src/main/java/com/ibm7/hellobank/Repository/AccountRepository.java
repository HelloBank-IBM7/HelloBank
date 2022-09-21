package com.ibm7.hellobank.Repository;

import com.ibm7.hellobank.Model.Account;
import com.ibm7.hellobank.Model.Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AccountRepository extends JpaRepository<Account, Integer> {

    @Query(value = "select * from conta where agencia_conta = :agencia and numero_conta = :conta", nativeQuery = true)
    public Account buscaAgConta(Integer agencia, Integer conta);

    @Query(value = "select * from conta where id_cliente = :cliente", nativeQuery = true)
    public Account buscaConta(Integer cliente);
}
