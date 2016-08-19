/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.springframework.stereotype.Repository;
import streaming.entity.DistributeurLoggin;

/**
 *
 * @author admin
 */

@Repository
public class LogginDAOJPAImpl implements LogginDAO{

    @Override
    public void create(DistributeurLoggin loggin) {
        
        EntityManager em = Persistence.createEntityManagerFactory("streaming_PU").createEntityManager();

        em.getTransaction().begin();
        em.persist(loggin);
        em.getTransaction().commit();
    }

   

}
