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
public class EntradaMercadoria implements Serializable{
    
    @Id
    @SequenceGenerator(name = "entrada_generator", sequenceName = "entrada_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "entrada_generator")
    private Long id;
    
    @OneToOne
    private Produto produto;
    @OneToOne
    private Fornecedor fornecedor;
    
    private Long qtdeUnidade;
    private String dataValidade;
    private double valorunitario;
    private String tipoUnidade;
    private String dataEntrada;
    private String numeroNotaFical;

    public EntradaMercadoria() {
    }

    public EntradaMercadoria(Produto produto, Fornecedor fornecedor, Long qtdeUnidade, String dataValidade, double valorunitario, String tipoUnidade, String dataEntrada, String numeroNotaFical) {
        this.produto = produto;
        this.fornecedor = fornecedor;
        this.qtdeUnidade = qtdeUnidade;
        this.dataValidade = dataValidade;
        this.valorunitario = valorunitario;
        this.tipoUnidade = tipoUnidade;
        this.dataEntrada = dataEntrada;
        this.numeroNotaFical = numeroNotaFical;
    }

    public EntradaMercadoria(Long id, Produto produto, Fornecedor fornecedor, Long qtdeUnidade, String dataValidade, double valorunitario, String tipoUnidade, String dataEntrada, String numeroNotaFical) {
        this.id = id;
        this.produto = produto;
        this.fornecedor = fornecedor;
        this.qtdeUnidade = qtdeUnidade;
        this.dataValidade = dataValidade;
        this.valorunitario = valorunitario;
        this.tipoUnidade = tipoUnidade;
        this.dataEntrada = dataEntrada;
        this.numeroNotaFical = numeroNotaFical;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Long getQtdeUnidade() {
        return qtdeUnidade;
    }

    public void setQtdeUnidade(Long qtdeUnidade) {
        this.qtdeUnidade = qtdeUnidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public double getValorunitario() {
        return valorunitario;
    }

    public void setValorunitario(double valorunitario) {
        this.valorunitario = valorunitario;
    }

    public String getTipoUnidade() {
        return tipoUnidade;
    }

    public void setTipoUnidade(String tipoUnidade) {
        this.tipoUnidade = tipoUnidade;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getNumeroNotaFical() {
        return numeroNotaFical;
    }

    public void setNumeroNotaFical(String numeroNotaFical) {
        this.numeroNotaFical = numeroNotaFical;
    }
                
}
