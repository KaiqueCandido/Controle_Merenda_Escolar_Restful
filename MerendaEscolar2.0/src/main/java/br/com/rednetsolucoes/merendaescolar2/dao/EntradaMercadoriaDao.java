/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar2.dao;

import br.com.rednetsolucoes.merendaescolar2.dominio.EntradaMercadoria;
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
public class EntradaMercadoriaDao {

    @PersistenceContext
    private EntityManager entityManager;

    public boolean salvar(EntradaMercadoria obj) {
        try {
            entityManager.persist(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean atualizar(EntradaMercadoria obj) {
        try {
            entityManager.merge(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean excluir(EntradaMercadoria obj) {
        try {
            entityManager.remove(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public EntradaMercadoria buscar(Object chave, Class<EntradaMercadoria> entidade) {
        return entityManager.find(entidade, chave);
    }

    public List<EntradaMercadoria> listar() {
        Query query = entityManager.createQuery("SELECT p FROM Produto p ORDER BY p.descricao");
        return query.getResultList();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }
}
