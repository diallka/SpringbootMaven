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
import streaming.entity.Genre;
import streaming.entity.Serie;
import streaming.service.FilmServiceImpl;
import streaming.service.GenreServiceInterface;
import streaming.service.SerieServiceImpl;
import streaming.spring.SpringConfig;

/**
 *
 * @author pro
 */
@RunWith(SpringJUnit4ClassRunner.class) //On exécute ce code avant d'initialiser l'application
@SpringApplicationConfiguration(classes = SpringConfig.class) //On initialise l'application

public class Tests {

    //*********************************************   
    @Autowired
    private FilmServiceImpl filmServiceImlp;

    @Test //Obligatoire sinon ecriture en base ne se fera pas.
    public void creerFilm() {
        Film film = new Film();
        film.setTitre("Tomorrow");
        filmServiceImlp.creer(film);
    }
    //*********************************************   
    @Autowired
    private SerieServiceImpl serieServiceImpl;

    @Test
    public void creerSerie() {
        Serie serie = new Serie();
        serie.setTitre("Homeland");
        serieServiceImpl.creer(serie);
    }
    //*********************************************
    @Autowired
    private GenreServiceInterface genreServiceInterface;

    @Test
    public void creerGenre() {
        Genre genre = new Genre();
        genre.setNom("Policier");
        genreServiceInterface.creer(genre);
    }

}
