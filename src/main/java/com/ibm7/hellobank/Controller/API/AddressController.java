package com.ibm7.hellobank.Controller.API;

import com.ibm7.hellobank.Model.Account;
import com.ibm7.hellobank.Model.Address;
import com.ibm7.hellobank.Repository.AddressRepository;
import com.ibm7.hellobank.Service.IAddressService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class AddressController {

    @Autowired
    private IAddressService service;

    @GetMapping("/endereco")
    public ArrayList<Address> listaEndereco(){
        return (ArrayList<Address>) service.listarEndereco();
    }

    @PostMapping("/endereco")
    public ResponseEntity<Address> novoEndereco(@RequestBody Address address){
        Address end = service.salvarEndereco(address);
        if (end != null){
            return ResponseEntity.ok(end);
        }
        return ResponseEntity.badRequest().build();
    }

    @PutMapping("/endereco")
    public ResponseEntity<Address> alterarEndereco(@RequestBody Address address){
        Address end = service.atualizarEndereco(address);
        if (end != null){
            return ResponseEntity.ok(end);
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/endereco/{id}")
    public ResponseEntity<Address> deletarConta(@PathVariable Integer id){
        service.excluirEndereco(id);
        return ResponseEntity.ok(null);
    }

    @GetMapping("/endereco/{id}")
    public ResponseEntity<Address> listarEnderecoPorId(@PathVariable Integer id){
        Address end = service.buscarEndereco(id);
        if (end != null){
            return ResponseEntity.ok(end);
        }
        return ResponseEntity.notFound().build();
    }
}
