package com.projetoteste.util;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ProdutoDaoTemp {
    
    /*
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPUTeste");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    public List<Produtos> buscaTodosProdutos() {

        List<Produtos> produtos = new ArrayList<Produtos>();
        Query query = entityManager.createQuery("select t from PRODUTOS as t ");
        produtos = query.getResultList();
        return produtos;
    };
    
    public Produtos buscaProduto(long id) {
        
        Produtos produto = entityManager.find(Produtos.class, id);
        return produto;
    };

    public Produtos criaProduto(Produtos produto) {

        entityManager.getTransaction().begin();
        entityManager.persist(produto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return produto;
    };

    public Produtos atualizaProduto(Produtos produto) {
        
        entityManager.getTransaction().begin();
        entityManager.merge(produto);
        entityManager.getTransaction().commit();
        entityManager.close();
        return produto;
    };

    public void removeProduto(long id) {
        
        Produtos produto = this.buscaProduto(id);
        entityManager.getTransaction().begin();
        entityManager.remove(produto);
        entityManager.getTransaction().commit();
        entityManager.close();
    };
*/
}
