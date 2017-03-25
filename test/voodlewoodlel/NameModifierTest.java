/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voodlewoodlel;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Erjon
 */
public class NameModifierTest {
    
    public NameModifierTest() {
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

    /**
     * Test of Voodleize method, of class NameModifier.
     */
    @Test
    public void testVoodleize() {
        System.out.println("Voodleize");
        String nom = "Sinistra";
        NameModifier instance = new NameModifier();
        String expResult = "Soodlenoodlestroodle";
        String result = instance.Voodleize(nom);
        assertEquals(expResult, result);
        
        expResult = "Boodleb";
        result = instance.Voodleize("Bob");
        assertEquals(expResult, result);
        
        expResult = "rpm";
        result = instance.Voodleize("rpm");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
