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
public class Fornecedor implements Serializable {

    @Id
    @SequenceGenerator(name = "fornecedor_generator", sequenceName = "fornecedor_seq", initialValue = 1, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fornecedor_generator")
    private Long id;

    private String razaoSocial;
    private String CPF_CNPJ;

    public Fornecedor() {
    }

    public Fornecedor(String razaoSocial, String CPF_CNPJ) {
        this.razaoSocial = razaoSocial;
        this.CPF_CNPJ = CPF_CNPJ;
    }

    public Fornecedor(Long id, String razaoSocial, String CPF_CNPJ) {
        this.id = id;
        this.razaoSocial = razaoSocial;
        this.CPF_CNPJ = CPF_CNPJ;
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

    public String getCPF_CNPJ() {
        return CPF_CNPJ;
    }

    public void setCPF_CNPJ(String CPF_CNPJ) {
        this.CPF_CNPJ = CPF_CNPJ;
    }

    @Override
    public String toString() {
        return "Fornecedor{" + "id=" + id + ", razaoSocial=" + razaoSocial + ", CPF_CNPJ=" + CPF_CNPJ + '}';
    }

}
