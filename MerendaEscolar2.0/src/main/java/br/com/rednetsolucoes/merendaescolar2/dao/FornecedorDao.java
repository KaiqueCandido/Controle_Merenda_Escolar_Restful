/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar2.dao;

import br.com.rednetsolucoes.merendaescolar2.dominio.Fornecedor;
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
public class FornecedorDao {

    @PersistenceContext
    private EntityManager entityManager;

    public boolean salvar(Fornecedor obj) {
        try {
            entityManager.persist(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean atualizar(Fornecedor obj) {
        try {
            entityManager.merge(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean excluir(Fornecedor obj) {
        try {
            entityManager.remove(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Fornecedor buscar(Object chave, Class<Fornecedor> entidade) {
        return entityManager.find(entidade, chave);
    }

    public List<Fornecedor> listar() {
        Query query = entityManager.createQuery("SELECT f FROM Fornecedor f ORDER BY f.razaoSocial");
        return query.getResultList();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }
}
