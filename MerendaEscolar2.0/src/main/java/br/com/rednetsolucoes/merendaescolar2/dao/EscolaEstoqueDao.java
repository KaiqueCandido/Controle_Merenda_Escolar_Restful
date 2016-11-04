/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar2.dao;

import br.com.rednetsolucoes.merendaescolar2.dominio.EscolaEstoque;
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
public class EscolaEstoqueDao{

    @PersistenceContext
    private EntityManager entityManager;
    
    public boolean salvar(EscolaEstoque obj) {
        try {
            entityManager.persist(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean atualizar(EscolaEstoque obj) {
        try {
            entityManager.merge(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean excluir(EscolaEstoque obj) {
        try {
            entityManager.remove(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public EscolaEstoque buscar(Object chave, Class<EscolaEstoque> entidade) {
        return entityManager.find(entidade, chave);
    }
    
    public List<EscolaEstoque> listar() {
        Query query = entityManager.createQuery("SELECT e FROM EscolaEstoque e ORDER BY e.nomeEscola");
        return query.getResultList();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }
}
