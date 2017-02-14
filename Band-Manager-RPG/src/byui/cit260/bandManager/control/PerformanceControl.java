/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.control;

import java.util.Random;

/**
 *
 * @author Wendi
 */
public class PerformanceControl {
    
        //Default to the standard Random class for normal operations
        private Random randomGenerator = new Random(System.currentTimeMillis());
        
        //Allow a unit test method to set its own random number generator.
        protected void setRandomGenerator(Random randomGenerator) {
            this.randomGenerator = randomGenerator;
        }
        

//My code    
    public double calcPerfomanceLevel(double skillLevel, double issueCost, double equipmentCost) {
    
        if (skillLevel !=50 && skillLevel != 75 && skillLevel != 100) {
        return -999;
        }
        
        if (issueCost < 0 || issueCost > 100) {
        return -999;
        }
 
        if (equipmentCost < 50 || equipmentCost > 2000) {
        return -999;
        }
        
      //  Random randomIssue = new Random(); 
        int tempIssue = randomGenerator.nextInt(3) + 1;
     // int tempIssue = (int) ( Math.random() * 2 + 1);
        double issue = Math.ceil(issueCost / tempIssue);
        
      //  Random randomEquipmentCost = new Random(); 
        int tempEquipmentCost = randomGenerator.nextInt(4) + 1;
        
     // int tempEquipmentCost = (int) ( Math.random() * 2 + 1);
        double equipment = Math.ceil(equipmentCost / tempEquipmentCost);
        
        double performanceLevel = (skillLevel + issue + equipment) / 2;
 
        return performanceLevel;
    }
}