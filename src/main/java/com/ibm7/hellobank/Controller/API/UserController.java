package com.ibm7.hellobank.Controller.API;

import com.ibm7.hellobank.Model.User;
import com.ibm7.hellobank.Service.IUserService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class UserController {

    @Autowired
    private IUserService service;

    @GetMapping("/usuario")
    public ArrayList<User> listarUsuario(){
        return (ArrayList<User>) service.listarUsuario();
    }

    @PostMapping("/usuario")
    public ResponseEntity<User> novoUsuario(@RequestBody User user){
        User usu = service.salvarUsuario(user);
        if (usu != null){
            return ResponseEntity.ok(usu);
        }
        return ResponseEntity.badRequest().build();
    }

    @PutMapping("/usuario")
    public ResponseEntity<User> alterarUsuario(@RequestBody User user){
        User usu = service.atualizarUsuario(user);
        if (usu != null){
            return ResponseEntity.ok(usu);
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/usuario/{id}")
    public ResponseEntity<User> deletarusuario(@PathVariable Integer id){
        service.excluirUsuario(id);
        return ResponseEntity.ok(null);
    }

    @GetMapping("/usuario/{id}")
    public ResponseEntity<User> listarUsuarioPorId(@PathVariable Integer id){
        User usu = service.buscarUsuario(id);
        if (usu != null){
            return ResponseEntity.ok(usu);
        }
        return ResponseEntity.badRequest().build();
    }
}
