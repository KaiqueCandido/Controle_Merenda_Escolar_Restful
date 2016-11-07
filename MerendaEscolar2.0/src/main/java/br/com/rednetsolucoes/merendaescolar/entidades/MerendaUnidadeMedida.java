/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar.entidades;

import br.com.rednetsolucoes.merendaescolar.enums.UnidadeMedida;
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
public class MerendaUnidadeMedida implements Serializable {

    @Id
    @SequenceGenerator(name = "merendaunidademedida_generator", sequenceName = "merendaunidademedida_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "merendaunidademedida_generator")
    private Long id;
    private UnidadeMedida unidadeMedida;

    public MerendaUnidadeMedida() {
    }

    public MerendaUnidadeMedida(UnidadeMedida unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public MerendaUnidadeMedida(Long id, UnidadeMedida unidadeMedida) {
        this.id = id;
        this.unidadeMedida = unidadeMedida;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UnidadeMedida getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    @Override
    public String toString() {
        return "MerendaUnidadeMedida{" + "id=" + id + ", unidadeMedida=" + unidadeMedida + '}';
    }

}
