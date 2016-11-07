/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rednetsolucoes.merendaescolar.dao;

import br.com.rednetsolucoes.merendaescolar.entidades.MerendaProduto;
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
public class MerendaProdutoDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public boolean salvar(MerendaProduto obj) {
        try {
            entityManager.persist(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean atualizar(MerendaProduto obj) {
        try {
            entityManager.merge(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean excluir(MerendaProduto obj) {
        try {
            entityManager.remove(obj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public MerendaProduto buscar(Object chave, Class<MerendaProduto> entidade) {
        return entityManager.find(entidade, chave);
    }

    public List<MerendaProduto> listar() {
        Query query = entityManager.createQuery("SELECT p FROM MerendaProduto p");
        return query.getResultList();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

}
