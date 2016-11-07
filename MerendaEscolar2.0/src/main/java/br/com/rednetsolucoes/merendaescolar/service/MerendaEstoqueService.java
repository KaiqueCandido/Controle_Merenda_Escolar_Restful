/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar.service;

import br.com.rednetsolucoes.merendaescolar.entidades.MerendaEstoque;
import java.util.List;

/**
 *
 * @author Kaique Candido
 */
public interface MerendaEstoqueService {

    public boolean salvar(MerendaEstoque escola);

    public boolean excluir(MerendaEstoque escola);

    public boolean atualizar(MerendaEstoque escola);

    public MerendaEstoque pesquisar(Class<MerendaEstoque> entidade, Object chave);

    public List<MerendaEstoque> listar();    

}
