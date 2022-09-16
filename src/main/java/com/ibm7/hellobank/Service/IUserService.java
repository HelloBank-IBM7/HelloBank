package com.ibm7.hellobank.Service;

import com.ibm7.hellobank.Model.User;

import java.util.List;

public interface IUserService {

    public User salvarUsuario(User user);
    public User buscarUsuario(Integer id);
    public List<User> listarUsuario();
    public User atualizarUsuario(User user);
    public void excluirUsuario(Integer id);
}
