/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar.dao;

import br.com.rednetsolucoes.merendaescolar.entidades.*;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Kaique Candido
 */
@Stateless
public class MerendaEntradaMercadoriaDAO{

    @PersistenceContext
    private EntityManager entityManager;

    public boolean salvar(MerendaEntradaMercadoria obj) {
        try {
            entityManager.persist(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean atualizar(MerendaEntradaMercadoria obj) {
        try {
            entityManager.merge(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean excluir(MerendaEntradaMercadoria obj) {
        try {
            entityManager.remove(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public MerendaEntradaMercadoria buscar(Object chave, Class<MerendaEntradaMercadoria> entidade) {
        return entityManager.find(entidade, chave);
    }

    public List<MerendaEntradaMercadoria> listar() {
        Query query = entityManager.createQuery("SELECT e FROM MerendaEntradaMercadoria e");
        return query.getResultList();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

}
