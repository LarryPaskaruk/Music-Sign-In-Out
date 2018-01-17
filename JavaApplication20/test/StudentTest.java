/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javaapplication20.StudentEngine;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 348948605
 */
public class StudentTest {
    
    public StudentTest() {
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

    // TODO add test methods here.
    @Test
     public void signInOutTest() {
         
    //testing if method encodes both lower and upper case letters    
     assertEquals("Lipps Xlivi Lsa Evi Csy",StudentEngine.signInOut("Hello There How Are You",4));//testing lower case and upper case letters
     
     }
}
