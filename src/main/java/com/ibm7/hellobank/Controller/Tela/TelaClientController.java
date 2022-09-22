package com.ibm7.hellobank.Controller.Tela;

import com.ibm7.hellobank.Model.Account;
import com.ibm7.hellobank.Model.Address;
import com.ibm7.hellobank.Model.Client;
import com.ibm7.hellobank.Repository.AccountRepository;
import com.ibm7.hellobank.Repository.AddressRepository;
import com.ibm7.hellobank.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TelaClientController {

    @Autowired
    private AccountRepository conRepo;

    @Autowired
    private AddressRepository endRepo;

    @Autowired
    private ClientRepository cliRepo;

    private Integer cliId;
    private Integer endId;
    private Integer conId;

    @PostMapping("/CadastrarClientes")
    public String cadastrar(Model model, Address address, Client client, Account account){
        Address end = this.endRepo.save(address);

        client.setEnderecoCliente(end.getCodigoEndereco());
        Client cli = this.cliRepo.save(client);
        System.out.println("teste 2: " + cli.getIdCliente());

        account.setIdCliente(cli.getIdCliente());
        Account con = this.conRepo.save(account);
        System.out.println("teste 3: " + con.getIdConta());

        if (con != null){
            model.addAttribute("erro", "Dados cadastrados com Sucesso");
        } else {
            model.addAttribute("erro", "Erro ao cadastrar dados!");
        }
        return "Telas/clientes";
    }

    @PostMapping("/AtualizarClientes")
    public String atualizar(Model model, Client client, Address address, Account account){
        System.out.println(cliId);
        address.setCodigoEndereco(endId);
        Address end = this.endRepo.save(address);
        client.setEnderecoCliente(end.getCodigoEndereco());
        client.setIdCliente(cliId);
        Client cli = this.cliRepo.save(client);
        account.setIdConta(conId);
        account.setIdCliente(cli.getIdCliente());
        Account con = this.conRepo.save(account);
        System.out.println("teste 2: " + cli.getIdCliente());
        if (con != null){
            model.addAttribute("erro", "Dados atualizados com Sucesso!");
        } else {
            model.addAttribute("erro", "Erro ao atualizar dados!");
        }
        return "Telas/clientes";
    }

    @PostMapping("/DeletarClientes")
    public String deletar(Model model, Address address, Client client, Account account){
        String nome = client.getNome();
        Client cli = cliRepo.buscaClientebyName(nome);
        Address end = endRepo.buscaEndereco(cli.getEnderecoCliente());
        Account con = conRepo.buscaCliente(cli.getIdCliente());
        conRepo.deleteById(con.getIdConta());
        cliRepo.deleteById(cli.getIdCliente());
        endRepo.deleteById(end.getCodigoEndereco());
        if (con != null){
            model.addAttribute("erro", "Dados excluídos com Sucesso!");
        } else {
            model.addAttribute("erro", "Erro ao excluir dados!");
        }
        return "Telas/clientes";
    }

    @RequestMapping("/ListarClientes")
    public String lista(Model model, Client client){
        String nome = client.getNome();
        Client cli = cliRepo.buscaClientebyName(nome);
        cliId = cli.getIdCliente();
        System.out.println(cliId);
        if (cli != null){
            model.addAttribute("cNome", cli.getNome());
            model.addAttribute("cEmail", cli.getEmail());
            model.addAttribute("cTelefone", cli.getTelefone());
            model.addAttribute("cCpf", cli.getCpf());

            Address end = endRepo.buscaEndereco(cli.getEnderecoCliente());
            endId = end.getCodigoEndereco();
            model.addAttribute("eCep", end.getCepEndereco());
            model.addAttribute("eRua", end.getRuaEndereco());
            model.addAttribute("eNum", end.getNumeroEndereco());
            model.addAttribute("eBairro", end.getBairroEndereco());
            model.addAttribute("eCidade", end.getCidadeEndereco());
            model.addAttribute("eEstado", end.getEstadoEndereco());

            Account con = conRepo.buscaCliente(cli.getIdCliente());
            conId = con.getIdConta();
            model.addAttribute("nConta", con.getNumeroConta());
            model.addAttribute("nAgencia", con.getAgenciaConta());
            model.addAttribute("nSaldo", con.getSaldoConta());

        }
        return "Telas/clientes";
    }

    @GetMapping("/ListaClientes")
    public String listaCliente(Model model){
        List<Client> cli = (List<Client>) this.cliRepo.findAll();
        model.addAttribute("cli", cli);
        return "Telas/clientes-cadastrados";
    }
}
