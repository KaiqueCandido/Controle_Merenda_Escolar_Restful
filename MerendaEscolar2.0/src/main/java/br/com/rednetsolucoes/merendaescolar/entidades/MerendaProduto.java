/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar.entidades;

import br.com.rednetsolucoes.merendaescolar.enums.UnidadeMedida;
import java.io.Serializable;
import javax.persistence.CascadeType;
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
public class MerendaProduto implements Serializable{
    
    @Id
    @SequenceGenerator(name = "merendaproduto_generator", sequenceName = "merendaproduto_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "merendaproduto_generator")
    private Long id;
    private int qtde;    
    private UnidadeMedida unidadeMedida;            
    @OneToOne(cascade = CascadeType.ALL)
    private MerendaFornecedor fornecedor;
    private Double valorUnitario;
    private String descricao;
    private String codProduto;
    

    public MerendaProduto() {
    }

    public MerendaProduto(int qtde, UnidadeMedida unidadeMedida, MerendaFornecedor fornecedor, Double valorUnitario, String descricao, String codProduto) {
        this.qtde = qtde;
        this.unidadeMedida = unidadeMedida;
        this.fornecedor = fornecedor;
        this.valorUnitario = valorUnitario;
        this.descricao = descricao;
        this.codProduto = codProduto;
    }

    public MerendaProduto(Long id, int qtde, UnidadeMedida unidadeMedida, MerendaFornecedor fornecedor, Double valorUnitario, String descricao, String codProduto) {
        this.id = id;
        this.qtde = qtde;
        this.unidadeMedida = unidadeMedida;
        this.fornecedor = fornecedor;
        this.valorUnitario = valorUnitario;
        this.descricao = descricao;
        this.codProduto = codProduto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public UnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public MerendaFornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(MerendaFornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    @Override
    public String toString() {
        return "MerendaProduto{" + "id=" + id + ", qtde=" + qtde + ", unidadeMedida=" + unidadeMedida + ", fornecedor=" + fornecedor + ", valorUnitario=" + valorUnitario + ", descricao=" + descricao + ", codProduto=" + codProduto + '}';
    }    
       
}
