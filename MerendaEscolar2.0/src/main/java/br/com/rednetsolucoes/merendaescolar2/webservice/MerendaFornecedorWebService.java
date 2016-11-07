/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar2.webservice;

import br.com.rednetsolucoes.merendaescolar.entidades.MerendaFornecedor;
import br.com.rednetsolucoes.merendaescolar.service.MerendaFornecedorService;
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
@Path("mfornecedor")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MerendaFornecedorWebService {

    @EJB
    private MerendaFornecedorService service;

//    Buscar Todos os fornecedores do banco de dados
    @GET
    public Response listarFornecedores() {
        List<MerendaFornecedor> listaDeFornecedores = service.listar();
        GenericEntity<List<MerendaFornecedor>> fornecedoresGenericos = new GenericEntity<List<MerendaFornecedor>>(listaDeFornecedores) {
        };
        return Response.ok(fornecedoresGenericos).build();
    }

//    Buscar um fornecedor especifico pelo id no banco de dados
    @GET
    @Path("{id}")
    public Response getFornecedor(@PathParam("id") long id) {
        MerendaFornecedor fornecedor = service.pesquisar(MerendaFornecedor.class, id);
        return Response.ok(fornecedor).build();
    }

//    Adicionar um novo fornecedor no banco de dados
    @POST
    public Response addFornecedor(MerendaFornecedor fornecedor) {
        service.salvar(fornecedor);
        return Response.ok(fornecedor).build();
    }

//    Atualizar um Fornecedor
    @PUT
    public Response atualizarFornecedor(MerendaFornecedor fornecedor) {
        service.atualizar(fornecedor);
        return Response.ok(fornecedor).build();
    }

//    Deletar um fornecedor pelo ID
    @DELETE
    @Path("{id}")
    public Response removerFornecedor(@PathParam("id") long id) {
        MerendaFornecedor fornecedor = service.pesquisar(MerendaFornecedor.class, id);
        service.excluir(service.pesquisar(MerendaFornecedor.class, id));
        return Response.ok(fornecedor).build();
    }
}
