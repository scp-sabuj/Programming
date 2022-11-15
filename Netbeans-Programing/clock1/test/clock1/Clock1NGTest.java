/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clock1;

import java.awt.Graphics;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author F.C
 */
public class Clock1NGTest {
    
    public Clock1NGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of run method, of class Clock1.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Clock1 instance = new Clock1();
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of init method, of class Clock1.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        Clock1 instance = new Clock1();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculatePoints method, of class Clock1.
     */
    @Test
    public void testCalculatePoints() {
        System.out.println("calculatePoints");
        Clock1 instance = new Clock1();
        instance.calculatePoints();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculateSeconds method, of class Clock1.
     */
    @Test
    public void testCalculateSeconds() {
        System.out.println("calculateSeconds");
        Clock1 instance = new Clock1();
        double expResult = 0.0;
        double result = instance.calculateSeconds();
        assertEquals(result, expResult, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paint method, of class Clock1.
     */
    @Test
    public void testPaint() {
        System.out.println("paint");
        Graphics g = null;
        Clock1 instance = new Clock1();
        instance.paint(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class Clock1.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Graphics g = null;
        Clock1 instance = new Clock1();
        instance.update(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class Clock1.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Clock1 instance = new Clock1();
        instance.getDate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of start method, of class Clock1.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        Clock1 instance = new Clock1();
        instance.start();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stop method, of class Clock1.
     */
    @Test
    public void testStop() {
        System.out.println("stop");
        Clock1 instance = new Clock1();
        instance.stop();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
