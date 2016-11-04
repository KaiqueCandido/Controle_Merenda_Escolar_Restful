/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar2.dominio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kaique Candido
 */
@Entity
@XmlRootElement
public class EscolaEstoque implements Serializable {

    @Id
    @SequenceGenerator(name = "escola_generator", sequenceName = "escola_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "escola_generator")
    private Long id;
    private String nomeEscola;
    private Long idEscola;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Produto> estoque;

    public EscolaEstoque() {
    }

    public EscolaEstoque(String nomeEscola, Long idEscola, List<Produto> estoque) {
        this.nomeEscola = nomeEscola;
        this.idEscola = idEscola;
        this.estoque = estoque;
    }

    public EscolaEstoque(Long id, String nomeEscola, Long idEscola, List<Produto> estoque) {
        this.id = id;
        this.nomeEscola = nomeEscola;
        this.idEscola = idEscola;
        this.estoque = estoque;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public Long getIdEscola() {
        return idEscola;
    }

    public void setIdEscola(Long idEscola) {
        this.idEscola = idEscola;
    }

    public List<Produto> getEstoque() {
        return estoque;
    }

    public void setEstoque(List<Produto> estoque) {
        this.estoque = estoque;
    }

}
