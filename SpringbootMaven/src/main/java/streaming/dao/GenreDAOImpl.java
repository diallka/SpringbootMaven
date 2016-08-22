/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.springframework.data.domain.Persistable;
import org.springframework.stereotype.Repository;
import streaming.entity.Genre;

/**
 *
 * @author pro
 */
@Repository
public class GenreDAOImpl implements GenreDAOInterface{

    @Override
    public void creer(Genre genre) {
        
        EntityManager em = Persistence.createEntityManagerFactory("streaming_PU").createEntityManager();
        
        em.getTransaction().begin();
        em.persist(genre);
        em.getTransaction().commit();
    }
    
}
