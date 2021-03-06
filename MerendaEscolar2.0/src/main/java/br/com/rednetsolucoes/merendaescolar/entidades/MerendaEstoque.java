/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
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
public class MerendaEstoque implements Serializable {

    @Id
    @SequenceGenerator(name = "merendaestoque_generator", sequenceName = "merendaestoque_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "merendaestoque_generator")
    private Long id;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<MerendaProduto> produtos;

    public MerendaEstoque() {
        this.produtos = new ArrayList<>();
    }

    public MerendaEstoque(Long id) {
        this.id = id;
        this.produtos = new ArrayList<>();
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
    
    public boolean addNovoProduto(MerendaProduto produto){
        this.getProdutos().add(produto);
        return true;
    }

    @Override
    public String toString() {
        return "Estoque{" + "id=" + id + ", produtos=" + produtos + '}';
    }

}
