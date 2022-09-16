package com.ibm7.hellobank.Service;

import com.ibm7.hellobank.Model.Account;

import java.util.List;

public interface IAccountService {

    public Account salvarConta(Account account);
    public Account buscarConta(Integer id);
    public List<Account> listarConta();
    public Account atualizarConta(Account account);
    public void excluirConta(Integer id);


}
