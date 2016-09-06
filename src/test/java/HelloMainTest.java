/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author briacamp
 */
public class HelloMainTest {
    
    public HelloMainTest() {
        assert(false);
    }
    
   @Test
   public void testSalutationMessage() {
      System.out.println("Inside testSalutationMessage()");
      String msg = "Hi!" + "Robert";
      assertEquals(msg,"bad");
   }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
}
