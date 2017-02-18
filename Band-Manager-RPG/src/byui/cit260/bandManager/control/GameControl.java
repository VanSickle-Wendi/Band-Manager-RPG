/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.control;

import byui.cit260.bandManager.model.Manager;

/**
 *
 * @author shaza
 */
public class GameControl {

    public static Manager createManager(String bandManagersName) {
        System.out.println("\n*** createManager() function called ***");
        return new Manager();
    }
    
}
