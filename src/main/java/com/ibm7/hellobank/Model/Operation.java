package com.ibm7.hellobank.Model;

import javax.persistence.*;

@Entity
@Table(name = "transacao")
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transacao")
    private Integer idTransacao;

    @Column(name = "conta_origem")
    private Integer contaOrigem;

    @Column(name = "conta_destino")
    private Integer contaDestino;

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

    public Integer getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(Integer contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public Integer getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(Integer contaDestino) {
        this.contaDestino = contaDestino;
    }
}
