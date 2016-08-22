/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import streaming.entity.Serie;


/**
 *
 * @author pro
 */
@Repository
public class SerieDAOImpl implements SerieDAOInterface{
    
   @PersistenceContext
    private EntityManager em;

   //@Transactional
    @Override
    public void creer(Serie serie) {
        
        //EntityManager em = Persistence.createEntityManagerFactory("streaming_PU").createEntityManager();
        //em.getTransaction().begin();
        em.persist(serie);
        //em.getTransaction().commit();
    }

   
    public void supprimer() {
        em.find(Serie.class, this);
        em.remove(this);
    }

    @Override
    public void mettre_a_jour(Serie serie) {
        em.merge(serie);
    }

    @Override
    public void supprimer(long serieId) {
        em.createQuery("DELETE FROM  Serie serie WHERE serie.id=:serieId").setParameter("serieId", serieId).executeUpdate();
    }
    
}
