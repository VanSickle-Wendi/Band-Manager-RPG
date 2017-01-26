/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author shaza
 */
public class Manager implements Serializable {
    
    //class instance vaiables
    private String name;
    private double finalNetWorth;

    public Manager() {
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFinalNetWorth() {
        return finalNetWorth;
    }

    public void setFinalNetWorth(double finalNetWorth) {
        this.finalNetWorth = finalNetWorth;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.finalNetWorth) ^ (Double.doubleToLongBits(this.finalNetWorth) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Manager{" + "name=" + name + ", finalNetWorth=" + finalNetWorth + '}';
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
        final Manager other = (Manager) obj;
        if (Double.doubleToLongBits(this.finalNetWorth) != Double.doubleToLongBits(other.finalNetWorth)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
}
