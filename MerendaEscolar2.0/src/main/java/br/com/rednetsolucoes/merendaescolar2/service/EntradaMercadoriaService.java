/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar2.service;

import br.com.rednetsolucoes.merendaescolar2.dominio.EntradaMercadoria;
import java.util.List;

/**
 *
 * @author Kaique Candido
 */
public interface EntradaMercadoriaService {

    public boolean salvar(EntradaMercadoria mercadoria);

    public boolean excluir(EntradaMercadoria mercadoria);

    public boolean atualizar(EntradaMercadoria mercadoria);

    public EntradaMercadoria pesquisar(Class<EntradaMercadoria> entidade, Object chave);

    public List<EntradaMercadoria> listar();

}
