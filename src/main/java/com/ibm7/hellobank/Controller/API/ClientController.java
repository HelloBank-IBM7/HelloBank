package com.ibm7.hellobank.Controller.API;

import com.ibm7.hellobank.Model.Client;
import com.ibm7.hellobank.Service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ClientController {

    @Autowired
    private IClientService service;

    @GetMapping("/cliente")
    public ArrayList<Client> listaCliente(){
        return (ArrayList<Client>) service.listarCliente();
    }

    @PostMapping("/cliente")
    public ResponseEntity<Client> novoCliente(@RequestBody Client client){
        Client cli = service.salvarCliente(client);
        if (cli != null){
            return ResponseEntity.ok(cli);
        }
        return ResponseEntity.badRequest().build();
    }

    @PutMapping("/cliente")
    public ResponseEntity<Client> alterarCliente(@RequestBody Client client){
        Client cli = service.atualizarCliente(client);
        if (cli != null){
            return ResponseEntity.ok(cli);
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/cliente/{id}")
    public ResponseEntity<Client> deletarCliente(@PathVariable Integer id){
        service.excluirCliente(id);
        return ResponseEntity.ok(null);
    }

    @GetMapping("/cliente/{id}")
    public ResponseEntity<Client> listarClientePorId(@PathVariable Integer id){
        Client cli = service.buscarCliente(id);
        if (cli != null){
            System.out.println(cli.getIdCliente() + " - " + cli.getNome());
            return ResponseEntity.ok(cli);
        }
        return ResponseEntity.notFound().build();
    }
}
