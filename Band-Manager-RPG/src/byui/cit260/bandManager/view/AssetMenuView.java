/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import java.util.Scanner;

/**
 *
 * @author shaza
 */
public class AssetMenuView {
    
    private String menu;
    private String promptMessage;
    
    public AssetMenuView(){
        this.menu = "\n"
                + "\n--------------------------------------------------"
                + "\n|  Asset Menu                                    |"
                + "\n--------------------------------------------------"
                + "\nB -- Check Bank Account"
                + "\nC -- Current Assets"
                + "\nE -- Purchase/Upgrade Equipment"
                + "\nL -- Check Loan Status/Make Payment"
                + "\nQ -- Return to Game Menu"
                + "\n--------------------------------------------------";
        
        this.promptMessage = "\nPlease choose an Asset Menu Option: ";
    }

    void displayAssetMenuView() {
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
            case "B": // display Bank Account
                this.checkBankAccount();
                break;
            case "C": // display current assets
                this.currentAssets();
                break;
            case "E": // display the purchase equipment view
                this.purchaseEquipment();
                break;
            case "V": // display the purchase vehicle view
                this.purchaseVehicle();
                break;
            case "L": // display loan status/make payment
                this.loanStatus();
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

    private void checkBankAccount() {
        System.out.println("*** check bank account ***");
    }

    private void currentAssets() {
        System.out.println("*** current assets ***");
    }

    private void purchaseEquipment() {
        System.out.println("*** purchase equipment ***");
    }

    private void purchaseVehicle() {
        System.out.println("*** purchase vehicle ***");
    }

    private void loanStatus() {
        System.out.println("*** loan status ***");
    }

    }
    

