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
        extraPrincipal = 0;
        // Create instance of BankControl class
        //BankControl instance = new BankControl();
        expResult = -999;        
        result = instance.calcLoanPayment(loanBalance, rate, extraPrincipal);
        assertEquals(expResult, result, 0.0);
    }
    
}
