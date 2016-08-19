/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streaming.test;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import streaming.service.DistributeurLoggingServiceInterface;
import streaming.service.DistributeurServiceInterface;
import streaming.spring.SpringConfig;

/**
 *
 * @author admin
 */
@RunWith(SpringJUnit4ClassRunner.class) //On exécute ce code avant d'initialiser l'application
@SpringApplicationConfiguration(classes=SpringConfig.class) //On initialise l'application

public class DistributeurServiceTest {
    //********************************************************************************
    @Autowired
    private DistributeurServiceInterface distributeurService;
    
    @Test
    public void testRetrait() {
        
        Assert.assertTrue(distributeurService.retrait(1, (short)1234, 1000));
        
    }
    //********************************************************************************
    
    @Autowired
    private DistributeurLoggingServiceInterface distributeurLoggingServiceInterface;
    
    @Test
    public void testLog() {
        distributeurLoggingServiceInterface.log(" test ok");
    }
    
   
}
