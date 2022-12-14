package com.ibm7.hellobank.Model;
import javax.persistence.*;

@Entity
@Table(name = "conta")
public class Account {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id_conta")
    private Integer idConta;

    @Column(name = "agencia_conta", nullable = false)
    private Integer agenciaConta;

    @Column(name = "numero_conta", nullable = false)
    private Integer numeroConta;

    @Column(name = "saldo")
    private Double saldoConta;

    @Column(name = "id_cliente")
    private Integer idCliente;

    public Integer getIdConta() {
        return idConta;
    }

    public void setIdConta(Integer idConta) {
        this.idConta = idConta;
    }

    public Integer getAgenciaConta() {
        return agenciaConta;
    }

    public void setAgenciaConta(Integer agenciaConta) {
        this.agenciaConta = agenciaConta;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(Double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
}
