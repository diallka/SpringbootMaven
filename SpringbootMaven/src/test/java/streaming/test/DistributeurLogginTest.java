/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import streaming.entity.DistributeurLoggin;
import streaming.service.LoggingService;
import streaming.spring.SpringConfig;

/**
 *
 * @author admin
 */

@RunWith(SpringJUnit4ClassRunner.class) //On exécute ce code avant d'initialiser l'application
@SpringApplicationConfiguration(classes=SpringConfig.class) //On initialise l'application

public class DistributeurLogginTest {
    
  @Autowired
  private LoggingService loggingService;
  
  @Test
  public void log(){
      
//      EntityManager em = Persistence.createEntityManagerFactory("streaming_PU").createEntityManager();
//      
//      DistributeurLoggin loggin = new DistributeurLoggin();
//      loggin.setDateLoggin(new Date());
//      loggin.setMsg(" message");
//      
//      em.getTransaction().begin();
//      em.persist(loggin);
//      em.getTransaction().commit();
      
  }
  
  @Test
  public void create(){
      
       loggingService.create();
  }
}
