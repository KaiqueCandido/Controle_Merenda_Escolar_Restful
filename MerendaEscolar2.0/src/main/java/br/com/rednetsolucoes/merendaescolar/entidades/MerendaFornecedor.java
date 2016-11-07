/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar.entidades;

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
public class MerendaFornecedor implements Serializable {

    @Id
    @SequenceGenerator(name = "merendafornecedor_generator", sequenceName = "merendafornecedor_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "merendafornecedor_generator")
    private Long id;
    private String razaoSocial;
    private String cpf_cnpj;

    public MerendaFornecedor() {
    }

    public MerendaFornecedor(String razaoSocial, String cpf_cnpj) {
        this.razaoSocial = razaoSocial;
        this.cpf_cnpj = cpf_cnpj;
    }

    public MerendaFornecedor(Long id, String razaoSocial, String cpf_cnpj) {
        this.id = id;
        this.razaoSocial = razaoSocial;
        this.cpf_cnpj = cpf_cnpj;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCpf_cnpj() {
        return cpf_cnpj;
    }

    public void setCpf_cnpj(String cpf_cnpj) {
        this.cpf_cnpj = cpf_cnpj;
    }

    @Override
    public String toString() {
        return "MerendaFornecedor{" + "id=" + id + ", razaoSocial=" + razaoSocial + ", cpf_cnpj=" + cpf_cnpj + '}';
    }

}
