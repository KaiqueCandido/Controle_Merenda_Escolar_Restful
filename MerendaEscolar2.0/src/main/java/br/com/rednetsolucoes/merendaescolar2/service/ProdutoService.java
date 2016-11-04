/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar2.service;

import br.com.rednetsolucoes.merendaescolar2.dominio.Produto;
import java.util.List;

/**
 *
 * @author Kaique Candido
 */
public interface ProdutoService {

    public boolean salvar(Produto produto);

    public boolean excluir(Produto produto);

    public boolean atualizar(Produto produto);

    public Produto pesquisar(Class<Produto> entidade, Object chave);

    public List<Produto> listar();

}
