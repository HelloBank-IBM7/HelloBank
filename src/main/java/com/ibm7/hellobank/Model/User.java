package com.ibm7.hellobank.Model;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer id;

    @Column(name = "nome_usuario", nullable = false, length = 10)
    private String usuario;

    @Column(name = "senha_usuario", nullable = false, length = 10)
    private String senha;

    public Integer getId() {
        return id;
    }

    public void setId(Integer idUsuario) {
        this.id = idUsuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
