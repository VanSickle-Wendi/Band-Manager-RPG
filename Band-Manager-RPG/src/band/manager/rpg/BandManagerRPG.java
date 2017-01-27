/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package band.manager.rpg;

import byui.cit260.bandManager.model.Band;
import byui.cit260.bandManager.model.Bank;
import byui.cit260.bandManager.model.Equipment;
import byui.cit260.bandManager.model.Game;
import byui.cit260.bandManager.model.Instrument;
import byui.cit260.bandManager.model.Location;
import byui.cit260.bandManager.model.Manager;
import byui.cit260.bandManager.model.Map;
import byui.cit260.bandManager.model.Vehicle;

/**
 *
 * @author shaza
 */
public class BandManagerRPG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Manager Instance
        Manager managerOne = new Manager();
        
        managerOne.setName("Barney");
        managerOne.setFinalNetWorth(100);
        
        String managerInfo = managerOne.toString();
        System.out.println(managerInfo);
        
        // Game Instance
        Game gameStats = new Game();
        
        gameStats.setTotalMoney(20000);
        gameStats.setPerformanceLevel(8);
        
        String gameInfo = gameStats.toString();
        System.out.println(gameInfo);
        
        // Bank Instance
        Bank loanOne = new Bank();
        
        loanOne.setLoan(300);
        loanOne.setBankAccount(1500);
        loanOne.setLoanPayment(500);
        
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
        
        //Vehicle instance
        Vehicle vehicleInfo = new Vehicle();
        
        vehicleInfo.setMake("Mystery Machine");
        
        String vehicleStuff = vehicleInfo.toString();
        System.out.println(vehicleStuff);
        
        //Instrument instance
        Instrument instrumentInfo = new Instrument();
        
        instrumentInfo.setInstrumentType("Drums");
        
        String instrumentStuff = instrumentInfo.toString();
        System.out.println(instrumentStuff);
        
        // Band Instance
        Band memberOne = new Band();
        
        memberOne.setName("Captain Geech and the Shrimp Schack Shooters");
        memberOne.setBandMembers("Nick Rhodes");
        memberOne.setLocation("California");
        
        String bandInfo = memberOne.toString();
        System.out.println(bandInfo);
        
        //Map instance
        Map theMap = new Map();
        
        theMap.setDistance(5.6);
        theMap.setLocationNumber(15);
        
        String mapInfo = theMap.toString();
        System.out.println(mapInfo);
               
        // Location Instance
        Location locationOne = new Location();
        
        locationOne.setName("Bank");
        locationOne.setVisited("Yes");
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo); 
        
        
    }
    
}
