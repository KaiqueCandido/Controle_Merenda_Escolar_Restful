/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar.serviceimpl;

import br.com.rednetsolucoes.merendaescolar.dao.MerendaSaidaMercadoriaDAO;
import br.com.rednetsolucoes.merendaescolar.entidades.MerendaSaidaMercadoria;
import br.com.rednetsolucoes.merendaescolar.service.MerendaSaidaMercadoriaService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Kaique Candido
 */
@Stateless
public class MerendaSaidaMercadoriaServiceImpl implements MerendaSaidaMercadoriaService {

    @EJB
    private MerendaSaidaMercadoriaDAO dao;

    @Override
    public boolean salvar(MerendaSaidaMercadoria mercadoria) {
        return dao.salvar(mercadoria);
    }

    @Override
    public boolean excluir(MerendaSaidaMercadoria mercadoria) {
        return dao.excluir(mercadoria);
    }

    @Override
    public boolean atualizar(MerendaSaidaMercadoria mercadoria) {
        return dao.atualizar(mercadoria);
    }

    @Override
    public MerendaSaidaMercadoria pesquisar(Class<MerendaSaidaMercadoria> entidade, Object chave) {
        return dao.buscar(chave, entidade);
    }

    @Override
    public List<MerendaSaidaMercadoria> listar() {
        return dao.listar();
    }

}
