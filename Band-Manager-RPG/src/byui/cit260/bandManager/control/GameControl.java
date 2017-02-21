/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.control;

import band.manager.rpg.BandManagerRPG;
import byui.cit260.bandManager.model.Manager;

/**
 *
 * @author shaza
 */
public class GameControl {

    public static Manager createManager(String name) {
        
        if (name == null) {
            return null;
        }
        
        Manager manager = new Manager();
        manager.setName(name);
        
        BandManagerRPG.setManager(manager); // save the manager
        
        return manager;
    }
    
    public static void createNewGame(Manager manager) {
        System.out.println("\n*** createNewGame stub function called ***");
    }
}
