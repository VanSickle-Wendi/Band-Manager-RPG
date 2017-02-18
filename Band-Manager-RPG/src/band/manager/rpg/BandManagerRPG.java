/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package band.manager.rpg;

import byui.cit260.bandManager.model.Auditions;
import byui.cit260.bandManager.model.Band;
import byui.cit260.bandManager.model.Bank;
import byui.cit260.bandManager.model.Equipment;
import byui.cit260.bandManager.model.Game;
import byui.cit260.bandManager.model.Instrument;
import byui.cit260.bandManager.model.Location;
import byui.cit260.bandManager.model.Manager;
import byui.cit260.bandManager.model.Map;
import byui.cit260.bandManager.model.PayMoneyScene;
import byui.cit260.bandManager.model.ReceiveMoneyScene;
import byui.cit260.bandManager.model.Scenes;
import byui.cit260.bandManager.model.Vehicle;
import byui.cit260.bandManager.view.StartProgramView;

/**
 *
 * @author shaza
 */
public class BandManagerRPG {
    
    private static Game currentGame = null;
    private static Manager manager = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        //create StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
        
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        BandManagerRPG.currentGame = currentGame;
    }

    public static Manager getManager() {
        return manager;
    }

    public static void setManager(Manager manager) {
        BandManagerRPG.manager = manager;
    }
    
}
