/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar2.dominio;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Kaique Candido
 */
@Entity
public class SaidaMercadoria implements Serializable {

    @Id
    @SequenceGenerator(name = "saida_generator", sequenceName = "saida_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "saida_generator")
    private Long id;
    
    private String escola;
    @OneToOne
    private Produto produto;
    private long qtdeUnidade;
    private String tipoUnidade;
    private String dataSaida;

    public SaidaMercadoria() {
    }

    public SaidaMercadoria(String escola, Produto produto, long qtdeUnidade, String tipoUnidade, String dataSaida) {
        this.escola = escola;
        this.produto = produto;
        this.qtdeUnidade = qtdeUnidade;
        this.tipoUnidade = tipoUnidade;
        this.dataSaida = dataSaida;
    }

    public SaidaMercadoria(Long id, String escola, Produto produto, long qtdeUnidade, String tipoUnidade, String dataSaida) {
        this.id = id;
        this.escola = escola;
        this.produto = produto;
        this.qtdeUnidade = qtdeUnidade;
        this.tipoUnidade = tipoUnidade;
        this.dataSaida = dataSaida;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public long getQtdeUnidade() {
        return qtdeUnidade;
    }

    public void setQtdeUnidade(long qtdeUnidade) {
        this.qtdeUnidade = qtdeUnidade;
    }

    public String getTipoUnidade() {
        return tipoUnidade;
    }

    public void setTipoUnidade(String tipoUnidade) {
        this.tipoUnidade = tipoUnidade;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }
        
}
