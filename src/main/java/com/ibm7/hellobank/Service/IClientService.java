package com.ibm7.hellobank.Service;

import com.ibm7.hellobank.Model.Client;

import java.util.List;

public interface IClientService {

    public Client salvarCliente(Client client);
    public Client buscarCliente(Integer id);
    public List<Client> listarCliente();
    public Client atualizarCliente(Client client);
    public void excluirCliente(Integer id);
}
