/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar2.service;

import br.com.rednetsolucoes.merendaescolar2.dominio.SaidaMercadoria;
import java.util.List;

/**
 *
 * @author Kaique Candido
 */
public interface SaidaMercadoriaService {
        
    public boolean salvar(SaidaMercadoria mercadoria);

    public boolean excluir(SaidaMercadoria mercadoria);

    public boolean atualizar(SaidaMercadoria mercadoria);

    public SaidaMercadoria pesquisar(Class<SaidaMercadoria> entidade, Object chave);

    public List<SaidaMercadoria> listar();
    
}
