/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar2.webservice;

import br.com.rednetsolucoes.merendaescolar.entidades.MerendaEntradaMercadoria;
import br.com.rednetsolucoes.merendaescolar.entidades.MerendaProduto;
import br.com.rednetsolucoes.merendaescolar.service.MerendaEntradaMercadoriaService;
import br.com.rednetsolucoes.merendaescolar.service.MerendaProdutoService;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.*;
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
@Path("mentradamercadoria")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MerendaEntradaMercadoriaWebService {

    @EJB
    private MerendaEntradaMercadoriaService service;
    @EJB
    private MerendaProdutoService serviceProduto;

    @GET
    public Response listarEntradaMercadoria() {
        List<MerendaEntradaMercadoria> listaDeFornecedores = service.listar();
        GenericEntity<List<MerendaEntradaMercadoria>> fornecedoresGenericos = new GenericEntity<List<MerendaEntradaMercadoria>>(listaDeFornecedores) {
        };
        return Response.ok(fornecedoresGenericos).build();
    }

    @GET
    @Path("{id}")
    public Response getEntradaMercadoria(@PathParam("id") long id) {
        MerendaEntradaMercadoria fornecedor = service.pesquisar(MerendaEntradaMercadoria.class, id);
        return Response.ok(fornecedor).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public Response addEntradaMercadoria(
            @FormParam("dataCompra") String dataCompra,
            @FormParam("dataEntrada") String dataEntrada,
            @FormParam("numeroNotaFical") String numeroNotaFical,
            @FormParam("qtdeEntrada") int qtdeEntrada,
            @FormParam("idProduto") Long idProduto) {

        MerendaEntradaMercadoria entradaMercadoria = new MerendaEntradaMercadoria();
        entradaMercadoria.setDataCompra(dataCompra);
        entradaMercadoria.setDataEntrada(dataEntrada);
        entradaMercadoria.setNumeroNotaFical(numeroNotaFical);
        entradaMercadoria.setQtdeEntrada(qtdeEntrada);
        
        MerendaProduto produto = serviceProduto.pesquisar(MerendaProduto.class, idProduto);
        produto.atualizarQtde(qtdeEntrada);
        serviceProduto.atualizar(produto);
        
        entradaMercadoria.addNovoProduto(produto);

        service.salvar(entradaMercadoria);
        return Response.ok(entradaMercadoria).build();
    }

//    Atualizar um Fornecedor
//    @PUT
//    public Response atualizarFornecedor(MerendaFornecedor fornecedor) {
//        service.atualizar(fornecedor);
//        return Response.ok(fornecedor).build();
//    }
//
//    Deletar um fornecedor pelo ID
//    @DELETE
//    @Path("{id}")
//    public Response removerFornecedor(@PathParam("id") long id) {
//        MerendaFornecedor fornecedor = service.pesquisar(MerendaFornecedor.class, id);
//        service.excluir(service.pesquisar(MerendaFornecedor.class, id));
//        return Response.ok(fornecedor).build();
//    }
}
