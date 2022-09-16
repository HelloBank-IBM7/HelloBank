package com.ibm7.hellobank.Service;

import com.ibm7.hellobank.Model.Operation;
import com.ibm7.hellobank.Repository.OperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperationServiceImpl implements IOperationService {

    @Autowired
    private OperationRepository repo;

    @Override
    public Operation salvarOperacao(Operation operation) {
        return repo.save(operation);
    }

    @Override
    public Operation buscarOperacao(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Operation> listarOperacao() {
        return repo.findAll();
    }

    @Override
    public void excluirOperacao(Integer id) {
        repo.deleteById(id);
    }
}
