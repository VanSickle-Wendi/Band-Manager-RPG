/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.model;

import java.io.Serializable;

/**
 *
 * @author Wendi
 */
public class Bank implements Serializable{
    
    // class instance variables
    private double loan;
    
    // constructor function

    public Bank() {
    }
    
    

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.loan) ^ (Double.doubleToLongBits(this.loan) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Bank{" + "loan=" + loan + '}';
    }
    
        
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Bank other = (Bank) obj;
        if (Double.doubleToLongBits(this.loan) != Double.doubleToLongBits(other.loan)) {
            return false;
        }
        return true;
    }
    
    
}
