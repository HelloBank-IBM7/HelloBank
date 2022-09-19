package com.ibm7.hellobank.Controller.IO;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IMenuController {

    @RequestMapping("/Clientes")
    public String telaClientes(){
        return "Telas/clientes";
    }

    @RequestMapping("/Transacoes")
    public String telaTransacoes(){
        return "Telas/simulador";
    }

    @RequestMapping("/ListaClientes")
    public String telaListaClientes(){
        return "Telas/clientes-cadastrados";
    }
}
