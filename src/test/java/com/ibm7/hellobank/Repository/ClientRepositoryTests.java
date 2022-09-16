package com.ibm7.hellobank.Repository;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class ClientRepositoryTests {

    @Autowired
    private ClientRepository cliRepository;

//    @Test
//    void validarFindDoDaoCliente() {
//        assertEquals(  0, cliRepository.count());
//    }

    @Test
    void validarListarCliente(){
        cliRepository.findAll();
    }

    @Test
    void validarBuscarCliente(){
        cliRepository.findById(1);
    }

//    @Test
//    void validarDeletarCliente(){
//        cliRepository.deleteById(1);
//    }

//    @Test
//    void validarNovoCliente(){
//        var cli = new Cliente();
//        cli.setIdCliente(1);
//        cli.setNome("teste");
//        cli.setEmail("teste@teste.com");
//        cli.setTelefone("11 1111-1111");
//        cli.setCpf("111.111.111-11");
//
//        cliRepository.save(cli);
//    }
}
