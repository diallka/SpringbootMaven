/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import streaming.entity.Film;
import streaming.service.FilmServiceImpl;
import streaming.spring.SpringConfig;

/**
 *
 * @author pro
 */
@RunWith(SpringJUnit4ClassRunner.class) //On exécute ce code avant d'initialiser l'application
@SpringApplicationConfiguration(classes=SpringConfig.class) //On initialise l'application

public class FilmTest {
    
    @Autowired
    private FilmServiceImpl filmServiceImlp;
    
    @Test
   public void creer(){
        Film film = new Film();
        film.setTitre("TitreFilm");
       filmServiceImlp.creer(film);
   }
    
}
