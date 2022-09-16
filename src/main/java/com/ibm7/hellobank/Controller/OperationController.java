package com.ibm7.hellobank.Controller;

import com.ibm7.hellobank.Model.Operation;
import com.ibm7.hellobank.Service.IOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RequestMapping(path = "/hellobank")
@RestController
public class OperationController {

    @Autowired
    private IOperationService service;

    @GetMapping("/listar/operacao")
    public ArrayList<Operation> listarOperacao(){
        return (ArrayList<Operation>) service.listarOperacao();
    }

    @PostMapping("/novo/operacao/transferencia")
    public ResponseEntity<Operation> novaTransferencia(@RequestBody Operation operation){
        // implementar código de transferencias das contas
        Operation op = service.salvarOperacao(operation);
        if (op != null){
            return ResponseEntity.ok(op);
        }
        return ResponseEntity.badRequest().build();
    }

    @PostMapping("/novo/operacao/deposito")
    public ResponseEntity<Operation> novoDeposito(@RequestBody Operation operation){
        // implementar código de debito da conta
        Operation op = service.salvarOperacao(operation);
        if (op != null){
            return ResponseEntity.ok(op);
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/deletar/operacao/{id}")
    public ResponseEntity<Operation> deletarOperacao(@PathVariable Integer id){
        service.excluirOperacao(id);
        return ResponseEntity.ok(null);
    }
    @GetMapping("/listar/operacao/{id}")
    public ResponseEntity<Operation> listarOperacaoPorId(@PathVariable Integer id){
        Operation op = service.buscarOperacao(id);
        if (op != null){
            return ResponseEntity.ok(op);
        }
        return ResponseEntity.badRequest().build();
    }
}
