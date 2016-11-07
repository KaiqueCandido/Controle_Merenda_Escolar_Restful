/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar.serviceimpl;

import br.com.rednetsolucoes.merendaescolar.dao.MerendaEntradaMercadoriaDAO;
import br.com.rednetsolucoes.merendaescolar.entidades.MerendaEntradaMercadoria;
import br.com.rednetsolucoes.merendaescolar.service.*;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Kaique Candido
 */
@Stateless
public class MerendaEntradaMercadoriaServiceImpl implements MerendaEntradaMercadoriaService {

    @EJB
    private MerendaEntradaMercadoriaDAO dao;

    @Override
    public boolean salvar(MerendaEntradaMercadoria mercadoria) {
        return dao.salvar(mercadoria);
    }

    @Override
    public boolean excluir(MerendaEntradaMercadoria mercadoria) {
        return dao.excluir(mercadoria);
    }

    @Override
    public boolean atualizar(MerendaEntradaMercadoria mercadoria) {
        return dao.atualizar(mercadoria);
    }

    @Override
    public MerendaEntradaMercadoria pesquisar(Class<MerendaEntradaMercadoria> entidade, Object chave) {
        return dao.buscar(chave, entidade);
    }

    @Override
    public List<MerendaEntradaMercadoria> listar() {
        return dao.listar();
    }

}
