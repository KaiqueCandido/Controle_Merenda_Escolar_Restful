/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar.service;

import br.com.rednetsolucoes.merendaescolar.entidades.MerendaFornecedor;
import java.util.List;

/**
 *
 * @author Kaique Candido
 */
public interface MerendaFornecedorService {

    public boolean salvar(MerendaFornecedor fornecedor);

    public boolean excluir(MerendaFornecedor fornecedor);

    public boolean atualizar(MerendaFornecedor fornecedor);

    public MerendaFornecedor pesquisar(Class<MerendaFornecedor> entidade, Object chave);

    public List<MerendaFornecedor> listar();

}
