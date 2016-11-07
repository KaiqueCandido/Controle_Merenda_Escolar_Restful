/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Kaique Candido
 */
@Entity
public class MerendaEntradaMercadoria implements Serializable {

    @Id
    @SequenceGenerator(name = "merendaentradamercadoria_generator", sequenceName = "merendaentradamercadoria_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "merendaentradamercadoria_generator")
    private Long id;
    @OneToMany(fetch = FetchType.LAZY)
    private List<MerendaProduto> produtos;
    private String dataCompra;
    private String dataEntrada;
    private String numeroNotaFical;
    private int qtdeEntrada;

    public MerendaEntradaMercadoria() {
        this.produtos = new ArrayList<>();
    }

    public MerendaEntradaMercadoria(String dataCompra, String dataEntrada, String numeroNotaFical, int qtdeEntrada) {
        this.produtos = new ArrayList<>();
        this.dataCompra = dataCompra;
        this.dataEntrada = dataEntrada;
        this.numeroNotaFical = numeroNotaFical;
        this.qtdeEntrada = qtdeEntrada;
    }

    public MerendaEntradaMercadoria(Long id, String dataCompra, String dataEntrada, String numeroNotaFical, int qtdeEntrada) {
        this.id = id;
        this.produtos = new ArrayList<>();
        this.dataCompra = dataCompra;
        this.dataEntrada = dataEntrada;
        this.numeroNotaFical = numeroNotaFical;
        this.qtdeEntrada = qtdeEntrada;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<MerendaProduto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<MerendaProduto> produtos) {
        this.produtos = produtos;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
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

    public int getQtdeEntrada() {
        return qtdeEntrada;
    }

    public void setQtdeEntrada(int qtdeEntrada) {
        this.qtdeEntrada = qtdeEntrada;
    }

    public boolean addNovoProduto(MerendaProduto produto) {
        this.getProdutos().add(produto);
        return true;
    }

    @Override
    public String toString() {
        return "MerendaEntradaMercadoria{" + "id=" + id + ", produtos=" + produtos + ", dataCompra=" + dataCompra + ", dataEntrada=" + dataEntrada + ", numeroNotaFical=" + numeroNotaFical + '}';
    }

}
