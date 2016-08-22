/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import streaming.dao.SerieDAOInterface;
import streaming.entity.Serie;

/**
 *
 * @author pro
 */
@Service
public class SerieServiceImpl implements SerieServiceInterface{

    @Autowired
    private SerieDAOInterface serieDAOInterface;
    
    @Override
    public void creer(Serie serie) {
        
        serieDAOInterface.creer(serie);
        
    }
    
}
