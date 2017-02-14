/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;
import teacherhelps.RandomMock;
        

/**
 *
 * @author Wendi
 */
public class PerformanceControlTest {
    
    public PerformanceControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcPerfomanceLevel method, of class PerformanceControl.
     */
    @Test
    public void testCalcPerfomanceLevel() {
        
        PerformanceControl instance = new PerformanceControl();
        RandomMock testRandom = new RandomMock(1,2);
        
        instance.setRandomGenerator(testRandom);
        
        
        System.out.println("calcPerfomanceLevel");
        /******************
         * Test case #1
         *****************/
        System.out.println("\tTest #1");        
        
        double skillLevel = 75;
        double issueCost = 58;
        double equipmentCost = 1000;
      //  PerformanceControl instance = new PerformanceControl();
        double expResult = 219;
        double result = instance.calcPerfomanceLevel(skillLevel, issueCost, equipmentCost);
        assertEquals(expResult, result, 0.0);

        
        /******************
         * Test case #2
         *****************/
        System.out.println("\tTest #2");        

        testRandom.setSequence(0,3);
        skillLevel = 65;
        issueCost = 75;
        equipmentCost = 300;
        expResult = -999;
        result = instance.calcPerfomanceLevel(skillLevel, issueCost, equipmentCost);
        assertEquals(expResult, result, 0.0);        
        
        /******************
         * Test case #3
         *****************/
        System.out.println("\tTest #3");        
        
        testRandom.setSequence(2,1);        
        skillLevel = 100;
        issueCost = 150;
        equipmentCost = 500;
        expResult = -999;
        result = instance.calcPerfomanceLevel(skillLevel, issueCost, equipmentCost);
        assertEquals(expResult, result, 0.0);  
        
        /******************
         * Test case #4
         *****************/
        System.out.println("\tTest #4");        

        testRandom.setSequence(0,2);        
        skillLevel = 50;
        issueCost = 20;
        equipmentCost = 40;
        expResult = -999;
        result = instance.calcPerfomanceLevel(skillLevel, issueCost, equipmentCost);
        assertEquals(expResult, result, 0.0);
        
        /******************
         * Test case #5
         *****************/
        System.out.println("\tTest #5");        

        testRandom.setSequence(1,3);        
        skillLevel = 75;
        issueCost = -25;
        equipmentCost = 750;
        expResult = -999;
        result = instance.calcPerfomanceLevel(skillLevel, issueCost, equipmentCost);
        assertEquals(expResult, result, 0.0);    
        
        /******************
         * Test case #6
         *****************/
        System.out.println("\tTest #6");        

        testRandom.setSequence(0,1);        
        skillLevel = 50;
        issueCost = 75;
        equipmentCost = 3000;
        expResult = -999;
        result = instance.calcPerfomanceLevel(skillLevel, issueCost, equipmentCost);
        assertEquals(expResult, result, 0.0);
        
        /******************
         * Test case #7
         *****************/
        System.out.println("\tTest #7");        

        testRandom.setSequence(2,3);        
        skillLevel = 50;
        issueCost = 0;
        equipmentCost = 50;
        expResult = 31.5;
        result = instance.calcPerfomanceLevel(skillLevel, issueCost, equipmentCost);
        assertEquals(expResult, result, 0.0);
        
        /******************
         * Test case #8
         *****************/
        System.out.println("\tTest #8");        

        testRandom.setSequence(0,0);        
        skillLevel = 100;
        issueCost = 100;
        equipmentCost = 2000;
        expResult = 1100;
        result = instance.calcPerfomanceLevel(skillLevel, issueCost, equipmentCost);
        assertEquals(expResult, result, 0.0);   
    }
    
}