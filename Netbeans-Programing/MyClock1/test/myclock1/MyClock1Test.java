/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myclock1;

import java.awt.Graphics;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author F.C
 */
public class MyClock1Test {
    
    public MyClock1Test() {
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
     * Test of init method, of class MyClock1.
     */
    @org.junit.Test
    public void testInit() {
        System.out.println("init");
        MyClock1 instance = new MyClock1();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of start method, of class MyClock1.
     */
    @org.junit.Test
    public void testStart() {
        System.out.println("start");
        MyClock1 instance = new MyClock1();
        instance.start();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stop method, of class MyClock1.
     */
    @org.junit.Test
    public void testStop() {
        System.out.println("stop");
        MyClock1 instance = new MyClock1();
        instance.stop();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class MyClock1.
     */
    @org.junit.Test
    public void testRun() {
        System.out.println("run");
        MyClock1 instance = new MyClock1();
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawHand method, of class MyClock1.
     */
    @org.junit.Test
    public void testDrawHand() {
        System.out.println("drawHand");
        double angle = 0.0;
        int radius = 0;
        Graphics g = null;
        MyClock1 instance = new MyClock1();
        instance.drawHand(angle, radius, g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawWedge method, of class MyClock1.
     */
    @org.junit.Test
    public void testDrawWedge() {
        System.out.println("drawWedge");
        double angle = 0.0;
        int radius = 0;
        Graphics g = null;
        MyClock1 instance = new MyClock1();
        instance.drawWedge(angle, radius, g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paint method, of class MyClock1.
     */
    @org.junit.Test
    public void testPaint() {
        System.out.println("paint");
        Graphics g = null;
        MyClock1 instance = new MyClock1();
        instance.paint(g);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
