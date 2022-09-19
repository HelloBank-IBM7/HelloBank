package com.ibm7.hellobank.Controller.IO;

import com.ibm7.hellobank.Model.Account;
import com.ibm7.hellobank.Model.Operation;
import com.ibm7.hellobank.Repository.AccountRepository;
import com.ibm7.hellobank.Repository.OperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class IOperationController {

    @Autowired
    private OperationRepository repo;

    @Autowired
    private AccountRepository conRepo;

    public Account conta;


    @PostMapping("/transacao/novo")
    public String novaTransacao(Operation operation){
        conta = this.conRepo.buscaConta(operation.getContaOrigem());
        if (conta != null) {
            operation.setContaOrigem(conta.getIdConta());
        } else {
            operation.setContaOrigem(null);
        }
        conta = this.conRepo.buscaConta(operation.getContaDestino());
        if (conta != null) {
            operation.setContaDestino(conta.getIdConta());
        } else {
            operation.setContaDestino(null);
        }
        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        operation.setDataTransacao(dtf5.format(LocalDateTime.now()));

        Operation op = repo.save(operation);
        if(op != null){
            return "Telas/simulador";
        }
        return "Telas/simulador";
    }
}
