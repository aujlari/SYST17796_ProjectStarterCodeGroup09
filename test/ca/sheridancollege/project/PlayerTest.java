/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rizul
 */
public class PlayerTest {

    public PlayerTest() {
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
     * Good Test check length regardless of special characters
     */
    @Test
    public void testGoodChecklength() {
        System.out.println("checklength");
        String s = "length";
        Player instance = new Player();
        boolean expResult = true;
        boolean result = instance.checklength(s);
        assertEquals(expResult, result);

    }

    /**
     * Bad Test check length regardless of special characters
     */
    @Test
    public void testBadChecklength() {
        System.out.println("checklength");
        String s = "Bad";
        Player instance = new Player();
        boolean expResult = false;
        boolean result = instance.checklength(s);
        assertEquals(expResult, result);

    }

    /**
     * Boundary Test check length regardless of special characters
     */
    @Test
    public void testBoundaryChecklength() {
        System.out.println("checklength");
        String s = "check";
        Player instance = new Player();
        boolean expResult = true;
        boolean result = instance.checklength(s);
        assertEquals(expResult, result);

    }

    /**
     * Good Test check length regardless of length
     */
    @Test
    public void testGoodCheckSpecialCharacter() {
        System.out.println("checkSpecialCharacter");
        String s = "$peci@l";
        Player instance = new Player();
        boolean expResult = true;
        boolean result = instance.checkSpecialCharacter(s);
        assertEquals(expResult, result);

    }

    /**
     * Bad Test check length regardless of length
     */
    @Test
    public void testBadCheckSpecialCharacter() {
        System.out.println("checkSpecialCharacter");
        String s = "special";
        Player instance = new Player();
        boolean expResult = false;
        boolean result = instance.checkSpecialCharacter(s);
        assertEquals(expResult, result);

    }

    /**
     * Boundary Test check length regardless of length
     */
    @Test
    public void testBoundaryCheckSpecialCharacter() {
        System.out.println("checkSpecialCharacter");
        String s = "Speci@l";
        Player instance = new Player();
        boolean expResult = true;
        boolean result = instance.checkSpecialCharacter(s);
        assertEquals(expResult, result);

    }

}
