package com.ibm7.hellobank;

import com.ibm7.hellobank.Model.Client;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ClientesTests {

	@Test
	void ValidarCliente() {
		var cli = new Client();

		cli.setIdCliente(1);

		assertEquals(1, cli.getIdCliente());
	}

//	@Test
//	void CadastrarCliente(){
//		var cli = new Cliente();
//
//		cli.setNome("Rafael");
//		cli.setEmail("rafael@teste.com.br");
//		cli.setTelefone("11 1111-1111");
//		cli.setCpf("111.111.111-11");
//
//		cliente.salvar(cli);
//	}

}
