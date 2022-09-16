package com.ibm7.hellobank.Service;

import com.ibm7.hellobank.Model.User;
import com.ibm7.hellobank.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository repo;

    @Override
    public User salvarUsuario(User user) {
        return repo.save(user);
    }

    @Override
    public User buscarUsuario(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public List<User> listarUsuario() {
        return repo.findAll();
    }

    @Override
    public User atualizarUsuario(User user) {
        if (user.getId() != null && user.getUsuario() != null){
            return repo.save(user);
        }
        return null;
    }

    @Override
    public void excluirUsuario(Integer id) {
        repo.deleteById(id);
    }
}
