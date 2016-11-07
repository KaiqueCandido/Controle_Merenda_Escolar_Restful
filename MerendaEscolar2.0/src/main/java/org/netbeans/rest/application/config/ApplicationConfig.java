/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.netbeans.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Kaique Candido
 */
@javax.ws.rs.ApplicationPath("iescolar")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(br.com.rednetsolucoes.merendaescolar2.webservice.EntradaMercadoriaWebService.class);
        resources.add(br.com.rednetsolucoes.merendaescolar2.webservice.EscolaWebService.class);
        resources.add(br.com.rednetsolucoes.merendaescolar2.webservice.FornecedoroWebService.class);
        resources.add(br.com.rednetsolucoes.merendaescolar2.webservice.MerendaEntradaMercadoriaWebService.class);
        resources.add(br.com.rednetsolucoes.merendaescolar2.webservice.MerendaFornecedorWebService.class);
        resources.add(br.com.rednetsolucoes.merendaescolar2.webservice.MerendaProdutoWebService.class);
        resources.add(br.com.rednetsolucoes.merendaescolar2.webservice.ProdutoWebService.class);
    }
    
}
