/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.service;

import java.util.Date;
import org.springframework.stereotype.Service;
import streaming.dao.LogginDAOJPAImpl;
import streaming.entity.DistributeurLoggin;

/**
 *
 * @author admin
 */

@Service
public class LoggingService {
    
    public void log(String msg){
        
        System.out.println("***" + new Date() + "" + msg + "***");
    }  
    
    public void create(){
      DistributeurLoggin loggin = new DistributeurLoggin();
      loggin.setDateLoggin(new Date());
      loggin.setMsg(" message");
      
      new LogginDAOJPAImpl().create(loggin);
    }
    
}
