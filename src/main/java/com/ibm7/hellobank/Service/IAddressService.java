package com.ibm7.hellobank.Service;

import com.ibm7.hellobank.Model.Address;

import java.util.List;

public interface IAddressService {

    public Address salvarEndereco(Address address);
    public Address buscarEndereco(Integer id);
    public List<Address> listarEndereco();
    public Address atualizarEndereco(Address address);
    public void excluirEndereco(Integer id);

}
