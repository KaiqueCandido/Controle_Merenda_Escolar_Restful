/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar.service;

import br.com.rednetsolucoes.merendaescolar.entidades.MerendaEntradaMercadoria;
import java.util.List;

/**
 *
 * @author Kaique Candido
 */
public interface MerendaEntradaMercadoriaService {

    public boolean salvar(MerendaEntradaMercadoria mercadoria);

    public boolean excluir(MerendaEntradaMercadoria mercadoria);

    public boolean atualizar(MerendaEntradaMercadoria mercadoria);

    public MerendaEntradaMercadoria pesquisar(Class<MerendaEntradaMercadoria> entidade, Object chave);

    public List<MerendaEntradaMercadoria> listar();

}
