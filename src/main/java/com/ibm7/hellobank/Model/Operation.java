package com.ibm7.hellobank.Model;

import javax.persistence.*;

@Entity
@Table(name = "transacao")
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transacao")
    private Integer idTransacao;

    @ManyToOne
    @JoinColumn(name = "conta_origem")
    private Account contaOrigem;

    @ManyToOne
    @JoinColumn(name = "conta_destino")
    private Account contaDestino;

    @Column(name = "valor_transacao")
    private double valorTransacao;

    @Column(name = "data_transacao", length = 10)
    private String dataTransacao;

    @Column(name = "tipo_transacao", length = 15)
    private String tipoTransacao;

    public Integer getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(Integer idTransacao) {
        this.idTransacao = idTransacao;
    }

    public Account getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(Account contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public Account getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(Account contaDestino) {
        this.contaDestino = contaDestino;
    }

    public double getValorTransacao() {
        return valorTransacao;
    }

    public void setValorTransacao(double valorTransacao) {
        this.valorTransacao = valorTransacao;
    }

    public String getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(String dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    public String getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(String tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }
}
