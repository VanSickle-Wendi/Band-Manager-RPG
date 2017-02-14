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

/**
 *
 * @author shaza
 */
public class BankControlTest {
    
    public BankControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcLoanPayment method, of class BankControl.
     */
    @Test
    public void testCalcLoanPayment() {
        System.out.println("calcLoanPayment");
        
        /******************
         * Test case #1
         *****************/
        System.out.println("\tTest #1");
        
        double loanBalance = 1500;
        double rate = .025;
        double extraPrincipal = 500;
        // Create instance of BankControl class
        BankControl instance = new BankControl();
        double expResult = 537.5;        
        double result = instance.calcLoanPayment(loanBalance, rate, extraPrincipal);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
       
        /******************
        * Test case #2
        *****************/
        System.out.println("\tTest #2");

        loanBalance = 0;
        rate = .05;
        extraPrincipal = 0;
        // Create instance of BankControl class
        //BankControl instance = new BankControl();
        expResult = -999;        
        result = instance.calcLoanPayment(loanBalance, rate, extraPrincipal);
        assertEquals(expResult, result, 0.0);
        
        /******************
        * Test case #3
        *****************/
        System.out.println("\tTest #3");

        loanBalance = 1500;
        rate = .06;
        extraPrincipal = 0;
        // Create instance of BankControl class
        //BankControl instance = new BankControl();
        expResult = -999;        
        result = instance.calcLoanPayment(loanBalance, rate, extraPrincipal);
        assertEquals(expResult, result, 0.0);
        
        /******************
        * Test case #4
        *****************/
        System.out.println("\tTest #4");

        loanBalance = 26000;
        rate = .025;
        extraPrincipal = 1500;
        // Create instance of BankControl class
        //BankControl instance = new BankControl();
        expResult = -999;        
        result = instance.calcLoanPayment(loanBalance, rate, extraPrincipal);
        assertEquals(expResult, result, 0.0);
       
        /******************
        * Test case #5
        *****************/
        System.out.println("\tTest #5");

        loanBalance = 15000;
        rate = .025;
        extraPrincipal = -1;
        // Create instance of BankControl class
        //BankControl instance = new BankControl();
        expResult = -999;        
        result = instance.calcLoanPayment(loanBalance, rate, extraPrincipal);
        assertEquals(expResult, result, 0.0);
        
        /******************
        * Test case #6
        *****************/
        System.out.println("\tTest #6");

        loanBalance = 25000;
        rate = .025;
        extraPrincipal = 25500;
        // Create instance of BankControl class
        //BankControl instance = new BankControl();
        expResult = -999;        
        result = instance.calcLoanPayment(loanBalance, rate, extraPrincipal);
        assertEquals(expResult, result, 0.0);
        
         /******************
        * Test case #7
        *****************/
        System.out.println("\tTest #7");

        loanBalance = 0;
        rate = .025;
        extraPrincipal = 0;
        // Create instance of BankControl class
        //BankControl instance = new BankControl();
        expResult = 0;        
        result = instance.calcLoanPayment(loanBalance, rate, extraPrincipal);
        assertEquals(expResult, result, 0.0);
        
         /******************
        * Test case #8
        *****************/
        System.out.println("\tTest #8");

        loanBalance = 25000;
        rate = .025;
        extraPrincipal = 25000;
        // Create instance of BankControl class
        //BankControl instance = new BankControl();
        expResult = 25625;        
        result = instance.calcLoanPayment(loanBalance, rate, extraPrincipal);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of calcBandSalary method, of class BankControl.
     */
    @Test
    public void testCalcBandSalary() {
        /******************
         * Test case #S1
         *****************/
        System.out.println("\tTest #S1");
        double venuePayment = 2500;
        double equipmentCost = 628.5;
        double fuelCost = 93;
        double hotelCost = 628.5;
        double salaryPercentage = .25;
        BankControl instance = new BankControl();
        double expResult = 287.5;
        double result = instance.calcBandSalary(venuePayment, equipmentCost, fuelCost, hotelCost, salaryPercentage);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
         /******************
         * Test case #S2
         *****************/
        System.out.println("\tTest #S2");
        venuePayment = 3500;
        equipmentCost = 425;
        fuelCost = 106;
        hotelCost = 969;
        salaryPercentage = -.001;
        //BankControl instance = new BankControl();
        expResult = -999;
        result = instance.calcBandSalary(venuePayment, equipmentCost, fuelCost, hotelCost, salaryPercentage);
        assertEquals(expResult, result, 0.0);
        
         /******************
         * Test case #S3
         *****************/
        System.out.println("\tTest #S3");
        venuePayment = 4300;
        equipmentCost = 1850;
        fuelCost = 215;
        hotelCost = 435;
        salaryPercentage = -.51;
        //BankControl instance = new BankControl();
        expResult = -999;
        result = instance.calcBandSalary(venuePayment, equipmentCost, fuelCost, hotelCost, salaryPercentage);
        assertEquals(expResult, result, 0.0);
        
         /******************
         * Test case #S4
         *****************/
        System.out.println("\tTest #S4");
        venuePayment = 500;
        equipmentCost = 95;
        fuelCost = 25;
        hotelCost = 70;
        salaryPercentage = 100;
        //BankControl instance = new BankControl();
        expResult = -999;
        result = instance.calcBandSalary(venuePayment, equipmentCost, fuelCost, hotelCost, salaryPercentage);
        assertEquals(expResult, result, 0.0);
        
         /******************
         * Test case #S5
         *****************/
        System.out.println("\tTest #S5");
        venuePayment = 24000;
        equipmentCost = 9500;
        fuelCost = 1800;
        hotelCost = 7140;
        salaryPercentage = 1.01;
        //BankControl instance = new BankControl();
        expResult = -999;
        result = instance.calcBandSalary(venuePayment, equipmentCost, fuelCost, hotelCost, salaryPercentage);
        assertEquals(expResult, result, 0.0);
        
          /******************
         * Test case #S6
         *****************/
        System.out.println("\tTest #S6");
        venuePayment = 2300;
        equipmentCost = 653;
        fuelCost = 1800;
        hotelCost = 7140;
        salaryPercentage = .60;
        //BankControl instance = new BankControl();
        expResult = -999;
        result = instance.calcBandSalary(venuePayment, equipmentCost, fuelCost, hotelCost, salaryPercentage);
        assertEquals(expResult, result, 0.0);
        
          /******************
         * Test case #S7
         *****************/
        System.out.println("\tTest #S7");
        venuePayment = 10000;
        equipmentCost = 1500;
        fuelCost = 150;
        hotelCost = 300;
        salaryPercentage = .01;
        //BankControl instance = new BankControl();
        expResult = 80.5;
        result = instance.calcBandSalary(venuePayment, equipmentCost, fuelCost, hotelCost, salaryPercentage);
        assertEquals(expResult, result, 0.0);
        
        /******************
         * Test case #S8
         *****************/
        System.out.println("\tTest #S8");
        venuePayment = 10000;
        equipmentCost = 1500;
        fuelCost = 150;
        hotelCost = 300;
        salaryPercentage = .50;
        //BankControl instance = new BankControl();
        expResult = 4025;
        result = instance.calcBandSalary(venuePayment, equipmentCost, fuelCost, hotelCost, salaryPercentage);
        assertEquals(expResult, result, 0.0);
    }
    
}
