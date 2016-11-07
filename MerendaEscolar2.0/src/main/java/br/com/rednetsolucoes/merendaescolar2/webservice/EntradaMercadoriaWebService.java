/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar2.webservice;

import br.com.rednetsolucoes.merendaescolar2.dominio.EntradaMercadoria;
import br.com.rednetsolucoes.merendaescolar2.dominio.Fornecedor;
import br.com.rednetsolucoes.merendaescolar2.dominio.Produto;
import br.com.rednetsolucoes.merendaescolar2.service.EntradaMercadoriaService;
import br.com.rednetsolucoes.merendaescolar2.service.FornecedorService;
import br.com.rednetsolucoes.merendaescolar2.service.ProdutoService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Kaique Candido
 */
@Stateless
@Path("entradamercadoria")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EntradaMercadoriaWebService {

    @EJB
    private EntradaMercadoriaService service;
    @EJB
    private FornecedorService serviceFornecedor;
    @EJB
    private ProdutoService serviceProduto;

    //    Buscar Todos as entradas de mercadorias no banco de dados
    @GET
    public Response listarEntradasMercadorias() {
        List<EntradaMercadoria> listaEntradaMercadoria = service.listar();
        GenericEntity<List<EntradaMercadoria>> entradasGenericas = new GenericEntity<List<EntradaMercadoria>>(listaEntradaMercadoria) {
        };
        return Response.ok(entradasGenericas).build();
    }

//    Buscar uma entrada de mercadoria pelo id no banco de dados
    @GET
    @Path("{id}")
    public Response getEntradaMercadoria(@PathParam("id") long id) {
        EntradaMercadoria entradaMercadoria = service.pesquisar(EntradaMercadoria.class, id);
        return Response.ok(entradaMercadoria).build();
    }

//    Adicionar um nova entrada de mercadoria no banco de dados
    @POST
    public Response addEntradaMercadoria(EntradaMercadoria entradaMercadoria) {
        service.salvar(entradaMercadoria);
        Produto produto = serviceProduto.pesquisar(Produto.class, entradaMercadoria.getProduto().getId());
        produto.setQuantidade(produto.getQuantidade() + entradaMercadoria.getQtdeUnidade());
        serviceProduto.atualizar(produto);
        return Response.ok(entradaMercadoria).build();
    }

//    Atualizar uma entrada de mercadoria
    @PUT
    public Response atualizarEntradaMercadoria(EntradaMercadoria entradaMercadoria) {
        service.atualizar(entradaMercadoria);
        return Response.ok(entradaMercadoria).build();
    }

//    Deletar uma entrada de mercadoria pelo ID
    @DELETE
    @Path("{id}")
    public Response removerEntradaMercadoria(@PathParam("id") long id) {
        EntradaMercadoria entradaMercadoria = service.pesquisar(EntradaMercadoria.class, id);
        service.excluir(service.pesquisar(EntradaMercadoria.class, id));
        return Response.ok(entradaMercadoria).build();
    }
}
