/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import java.util.Random;

/**
 *
 * @author Wendi
 */
class DrummerAuditionView {
    
    private String menu;    
    private String promptIssueCost;
    private String promptEquipmentCost;
    
        //Default to the standard Random class for normal operations
        private Random randomGenerator = new Random(System.currentTimeMillis());
        
        //Allow a unit test method to set its own random number generator.
        protected void setRandomGenerator(Random randomGenerator) {
            this.randomGenerator = randomGenerator;
        }    
    
    
    public DrummerAuditionView () {
        this.menu = "\n hi";      
    }

    public int displayDrummerAuditionView() {
        //todo implement the prompt and read input loop
        return calcSkillLevel();
    }

    public int calcSkillLevel() {
    
      //  if (skillLevel !=50 && skillLevel != 75 && skillLevel != 100) {
     //   return -999;
      //  }
        
      //  if (issueCost < 0 || issueCost > 100) {
      //  return -999;
      //  }
 
      //  if (equipmentCost < 50 || equipmentCost > 2000) {
      //  return -999;
      //  }
        
      // Assign randomGenerator, with range 1 to 3, to tempIssue variable
        int drummerOne = randomGenerator.nextInt(3) + 1;

        if (drummerOne == 1) {
            drummerOne = 50;
        } else if (drummerOne == 2) {
            drummerOne = 75;
        } else {
            drummerOne = 100;
        }
        
      // Assign randomGenerator, with range 1 to 4, to tempEquipmentCost variable
      //  int tempEquipmentCost = randomGenerator.nextInt(4) + 1;
        
      // Divide equipmentCost by random number between 1 and 4 and assign to equipment variable
     //   double equipment = Math.ceil(equipmentCost / tempEquipmentCost);
        
      //  double performanceLevel = (skillLevel + issue + equipment) / 2;
 
      //  return performanceLevel;
   // }  
   return drummerOne;
    }
           
}
