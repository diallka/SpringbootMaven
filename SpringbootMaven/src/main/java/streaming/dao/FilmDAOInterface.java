/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import streaming.entity.Film;

/**
 *
 * @author pro
 */


public interface FilmDAOInterface {
    
    public void creer(Film film);
    public void supprimer(Film film);
}
