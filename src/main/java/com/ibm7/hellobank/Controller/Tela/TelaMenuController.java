package com.ibm7.hellobank.Controller.Tela;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TelaMenuController {

    @RequestMapping("/Transacoes")
    public String telaTransacoes(){
        return "Telas/simulador";
    }

    @RequestMapping("/Menu")
    public String telaMenu(){
        return "Telas/menu";
    }

    @RequestMapping("/Clientes")
    public String telaClientes() {
        return "Telas/clientes";
    }


    @RequestMapping("/Usuario")
    public String telaUsuario(){
        return "Telas/usuario";
    }
}
