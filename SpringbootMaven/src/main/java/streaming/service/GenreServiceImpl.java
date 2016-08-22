/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streaming.dao.GenreDAOInterface;
import streaming.entity.Genre;

/**
 *
 * @author pro
 */
@Service
public class GenreServiceImpl implements GenreServiceInterface{
    
    @Autowired
    private GenreDAOInterface genreDAOInterface;

    @Override
    public void creer(Genre genre) {
        
        genreDAOInterface.creer(genre);
        
    }
    
}
