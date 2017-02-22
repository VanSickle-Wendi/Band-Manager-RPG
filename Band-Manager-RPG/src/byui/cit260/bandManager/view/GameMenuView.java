/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import java.util.Scanner;

/**
 *
 * @author Wendi
 */
public class GameMenuView {
    
    private String menu;
    private String promptMessage;    
    
    public GameMenuView() {
        this.menu = "\n"
                + "\n--------------------------------------------------"
                + "\n|  Game Menu                                     |"
                + "\n--------------------------------------------------"
                + "\nM -- View Map"
                + "\nA -- Asset Menu"
                + "\nE -- Purchase equipment"
                + "\nV -- Purchase vehicle"
                + "\nH -- Hold audition"
                + "\nT -- Travel to a new location"
                + "\nX -- Check-in to hotel" 
                + "\nR -- Rehearsal" 
                + "\nP -- Venue performance" 
                + "\nB -- View band members and status" 
                + "\nL -- Check loan status/make payment"                 
                + "\nS -- Save game"
                + "\nQ -- Quit Game Menu"
                + "\n--------------------------------------------------";
		         
        this.promptMessage = "\nPlease choose a Game Menu Option: ";
        // display the game menu
        //this.displayGameMenuView();
    }

    public void displayGameMenuView() {
        //System.out.println(menu);
        boolean done = false; // set flag to not done
        do {
        System.out.println(menu);            
            //prompt for and get menu option
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) //user wants to quit
            {
                return; // exit the game
            }
            // do the requested action and display the next view
            done = this.doAction(menuOption);

        } while (!done);
    }

    private String getMenuOption() {

        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; //initialize to not valid

        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);

            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks

            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: The value can not be blank");
                continue;
            }
            valid = true; //end the loop
        }

        return value; // return the value entered       
    }

    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "M": // display the map
                this.viewMap();
                break;
            case "A": // display the asset menu
                this.assetMenu();
                break;
            case "E": // display the purchase equipment view
                this.purchaseEquipment();
                break;
            case "V": // display the purchase vehicle view
                this.purchaseVehicle();
                break;
            case "H": // display audition view
                this.holdAudition();
                break;
            case "T": // Travel to new location
                this.travelLoacation();
                break;
            case "X": // check in to hotel
                this.hotelCheckIn();
                break;
            case "R": // rehearsal
                this.rehearsal();
                break;
            case "P": // venue Performance
                this.venuePerformance();
                break;
            case "B": // view band members and status
                this.bandStatus();
                break;
            case "L": // pay on loan
                this.payLoan();
                break;   
            case "S": // save the current game
                this.saveGame();
                break; 
            case "Q": // Quit
                return true;                 
            default:
                // System.out.println(menu);
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }    

    private void viewMap() {
        System.out.println("*** viewMap function called ***");        
    }

    private void assetMenu() {
        System.out.println("*** assetMenu function called ***");         
    }

    private void purchaseEquipment() {
        System.out.println("*** purchaseEquipment function called ***");        
    }

    private void purchaseVehicle() {
        System.out.println("*** purchaseVehicle function called ***");        
    }

    private void holdAudition() {
        System.out.println("*** holdAudition function called ***");
    }

    private void travelLoacation() {
        System.out.println("*** travelLocation function called ***");        
    }

    private void hotelCheckIn() {
        System.out.println("*** hotelCheckIn function called ***");          
    }

    private void rehearsal() {
        System.out.println("*** rehearsal function called ***");  
    }

    private void venuePerformance() {
        System.out.println("*** venuePerformance function called ***");  
    }

    private void bandStatus() {
        System.out.println("*** bandStatus function called ***");  
    }

    private void payLoan() {
        System.out.println("*** payLoan function called ***"); 
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***"); 
    }
       
}
