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
public class HelpMenuView {
    
    private String menu;
    private String promptMessage;

    public HelpMenuView() {
        this.menu = "\n"
                + "\n--------------------------------------------------"
                + "\n|  Help Menu                                     |"
                + "\n--------------------------------------------------"
                + "\nG -- What is the goal of the Game?"
                + "\nL -- How to make payments or pay off the loan"
                + "\nU -- How to upgrade instruments/equipment"
                + "\nT -- Pro Tips"
                + "\nQ -- Quit Help Menu "
                + "\n--------------------------------------------------";

        this.promptMessage = "\nPlease choose a Help Menu Option: ";
        // display the help menu
        //this.displayHelpMenuView();
    }

    public void displayHelpMenuView() {
       // System.out.println(menu);
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
            case "G": // goal of the game
                this.goalOfGame();
                break;
            case "L": // payments and payoff of loan
                this.payOnLoan();
                break;
            case "U": // upgrade instruments/equipmenth             
                this.upgradeInstruments();
                break;
            case "T": // pro tips
                this.proTips();
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
    
    private void goalOfGame() {
        System.out.println("\n"
                + "\n--------------------------------------------------"
                + "\n The goal of the game is to take your band to     "
                + "\n the highest star status while paying off your    "
                + "\n loan and becoming a financial success yourself.  "
                + "\n--------------------------------------------------"       
        );
    }
    
    private void payOnLoan() {
        System.out.println("\n"
                + "\n--------------------------------------------------"
                + "\n The process for paying on your loan has not been "
                + "\n defined yet.                                     "
                + "\n                                                  "
                + "\n--------------------------------------------------"       
        );        
    }

    private void upgradeInstruments() {
        System.out.println("\n"
                + "\n--------------------------------------------------"
                + "\n The process for upgrading instruments has not    "
                + "\n been defined yet.                                "
                + "\n                                                  "
                + "\n--------------------------------------------------"       
        );          
    }

    private void proTips() {
        System.out.println("\n"
                + "\n There are no pros giving any tips yet.           "
                + "\n                                                  "
                + "\n                                                  "
                + "\n--------------------------------------------------"       
        );         
    }    
    
}
