/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar2.dao;

import br.com.rednetsolucoes.merendaescolar2.dominio.SaidaMercadoria;
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
public class SaidaMercadoriaDao {

    @PersistenceContext
    private EntityManager entityManager;

    public boolean salvar(SaidaMercadoria obj) {
        try {
            entityManager.persist(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean atualizar(SaidaMercadoria obj) {
        try {
            entityManager.merge(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean excluir(SaidaMercadoria obj) {
        try {
            entityManager.remove(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public SaidaMercadoria buscar(Object chave, Class<SaidaMercadoria> entidade) {
        return entityManager.find(entidade, chave);
    }

    public List<SaidaMercadoria> listar() {
        Query query = entityManager.createQuery("SELECT s FROM SaidaMercadoria s");
        return query.getResultList();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }
}
