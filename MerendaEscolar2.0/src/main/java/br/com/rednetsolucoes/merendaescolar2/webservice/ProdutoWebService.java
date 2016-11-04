/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar2.webservice;

import br.com.rednetsolucoes.merendaescolar2.dominio.Produto;
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
@Path("produto")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProdutoWebService {

    @EJB
    private ProdutoService service;

//    Buscar Todos os produtos do banco de dados
    @GET
    public Response listarProdutos() {
        List<Produto> listaDeProdutos = service.listar();
        GenericEntity<List<Produto>> produtosGenericos = new GenericEntity<List<Produto>>(listaDeProdutos) {
        };
        return Response.ok(produtosGenericos).build();
    }

//    Buscar um produto especifico pelo id no banco de dados
    @GET
    @Path("{id}")
    public Response getProduto(@PathParam("id") long id) {
        Produto produto = service.pesquisar(Produto.class, id);
        return Response.ok(produto).build();
    }

//    Adicionar um novo produto no banco de dados
    @POST
    public Response addProduto(Produto produto) {
        service.salvar(produto);
        return Response.ok(produto).build();
    }

//    Atualizar um Produto
    @PUT
    public Response atualizarProduto(Produto produto) {
        service.atualizar(produto);
        return Response.ok(produto).build();
    }

//    Deletar um produto pelo ID
    @DELETE
    @Path("{id}")
    public Response removerProduto(@PathParam("id") long id) {
        Produto produto = service.pesquisar(Produto.class, id);
        service.excluir(service.pesquisar(Produto.class, id));
        return Response.ok(produto).build();
    }
}
