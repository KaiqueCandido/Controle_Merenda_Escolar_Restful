/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar.serviceimpl;

import br.com.rednetsolucoes.merendaescolar.dao.MerendaEstoqueDAO;
import br.com.rednetsolucoes.merendaescolar.entidades.MerendaEstoque;
import br.com.rednetsolucoes.merendaescolar.service.*;
import br.com.rednetsolucoes.merendaescolar2.dominio.EscolaEstoque;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

/**
 *
 * @author Kaique Candido
 */
@Stateless
public class MerendaEstoqueServiceImpl implements MerendaEstoqueService {

    @EJB
    private MerendaEstoqueDAO dao;

    @Override
    public boolean salvar(MerendaEstoque merendaEstoque) {
        return dao.salvar(merendaEstoque);
    }

    @Override
    public boolean excluir(MerendaEstoque merendaEstoque) {
        return dao.excluir(merendaEstoque);
    }

    @Override
    public boolean atualizar(MerendaEstoque merendaEstoque) {
        return dao.atualizar(merendaEstoque);
    }

    @Override
    public MerendaEstoque pesquisar(Class<MerendaEstoque> entidade, Object chave) {
        return dao.buscar(chave, entidade);
    }

    @Override
    public List<MerendaEstoque> listar() {
        return dao.listar();
    }

}
