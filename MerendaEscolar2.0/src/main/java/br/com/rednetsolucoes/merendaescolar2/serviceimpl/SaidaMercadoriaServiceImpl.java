/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar2.serviceimpl;

import br.com.rednetsolucoes.merendaescolar2.dao.SaidaMercadoriaDao;
import br.com.rednetsolucoes.merendaescolar2.dominio.SaidaMercadoria;
import br.com.rednetsolucoes.merendaescolar2.service.SaidaMercadoriaService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Kaique Candido
 */
@Stateless
public class SaidaMercadoriaServiceImpl implements SaidaMercadoriaService {

    @EJB
    private SaidaMercadoriaDao saidaMercadoriaDao;

    @Override
    public boolean salvar(SaidaMercadoria mercadoria) {
        return saidaMercadoriaDao.salvar(mercadoria);
    }

    @Override
    public boolean excluir(SaidaMercadoria mercadoria) {
        return saidaMercadoriaDao.excluir(mercadoria);
    }

    @Override
    public boolean atualizar(SaidaMercadoria mercadoria) {
        return saidaMercadoriaDao.atualizar(mercadoria);
    }

    @Override
    public SaidaMercadoria pesquisar(Class<SaidaMercadoria> entidade, Object chave) {
        return saidaMercadoriaDao.buscar(chave, entidade);
    }

    @Override
    public List<SaidaMercadoria> listar() {
        return saidaMercadoriaDao.listar();
    }

}
