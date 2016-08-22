/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.dao;

import streaming.entity.Serie;

/**
 *
 * @author pro
 */
public interface SerieDAOInterface {
    
    public void creer(Serie serie);
    public void mettre_a_jour(Serie serie);
    public void supprimer(long serieId);
    
    
}
