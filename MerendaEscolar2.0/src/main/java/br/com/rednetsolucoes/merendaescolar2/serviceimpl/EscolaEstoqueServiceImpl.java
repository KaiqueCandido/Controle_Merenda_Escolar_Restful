/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar2.serviceimpl;

import br.com.rednetsolucoes.merendaescolar2.dao.EscolaEstoqueDao;
import br.com.rednetsolucoes.merendaescolar2.dominio.EscolaEstoque;
import br.com.rednetsolucoes.merendaescolar2.service.EscolaEstoqueService;
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
public class EscolaEstoqueServiceImpl implements EscolaEstoqueService {

    @EJB
    private EscolaEstoqueDao escolaDAO;

    @Override
    public boolean salvar(EscolaEstoque escola) {
        return escolaDAO.salvar(escola);
    }

    @Override
    public boolean excluir(EscolaEstoque escola) {
        return escolaDAO.excluir(escola);
    }

    @Override
    public boolean atualizar(EscolaEstoque escola) {
        return escolaDAO.atualizar(escola);
    }

    @Override
    public EscolaEstoque pesquisar(Class<EscolaEstoque> entidade, Object chave) {
        return escolaDAO.buscar(chave, entidade);
    }

    @Override
    public List<EscolaEstoque> listar() {
        return  escolaDAO.listar();
    }

    @Override
    public List<EscolaEstoque> listarEscolas() {
        String uri = "http://localhost:8080/webresources/escolaservice";

        WebTarget webTarget = ClientBuilder.newClient().target(uri);
        String entity = webTarget.request().get().readEntity(String.class);

        List<EscolaEstoque> escolas = new ArrayList<>();

        JsonParser parser = new JsonParser();
        JsonArray jsonArray = parser.parse(entity).getAsJsonArray();
        for (JsonElement j : jsonArray) {
            String nomeEscola = j.getAsJsonObject().get("nome").toString();
            long idEscola = j.getAsJsonObject().get("id").getAsLong();

            escolas.add(new EscolaEstoque(nomeEscola, idEscola, new ArrayList()));
        }

        return escolas;
    }

}
