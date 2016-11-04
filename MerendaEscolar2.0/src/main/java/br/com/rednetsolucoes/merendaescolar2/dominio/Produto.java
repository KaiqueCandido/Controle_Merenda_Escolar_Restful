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
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Kaique Candido
 */
@Entity
public class Produto implements Serializable {

    @Id
    @SequenceGenerator(name = "produto_generator", sequenceName = "produto_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto_generator")
    private Long id;
    private String codigoProduto;
    private String descricao;
    private Long quantidade;

    public Produto() {
    }

    public Produto(String codigoProduto, String descricao, Long qtdeEstoque) {
        this.codigoProduto = codigoProduto;
        this.descricao = descricao;
        this.quantidade = qtdeEstoque;
    }

    public Produto(Long id, String codigoProduto, String descricao, Long qtdeEstoque) {
        this.id = id;
        this.codigoProduto = codigoProduto;
        this.descricao = descricao;
        this.quantidade = qtdeEstoque;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", codigoProduto=" + codigoProduto + ", descricao=" + descricao + ", quantidade=" + quantidade + '}';
    }

}
