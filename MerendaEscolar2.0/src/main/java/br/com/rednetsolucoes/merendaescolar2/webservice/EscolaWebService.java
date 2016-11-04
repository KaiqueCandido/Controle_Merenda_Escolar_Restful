/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar2.webservice;

import br.com.rednetsolucoes.merendaescolar2.dominio.EscolaEstoque;
import br.com.rednetsolucoes.merendaescolar2.service.EscolaEstoqueService;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Kaique Candido
 */
@Stateless
@Path("escola")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EscolaWebService {
    
    @EJB
    private EscolaEstoqueService service;    
    
    @GET
    public Response getEscolas(){
        List<EscolaEstoque> listaDeEscolas = service.listarEscolas();
        GenericEntity<List<EscolaEstoque>> escolasGenericas = new GenericEntity<List<EscolaEstoque>>(listaDeEscolas) {};        
        return Response.ok(escolasGenericas).build();
    }
    
}
