/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar2.serviceimpl;

import br.com.rednetsolucoes.merendaescolar2.dao.FornecedorDao;
import br.com.rednetsolucoes.merendaescolar2.dominio.Fornecedor;
import br.com.rednetsolucoes.merendaescolar2.service.FornecedorService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Kaique Candido
 */
@Stateless
public class FornecedorServiceImpl implements FornecedorService {

    @EJB
    private FornecedorDao fornecedorDAO;

    @Override
    public boolean salvar(Fornecedor fornecedor) {
        return fornecedorDAO.salvar(fornecedor);
    }

    @Override
    public boolean excluir(Fornecedor fornecedor) {
        return fornecedorDAO.excluir(fornecedor);
    }

    @Override
    public boolean atualizar(Fornecedor fornecedor) {
        return fornecedorDAO.atualizar(fornecedor);
    }

    @Override
    public Fornecedor pesquisar(Class<Fornecedor> entidade, Object chave) {
        return fornecedorDAO.buscar(chave, entidade);
    }

    @Override
    public List<Fornecedor> listar() {
        return fornecedorDAO.listar();
    }

}
