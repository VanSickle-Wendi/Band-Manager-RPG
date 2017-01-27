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
public class Auditions implements Serializable{
    
    // class instance variables
    private String chooseCity;
    private String bandPosition;
    private int skillLevel;

    public Auditions() {
    }
    
    

    public String getChooseCity() {
        return chooseCity;
    }

    public void setChooseCity(String chooseCity) {
        this.chooseCity = chooseCity;
    }

    public String getBandPosition() {
        return bandPosition;
    }

    public void setBandPosition(String bandPosition) {
        this.bandPosition = bandPosition;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }

    @Override
    public String toString() {
        return "Auditions{" + "chooseCity=" + chooseCity + ", bandPosition=" + bandPosition + ", skillLevel=" + skillLevel + '}';
    }
    
    
    
    
    
    
    
}
