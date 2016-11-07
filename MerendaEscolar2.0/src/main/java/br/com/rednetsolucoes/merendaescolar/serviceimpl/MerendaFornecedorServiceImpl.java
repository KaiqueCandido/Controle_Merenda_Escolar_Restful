/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar.serviceimpl;

import br.com.rednetsolucoes.merendaescolar.dao.MerendaFornecedorDAO;
import br.com.rednetsolucoes.merendaescolar.entidades.MerendaFornecedor;
import br.com.rednetsolucoes.merendaescolar.service.MerendaFornecedorService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Kaique Candido
 */
@Stateless
public class MerendaFornecedorServiceImpl implements MerendaFornecedorService {

    @EJB
    private MerendaFornecedorDAO dao;

    @Override
    public boolean salvar(MerendaFornecedor fornecedor) {
        return dao.salvar(fornecedor);
    }

    @Override
    public boolean excluir(MerendaFornecedor fornecedor) {
        return dao.excluir(fornecedor);
    }

    @Override
    public boolean atualizar(MerendaFornecedor fornecedor) {
        return dao.atualizar(fornecedor);
    }

    @Override
    public MerendaFornecedor pesquisar(Class<MerendaFornecedor> entidade, Object chave) {
        return dao.buscar(chave, entidade);
    }

    @Override
    public List<MerendaFornecedor> listar() {
        return dao.listar();
    }

}
