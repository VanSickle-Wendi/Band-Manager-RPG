/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package band.manager.rpg;

import byui.cit260.bandManager.model.Manager;

/**
 *
 * @author shaza
 */
public class BandManagerRPG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manager managerOne = new Manager();
        
        managerOne.setName("Barney");
        managerOne.setFinalNetWorth(100);
        
        String managerInfo = managerOne.toString();
        System.out.println(managerInfo);
    }
    
}
