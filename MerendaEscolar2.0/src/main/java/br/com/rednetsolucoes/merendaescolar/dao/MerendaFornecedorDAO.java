/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar.dao;

import br.com.rednetsolucoes.merendaescolar.entidades.MerendaFornecedor;
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
public class MerendaFornecedorDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public boolean salvar(MerendaFornecedor obj) {
        try {
            entityManager.persist(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean atualizar(MerendaFornecedor obj) {
        try {
            entityManager.merge(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean excluir(MerendaFornecedor obj) {
        try {
            entityManager.remove(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public MerendaFornecedor buscar(Object chave, Class<MerendaFornecedor> entidade) {
        return entityManager.find(entidade, chave);
    }

    public List<MerendaFornecedor> listar() {
        Query query = entityManager.createQuery("SELECT f FROM MerendaFornecedor f");
        return query.getResultList();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

}
