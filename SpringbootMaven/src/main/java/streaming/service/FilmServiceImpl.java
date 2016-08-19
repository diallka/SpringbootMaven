/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streaming.dao.FilmDAOImpl;
import streaming.dao.FilmDAOInterface;
import streaming.entity.Film;

/**
 *
 * @author pro
 */
@Service
public class FilmServiceImpl  implements FilmServiceInterface{

    @Autowired
    private FilmDAOInterface filmDAOInterface;

    public void creer(Film film) {
        filmDAOInterface.creer(film);
    }

  
    
}
