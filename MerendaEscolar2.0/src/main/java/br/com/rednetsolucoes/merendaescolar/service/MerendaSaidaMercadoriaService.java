/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar.service;

import br.com.rednetsolucoes.merendaescolar.entidades.MerendaSaidaMercadoria;
import java.util.List;

/**
 *
 * @author Kaique Candido
 */
public interface MerendaSaidaMercadoriaService {

    public boolean salvar(MerendaSaidaMercadoria mercadoria);

    public boolean excluir(MerendaSaidaMercadoria mercadoria);

    public boolean atualizar(MerendaSaidaMercadoria mercadoria);

    public MerendaSaidaMercadoria pesquisar(Class<MerendaSaidaMercadoria> entidade, Object chave);

    public List<MerendaSaidaMercadoria> listar();

}
