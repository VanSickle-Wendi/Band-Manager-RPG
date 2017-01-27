/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.model;

import java.io.Serializable;

/**
 *
 * @author shaza
 */
public class Game implements Serializable{
    
    //class instance variables
    private double totalMoney;
    private double performanceLevel;

    public Game() {
    }
    
    

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public double getPerformanceLevel() {
        return performanceLevel;
    }

    public void setPerformanceLevel(double performanceLevel) {
        this.performanceLevel = performanceLevel;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.totalMoney) ^ (Double.doubleToLongBits(this.totalMoney) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.performanceLevel) ^ (Double.doubleToLongBits(this.performanceLevel) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "totalMoney=" + totalMoney + ", performanceLevel=" + performanceLevel + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalMoney) != Double.doubleToLongBits(other.totalMoney)) {
            return false;
        }
        if (Double.doubleToLongBits(this.performanceLevel) != Double.doubleToLongBits(other.performanceLevel)) {
            return false;
        }
        return true;
    }
    
    
    
}
