package com.ibm7.hellobank.Controller.Tela;

import com.ibm7.hellobank.Model.User;
import com.ibm7.hellobank.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TelaUserController {

    @Autowired
    private UserRepository repo;

    @PostMapping("/NovoUsuario")
    public String novoUsuario(Model model, User user){
        User usu = this.repo.save(user);
        if (usu != null){
            model.addAttribute("erro", "Dados cadastrados com Sucesso!");
        } else {
            model.addAttribute("erro", "Erro ao cadastrar dados!");
        }
        return "Telas/usuario";
    }
}
