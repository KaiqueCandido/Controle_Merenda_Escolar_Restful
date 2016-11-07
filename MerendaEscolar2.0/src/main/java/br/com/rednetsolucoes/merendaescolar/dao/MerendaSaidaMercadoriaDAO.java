/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar.dao;

import br.com.rednetsolucoes.merendaescolar.entidades.MerendaSaidaMercadoria;
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
public class MerendaSaidaMercadoriaDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public boolean salvar(MerendaSaidaMercadoria obj) {
        try {
            entityManager.persist(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean atualizar(MerendaSaidaMercadoria obj) {
        try {
            entityManager.merge(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean excluir(MerendaSaidaMercadoria obj) {
        try {
            entityManager.remove(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public MerendaSaidaMercadoria buscar(Object chave, Class<MerendaSaidaMercadoria> entidade) {
        return entityManager.find(entidade, chave);
    }

    public List<MerendaSaidaMercadoria> listar() {
        Query query = entityManager.createQuery("SELECT s FROM MerendaSaidaMercadoria s");
        return query.getResultList();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

}
