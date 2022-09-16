package com.ibm7.hellobank.Service;

import com.ibm7.hellobank.Model.Account;
import com.ibm7.hellobank.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private AccountRepository repo;

    @Override
    public Account salvarConta(Account novo){
        return repo.save(novo);
    }

    @Override
    public Account buscarConta(Integer id){
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Account> listarConta() {
        return repo.findAll();
    }

    @Override
    public Account atualizarConta(Account account) {
        if (account.getIdConta() != null && account.getNumeroConta() != null){
            return repo.save(account);
        }
        return null;
    }

    @Override
    public void excluirConta(Integer id) {
        repo.deleteById(id);
    }
}
