/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar2.service;

import br.com.rednetsolucoes.merendaescolar2.dominio.Fornecedor;
import java.util.List;

/**
 *
 * @author Kaique Candido
 */
public interface FornecedorService {

    public boolean salvar(Fornecedor fornecedor);

    public boolean excluir(Fornecedor fornecedor);

    public boolean atualizar(Fornecedor fornecedor);

    public Fornecedor pesquisar(Class<Fornecedor> entidade, Object chave);

    public List<Fornecedor> listar();

}
