/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package band.manager.rpg;

import byui.cit260.bandManager.model.Bank;
import byui.cit260.bandManager.model.Equipment;
import byui.cit260.bandManager.model.Game;
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
        
        Game gameStats = new Game();
        
        gameStats.setTotalMoney(20000);
        gameStats.setPerformanceLevel(8);
        
        String gameInfo = gameStats.toString();
        System.out.println(gameInfo);
        
        Bank loanOne = new Bank();
        
        loanOne.setLoan(300);
        
        String bankInfo = loanOne.toString();
        System.out.println(bankInfo);
        
        //Equipment instance
        Equipment equipmentInfo = new Equipment();
        
        equipmentInfo.setItem("Guitar");
        equipmentInfo.setPrice(350.50);
        equipmentInfo.setQualityLevel(4);
        equipmentInfo.setCurrentlyOwned("Limo");
        
        String equipmentStuff = equipmentInfo.toString();
        System.out.println(equipmentStuff);
        
        
        
    }
    
}
