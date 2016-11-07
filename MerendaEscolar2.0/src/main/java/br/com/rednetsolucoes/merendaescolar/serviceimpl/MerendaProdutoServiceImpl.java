/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar.serviceimpl;

import br.com.rednetsolucoes.merendaescolar.dao.MerendaProdutoDAO;
import br.com.rednetsolucoes.merendaescolar.entidades.MerendaProduto;
import br.com.rednetsolucoes.merendaescolar.service.MerendaProdutoService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Kaique Candido
 */
@Stateless
public class MerendaProdutoServiceImpl implements MerendaProdutoService {

    @EJB
    private MerendaProdutoDAO dao;

    @Override
    public boolean salvar(MerendaProduto produto) {
        return dao.salvar(produto);
    }

    @Override
    public boolean excluir(MerendaProduto produto) {
        return dao.excluir(produto);
    }

    @Override
    public boolean atualizar(MerendaProduto produto) {
        return dao.atualizar(produto);
    }

    @Override
    public MerendaProduto pesquisar(Class<MerendaProduto> entidade, Object chave) {
        return dao.buscar(chave, entidade);
    }

    @Override
    public List<MerendaProduto> listar() {
        return dao.listar();
    }

}
