/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar2.service;

import br.com.rednetsolucoes.merendaescolar2.dominio.EscolaEstoque;
import java.util.List;

/**
 *
 * @author Kaique Candido
 */
public interface EscolaEstoqueService {

    public boolean salvar(EscolaEstoque escola);

    public boolean excluir(EscolaEstoque escola);

    public boolean atualizar(EscolaEstoque escola);

    public EscolaEstoque pesquisar(Class<EscolaEstoque> entidade, Object chave);

    public List<EscolaEstoque> listar();

    public List<EscolaEstoque> listarEscolas();

}
