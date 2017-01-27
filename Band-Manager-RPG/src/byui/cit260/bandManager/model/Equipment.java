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
public class Equipment implements Serializable{
    
    //class instance variables
    private String item;
    private double price;
    private int qualityLevel;
    private String currentlyOwned;

    public Equipment() {
    }
    
    

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQualityLevel() {
        return qualityLevel;
    }

    public void setQualityLevel(int qualityLevel) {
        this.qualityLevel = qualityLevel;
    }

    public String getCurrentlyOwned() {
        return currentlyOwned;
    }

    public void setCurrentlyOwned(String currentlyOwned) {
        this.currentlyOwned = currentlyOwned;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.item);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        hash = 97 * hash + this.qualityLevel;
        hash = 97 * hash + Objects.hashCode(this.currentlyOwned);
        return hash;
    }

    @Override
    public String toString() {
        return "Equipment{" + "item=" + item + ", price=" + price + ", qualityLevel=" + qualityLevel + ", currentlyOwned=" + currentlyOwned + '}';
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
        final Equipment other = (Equipment) obj;
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (this.qualityLevel != other.qualityLevel) {
            return false;
        }
        if (!Objects.equals(this.item, other.item)) {
            return false;
        }
        if (!Objects.equals(this.currentlyOwned, other.currentlyOwned)) {
            return false;
        }
        return true;
    }
    
    
    
}
