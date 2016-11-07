/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar.entidades;

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
public class MerendaEscola implements Serializable {

    @Id
    @SequenceGenerator(name = "merendaescola_generator", sequenceName = "merendaescola_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "merendaescola_generator")
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    private MerendaEstoque estoque;
    private String nome;
    private Long idEscola;

    public MerendaEscola() {
    }

    public MerendaEscola(MerendaEstoque estoque, String nome, Long idEscola) {
        this.estoque = estoque;
        this.nome = nome;
        this.idEscola = idEscola;
    }

    public MerendaEscola(Long id, MerendaEstoque estoque, String nome, Long idEscola) {
        this.id = id;
        this.estoque = estoque;
        this.nome = nome;
        this.idEscola = idEscola;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MerendaEstoque getEstoque() {
        return estoque;
    }

    public void setEstoque(MerendaEstoque estoque) {
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getIdEscola() {
        return idEscola;
    }

    public void setIdEscola(Long idEscola) {
        this.idEscola = idEscola;
    }

    @Override
    public String toString() {
        return "MerendaEscola{" + "id=" + id + ", estoque=" + estoque + ", nome=" + nome + ", idEscola=" + idEscola + '}';
    }

}
