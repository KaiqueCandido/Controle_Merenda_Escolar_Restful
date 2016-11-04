/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar2.dao;

import br.com.rednetsolucoes.merendaescolar2.dominio.Produto;
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
public class ProdutoDao {

    @PersistenceContext
    EntityManager entityManager;

    public boolean salvar(Produto obj) {
        try {
            entityManager.persist(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean atualizar(Produto obj) {
        try {
            entityManager.merge(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean excluir(Produto obj) {
        try {
            entityManager.remove(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public Produto buscar(Object chave, Class<Produto> entidade) {
        return entityManager.find(entidade, chave);
    }
    
    public List<Produto> listar() {
        Query query = entityManager.createQuery("SELECT p FROM Produto p ORDER BY p.descricao");
        return query.getResultList();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }
}
