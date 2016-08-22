/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import streaming.entity.Film;
import streaming.service.FilmCrudService;
import streaming.spring.SpringConfig;

/**
 *
 * @author admin
 */

@RunWith(SpringJUnit4ClassRunner.class) //On exécute ce code avant d'initialiser l'application
@SpringApplicationConfiguration(classes = SpringConfig.class) //On initialise l'application
public class FilmTestCRUD {
    
   @Autowired
   private FilmCrudService filmCrudService;
    
   @Test 
   public void test(){
       //filmCrudService.save(new Film());
       //System.out.println("<<" +"Bonjour le titre du film est " + filmCrudService.findOneByTitre("Tomorrow").getTitre() +">>");
       
       filmCrudService.deleteAll(); //Nettoyer la base avant d'inserrer
       
       Film film = new Film();
       film.setTitre("Tomorrow");
       filmCrudService.save(film); 
       
       Assert.assertNotNull(filmCrudService.findOneByTitre("Tomorrow"));
   }
}
