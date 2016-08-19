/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

/**
 *
 * @author admin
 */
public class DistributeurServiceRetraitRefuseImpl implements DistributeurServiceInterface{

    @Override
    public boolean retrait(long idCompte, short code, long montant) {
        
        return  false;
    }
    
    
    
}
