package com.ibm7.hellobank.Service;

import com.ibm7.hellobank.Model.Client;
import com.ibm7.hellobank.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClientServiceImpl implements IClientService {

    @Autowired
    private ClientRepository repo;

    @Override
    public Client salvarCliente(Client novo) {
        return repo.save(novo);
    }

    @Override
    public Client buscarCliente(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public ArrayList<Client> listarCliente() {
        return (ArrayList<Client>) repo.findAll();
    }

    @Override
    public void excluirCliente(Integer id) {
        repo.deleteById(id);
    }

    @Override
    public Client atualizarCliente(Client novo){
        if (novo.getIdCliente() != null && novo.getNome() != null){
            return repo.save(novo);
        }
        return null;
    }
}