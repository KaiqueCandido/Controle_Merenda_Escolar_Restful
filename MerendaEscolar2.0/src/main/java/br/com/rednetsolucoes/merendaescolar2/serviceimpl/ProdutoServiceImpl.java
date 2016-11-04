/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar2.serviceimpl;

import br.com.rednetsolucoes.merendaescolar2.dao.ProdutoDao;
import br.com.rednetsolucoes.merendaescolar2.dominio.Produto;
import br.com.rednetsolucoes.merendaescolar2.service.ProdutoService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Kaique Candido
 */
@Stateless
public class ProdutoServiceImpl implements ProdutoService {

    @EJB
    private ProdutoDao produtoDAO;

    @Override
    public boolean salvar(Produto produto) {
        return produtoDAO.salvar(produto);
    }

    @Override
    public boolean excluir(Produto produto) {
        return produtoDAO.excluir(produto);
    }

    @Override
    public boolean atualizar(Produto produto) {
        return produtoDAO.atualizar(produto);
    }

    @Override
    public Produto pesquisar(Class<Produto> entidade, Object chave) {
        return produtoDAO.buscar(chave, entidade);
    }

    @Override
    public List<Produto> listar() {
        return produtoDAO.listar();
    }

}
