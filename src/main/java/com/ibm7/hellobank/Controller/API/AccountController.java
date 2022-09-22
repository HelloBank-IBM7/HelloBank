package com.ibm7.hellobank.Controller.API;

import com.ibm7.hellobank.Model.Account;
import com.ibm7.hellobank.Service.IAccountService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;

import java.util.ArrayList;

@RestController
public class AccountController {

    @Autowired
    private IAccountService service;

    @GetMapping("/conta")
    public ArrayList<Account> listaConta(){
        return (ArrayList<Account>) service.listarConta();
    }

    @PostMapping("/conta")
    public ResponseEntity<Account> novaConta(@RequestBody Account account){
        Account con = service.salvarConta(account);
        if (con != null){
            return ResponseEntity.ok(con);
        }
        return ResponseEntity.badRequest().build();
    }

    @PutMapping("/conta")
    public ResponseEntity<Account> alterarConta(@RequestBody Account account){
        Account con = service.atualizarConta(account);
        if (con != null){
            return ResponseEntity.ok(con);
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/conta/{id}")
    public ResponseEntity<Account> deletarConta(@PathVariable Integer id){
        service.excluirConta(id);
        return ResponseEntity.ok(null);
    }

    @GetMapping("/conta/{id}")
    public ResponseEntity<Account> listarContaPorId(@PathVariable Integer id){
        Account con = service.buscarConta(id);
        if (con != null){
            return ResponseEntity.ok(con);
        }
        return ResponseEntity.notFound().build();
    }
}
