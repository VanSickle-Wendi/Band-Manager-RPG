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
    private double bankAccount;
    private double loanPayment;
    
    // constructor function

    public Bank() {
    }
    
    

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public double getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(double bankAccount) {
        this.bankAccount = bankAccount;
    }

    public double getLoanPayment() {
        return loanPayment;
    }

    public void setLoanPayment(double loanPayment) {
        this.loanPayment = loanPayment;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.loan) ^ (Double.doubleToLongBits(this.loan) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.bankAccount) ^ (Double.doubleToLongBits(this.bankAccount) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.loanPayment) ^ (Double.doubleToLongBits(this.loanPayment) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Bank{" + "loan=" + loan + ", bankAccount=" + bankAccount + ", loanPayment=" + loanPayment + '}';
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
        if (Double.doubleToLongBits(this.bankAccount) != Double.doubleToLongBits(other.bankAccount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.loanPayment) != Double.doubleToLongBits(other.loanPayment)) {
            return false;
        }
        return true;
    }

    
    
    
    
}
