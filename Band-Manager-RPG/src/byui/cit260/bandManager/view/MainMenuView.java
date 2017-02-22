/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import band.manager.rpg.BandManagerRPG;
import byui.cit260.bandManager.control.GameControl;
import java.util.Scanner;

/**
 *
 * @author Wendi
 */
public class MainMenuView {

    private String menu;
    private String promptMessage;

    public MainMenuView() {
        this.menu = "\n"
                + "\n--------------------------------------------------"
                + "\n|  Main Menu                                     |"
                + "\n--------------------------------------------------"
                + "\nN -- Start new game"
                + "\nL -- Load a saved game"
                + "\nH -- Help on how to play the game"
                + "\nS -- Save game"
                + "\nQ -- Quit and Exit Game"
                + "\n--------------------------------------------------";

        this.promptMessage = "\nPlease choose a Main Menu Option: ";
        // display the main menu
        //this.displayMainMenuView();
    }

    public void displayMainMenuView() {
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
            case "N": // create and start a new game
                this.startNewGame();
                break;
            case "L": // get and start an existing game
                this.startExistingGame();
                break;
            case "H": // display the help menu
                this.displayHelpMenu();
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
    private void startNewGame() {
        // create new game
        GameControl.createNewGame(BandManagerRPG.getManager());
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenuView();
    }
    
    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void displayHelpMenu() {
        
        // display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenuView();
    }    
}
