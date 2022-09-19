package com.ibm7.hellobank.Model;
import javax.persistence.*;

@Entity
@Table(name = "cliente")
public class Client {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_cliente")
    private Integer idCliente;

    @Column(name = "nome_cliente", nullable = false, length=90)
    private String nome;

    @Column(name = "email_cliente", nullable = false, length=50)
    private String email;

    @Column(name = "telefone_cliente", nullable = false, length=20)
    private String telefone;

    @Column(name = "cpf_cliente", nullable = false, length=15)
    private String cpf;

    @Column(name = "endereco_cliente", nullable = false)
    private Integer enderecoCliente;

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(Integer enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }
}
