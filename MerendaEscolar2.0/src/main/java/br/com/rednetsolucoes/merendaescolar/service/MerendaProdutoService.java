/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar.service;

import br.com.rednetsolucoes.merendaescolar.entidades.MerendaProduto;
import java.util.List;

/**
 *
 * @author Kaique Candido
 */
public interface MerendaProdutoService {

    public boolean salvar(MerendaProduto produto);

    public boolean excluir(MerendaProduto produto);

    public boolean atualizar(MerendaProduto produto);

    public MerendaProduto pesquisar(Class<MerendaProduto> entidade, Object chave);

    public List<MerendaProduto> listar();

}
