/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar2.serviceimpl;

import br.com.rednetsolucoes.merendaescolar2.dao.EntradaMercadoriaDao;
import br.com.rednetsolucoes.merendaescolar2.dominio.EntradaMercadoria;
import br.com.rednetsolucoes.merendaescolar2.service.EntradaMercadoriaService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Kaique Candido
 */
@Stateless
public class EntradaMercadoriaServiceImpl implements EntradaMercadoriaService {

    @EJB
    private EntradaMercadoriaDao entradaMercadoriaDao;

    @Override
    public boolean salvar(EntradaMercadoria mercadoria) {
        return entradaMercadoriaDao.salvar(mercadoria);
    }

    @Override
    public boolean excluir(EntradaMercadoria mercadoria) {
        return entradaMercadoriaDao.excluir(mercadoria);
    }

    @Override
    public boolean atualizar(EntradaMercadoria mercadoria) {
        return entradaMercadoriaDao.atualizar(mercadoria);
    }

    @Override
    public EntradaMercadoria pesquisar(Class<EntradaMercadoria> entidade, Object chave) {
        return entradaMercadoriaDao.buscar(chave, entidade);
    }

    @Override
    public List<EntradaMercadoria> listar() {
        return entradaMercadoriaDao.listar();
    }

}
