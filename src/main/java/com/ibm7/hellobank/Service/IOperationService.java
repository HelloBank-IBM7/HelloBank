package com.ibm7.hellobank.Service;

import com.ibm7.hellobank.Model.Operation;

import java.util.List;

public interface IOperationService {

    public Operation salvarOperacao(Operation operation);
    public Operation buscarOperacao(Integer id);
    public List<Operation> listarOperacao();
    public void excluirOperacao(Integer id);
}
