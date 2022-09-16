package com.ibm7.hellobank.Service;

import com.ibm7.hellobank.Model.Address;
import com.ibm7.hellobank.Repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressServiceImpl implements IAddressService {

    @Autowired
    private AddressRepository repo;

    @Override
    public Address salvarEndereco(Address address) {
        return repo.save(address);
    }

    @Override
    public Address buscarEndereco(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<Address> listarEndereco() {
        return (ArrayList<Address>) repo.findAll();
    }

    @Override
    public Address atualizarEndereco(Address address) {
        if (address.getCodigoEndereco() != null){
            return repo.save(address);
        }
        return null;
    }

    @Override
    public void excluirEndereco(Integer id) {
        repo.deleteById(id);
    }
}
