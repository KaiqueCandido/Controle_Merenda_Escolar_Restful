/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar.service;

import br.com.rednetsolucoes.merendaescolar.entidades.MerendaEscola;
import java.util.List;

/**
 *
 * @author Kaique Candido
 */
public interface MerendaEscolaService {

    public boolean salvar(MerendaEscola escola);

    public boolean excluir(MerendaEscola escola);

    public boolean atualizar(MerendaEscola escola);

    public MerendaEscola pesquisar(Class<MerendaEscola> entidade, Object chave);

    public List<MerendaEscola> listar();

    public List<MerendaEscola> listarEscolas();

}
