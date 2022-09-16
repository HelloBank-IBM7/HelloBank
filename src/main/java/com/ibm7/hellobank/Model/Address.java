package com.ibm7.hellobank.Model;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="endereco")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_endereco")
    private Integer codigoEndereco;

    @Column(name="logradouro", length=150)
    private String logradouro;

    @Column(name="numero_endereco", length=7)
    private String numeroEndereco;

    @Column(name="bairro", length= 60)
    private String bairro;

    @Column(name="cidade", length= 50)
    private String cidade;

    @Column(name="estado", length= 2)
    private String estado;

    @Column(name="cep", length = 9)
    private String cep;

    public Integer getCodigoEndereco() {
        return codigoEndereco;
    }

    public void setCodigoEndereco(Integer codigoEndereco) {
        this.codigoEndereco = codigoEndereco;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumeroEndereco() {
        return numeroEndereco;
    }

    public void setNumeroEndereco(String numeroEndereco) {
        this.numeroEndereco = numeroEndereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
