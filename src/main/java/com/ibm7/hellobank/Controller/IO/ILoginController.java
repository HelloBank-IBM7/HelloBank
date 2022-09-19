package com.ibm7.hellobank.Controller.IO;

import com.ibm7.hellobank.Model.User;
import com.ibm7.hellobank.Repository.OperationRepository;
import com.ibm7.hellobank.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ILoginController {

    @Autowired
    private UserRepository usuRepo;

    @Autowired
    private OperationRepository opRepo;

    @RequestMapping("/")
    public String login(){
        return "Telas/login";
    }


    @RequestMapping("/logar")
    public String Logar(Model model, User user){
        User usu =this.usuRepo.Login(user.getUsuario(), user.getSenha());
        if (usu != null){
            return "Telas/menu";
        }
        model.addAttribute("erro", "Usuário ou senha inválidos");
        return "Telas/login";
    }
}
