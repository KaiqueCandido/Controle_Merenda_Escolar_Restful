/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar2.main;

import br.com.rednetsolucoes.merendaescolar2.dominio.EntradaMercadoria;
import br.com.rednetsolucoes.merendaescolar2.dominio.Fornecedor;
import br.com.rednetsolucoes.merendaescolar2.dominio.Produto;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kaique Candido
 */
public class Main {

    public static void main(String[] args) {
        Produto p1 = new Produto(1l, "ARR001", "ARROZ 5 KG", 0l);
//        Produto p2 = new Produto(2l, "FEIJ002", "FEIJAO 1 KG", 0l);
//        List<Produto> produtos;
//        produtos = new ArrayList<>();
//        produtos.add(p1);
//        produtos.add(p2);

        Fornecedor fornecedor = new Fornecedor(1l, "Kaique Candido", "000.000.000-00");

        EntradaMercadoria e = new EntradaMercadoria(1l, p1, fornecedor, 10l, "01/11/2016", 3.65, "PACOTE", "05/11/2016", "9999");

        Gson g = new Gson();
        System.out.println(g.toJson(e).toString());
//        JsonObject jsonObject = new JsonObject();
//        jsonObject.addProperty("id", e.getFornecedor().getId());
//        jsonObject.addProperty("razaoSocial", fornecedor.getRazaoSocial());
//        jsonObject.addProperty("CPF_CNPJ", fornecedor.getCPF_CNPJ());
//
//        System.out.println(jsonObject);

//        EntradaMercadoria entrada = new EntradaMercadoria(1l, produtos, fornecedor, 0, null, valorunitario, null, null, null)
    }
}
