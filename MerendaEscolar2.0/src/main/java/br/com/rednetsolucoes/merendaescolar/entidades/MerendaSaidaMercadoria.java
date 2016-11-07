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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Kaique Candido
 */
@Entity
public class MerendaSaidaMercadoria implements Serializable {

    @Id
    @SequenceGenerator(name = "merendasaidamercadoria_generator", sequenceName = "merendasaidamercadoria_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "merendasaidamercadoria_generator")
    private Long id;
    @OneToOne
    private MerendaEscola escola;
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<MerendaProduto> produtos;

    public MerendaSaidaMercadoria() {
    }

    public MerendaSaidaMercadoria(MerendaEscola escola) {
        this.escola = escola;
        this.produtos = new ArrayList<>();
    }

    public MerendaSaidaMercadoria(Long id, MerendaEscola escola) {
        this.id = id;
        this.escola = escola;
        this.produtos = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MerendaEscola getEscola() {
        return escola;
    }

    public void setEscola(MerendaEscola escola) {
        this.escola = escola;
    }

    public List<MerendaProduto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<MerendaProduto> produtos) {
        this.produtos = produtos;
    }

    public boolean addNovoProduto(MerendaProduto produto) {
        this.getProdutos().add(produto);
        return true;
    }

    @Override
    public String toString() {
        return "MerendaSaidaMercadoria{" + "id=" + id + ", escola=" + escola + ", produtos=" + produtos + '}';
    }

}
