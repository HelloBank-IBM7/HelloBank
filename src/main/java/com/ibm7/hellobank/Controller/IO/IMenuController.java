package com.ibm7.hellobank.Controller.IO;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IMenuController {

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

//    @RequestMapping("/ListaClientes")
//    public String telaListaClientes() {
//        return "Telas/clientes-cadastrados";
//    }

//    @RequestMapping("/Historico")
//    public String telaHistorico(){
//        return "Telas/transacoes";
//    }

    @RequestMapping("/Usuario")
    public String telaUsuario(){
        return "#";
    }
}
