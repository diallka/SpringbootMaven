/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import streaming.spring.SpringConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import streaming.service.FilmService;

/**
 *
 * @author ETY
 */

@RunWith(SpringJUnit4ClassRunner.class) //On exécute ce code avant d'initialiser l'application
@SpringApplicationConfiguration(classes=SpringConfig.class) //On initialise l'application
public class SpringTest {
    
//    @PersistenceContext
//    private EntityManager em;
    
    @Autowired
    private FilmService filmService;
    
    @Test
    public void doNadaOK(){
        
        filmService.save();
        
        
    }
    
}
