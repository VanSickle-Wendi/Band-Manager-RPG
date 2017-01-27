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
public class ReceiveMoneyScene implements Serializable{
    
    // class instance variables
    private double maxAmount;
    private double minAmount;
    
    // constructor function

    public ReceiveMoneyScene() {
    }
    

    public double getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(double maxAmount) {
        this.maxAmount = maxAmount;
    }

    public double getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(double minAmount) {
        this.minAmount = minAmount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.maxAmount) ^ (Double.doubleToLongBits(this.maxAmount) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.minAmount) ^ (Double.doubleToLongBits(this.minAmount) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "ReceiveMoneyScene{" + "maxAmount=" + maxAmount + ", minAmount=" + minAmount + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ReceiveMoneyScene other = (ReceiveMoneyScene) obj;
        if (Double.doubleToLongBits(this.maxAmount) != Double.doubleToLongBits(other.maxAmount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.minAmount) != Double.doubleToLongBits(other.minAmount)) {
            return false;
        }
        return true;
    }
    
    
    
}
