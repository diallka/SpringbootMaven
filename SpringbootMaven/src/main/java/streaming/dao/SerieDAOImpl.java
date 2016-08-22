/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.springframework.stereotype.Repository;
import streaming.entity.Serie;

/**
 *
 * @author pro
 */
@Repository
public class SerieDAOImpl implements SerieDAOInterface{

    @Override
    public void creer(Serie serie) {
        
        EntityManager em = Persistence.createEntityManagerFactory("streaming_PU").createEntityManager();
        
        em.getTransaction().begin();
        em.persist(serie);
        em.getTransaction().commit();
    }
    
}
