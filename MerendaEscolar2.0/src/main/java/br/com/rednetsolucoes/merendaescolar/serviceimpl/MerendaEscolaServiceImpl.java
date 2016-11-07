/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar.serviceimpl;

import br.com.rednetsolucoes.merendaescolar.dao.MerendaEscolaDAO;
import br.com.rednetsolucoes.merendaescolar.entidades.MerendaEscola;
import br.com.rednetsolucoes.merendaescolar.entidades.MerendaEstoque;
import br.com.rednetsolucoes.merendaescolar.service.MerendaEscolaService;
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
public class MerendaEscolaServiceImpl implements MerendaEscolaService {

    @EJB
    private MerendaEscolaDAO dao;

    @Override
    public boolean salvar(MerendaEscola escola) {
        return dao.salvar(escola);
    }

    @Override
    public boolean excluir(MerendaEscola escola) {
        return dao.excluir(escola);
    }

    @Override
    public boolean atualizar(MerendaEscola escola) {
        return dao.atualizar(escola);
    }

    @Override
    public MerendaEscola pesquisar(Class<MerendaEscola> entidade, Object chave) {
        return dao.buscar(chave, entidade);
    }

    @Override
    public List<MerendaEscola> listar() {
        return dao.listar();
    }

    @Override
    public List<MerendaEscola> listarEscolas() {
        String uri = "http://localhost:8080/webresources/escolaservice";

        WebTarget webTarget = ClientBuilder.newClient().target(uri);
        String entity = webTarget.request().get().readEntity(String.class);

        List<MerendaEscola> escolas = new ArrayList<>();

        JsonParser parser = new JsonParser();
        JsonArray jsonArray = parser.parse(entity).getAsJsonArray();
        for (JsonElement j : jsonArray) {
            String nomeEscola = j.getAsJsonObject().get("nome").toString();
            long idEscola = j.getAsJsonObject().get("id").getAsLong();

            escolas.add(new MerendaEscola(new MerendaEstoque(), nomeEscola, idEscola));
        }

        return escolas;
    }

}
