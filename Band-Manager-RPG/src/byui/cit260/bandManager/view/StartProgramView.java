/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import byui.cit260.bandManager.control.GameControl;
import byui.cit260.bandManager.model.Manager;
import java.util.Scanner;

/**
 *
 * @author Wendi
 */
public class StartProgramView {

    private String promptMessage;

    public StartProgramView() {

        this.promptMessage = "\nPlease enter a name for the band manager: ";
        // display the banner when view is created
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
                "\n*********************************************************"
                + "\n*                                                       *"
                + "\n* In this game you will take on the role of a band      *"
                + "\n* manager. You will need to take out a loan in order to *"
                + "\n* afford the costs of holding auditions, traveling      *"
                + "\n* expenses, paying band members, buying equipment,      *"
                + "\n* buying vehicles, and paying back your loan. You may   *"
                + "\n* earn money by playing gigs and raising your           *"
                + "\n* performance levels through rehearsals. The better the *"
                + "\n* venue your band gets to play, the more potential they *"
                + "\n* have for earning money. The goal is to be able to pay *"
                + "\n* back your loan, earn the highest income for yourself  *"
                + "\n* and your band members, and gain the most popularity   *"
                + "\n* for the band.                                         *"
                + "\n*                                                       *"
                + "\n* You hope to discover 5 great musicians and coach them *"
                + "\n* to stardom. The game takes place in several cities    *"
                + "\n* throughout the same country. Once you have held       *"
                + "\n* auditions and purchased sound equipment, you will all *"
                + "\n* meet in your garage to name the band and have your    *"
                + "\n* first rehearsal. Advancement in the game from lower   *"
                + "\n* to higher venues will be determined by your band’s    *"
                + "\n* performance level at several different locations      *"
                + "\n* including the first rehearsal, gigs, a radio          *"
                + "\n* interview, a television performance, and a spot in a  *"
                + "\n* movie.                                                *"
                + "\n*                                                       *"
                + "\n* The game is won not only when your band plays well at *"
                + "\n* the highest venue, but when you are out of debt and   *"
                + "\n* making a good living. The game is lost if the manager *"
                + "\n* runs out of money or the band plays two bad gigs in a *"
                + "\n* row.  After the band has passed level 4, they go to   *"
                + "\n* ‘the big star party.’ Your accountant is there and    *"
                + "\n* tells you your net worth and star status              *"
        );

    }

    /**
     * displays the start program view
     */
    public void displayStartProgramView() {

        boolean done = false; // set flag to not done
        do {
            // prompt for a get band manager's name
            String bandManagersName = this.getbandManagersName();
            if (bandManagersName.toUpperCase().equals("Q")) //user wants to quit
                return; //exit the game
            
            // do the requested action and display the next view
            done = this.doAction(bandManagersName);
        } while (!done);

    }

    private String getbandManagersName() {

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
            break; //end the loop
        }

        return value; // return the value entered       
    }

    private boolean doAction(String bandManagersName) {
        if (bandManagersName.length() < 2) {
            System.out.println("\nInvalid player's name: "
                    + "The name must be greater than one character in length");
            return false;
        }
        // call createPlayer() control function
        Manager manager = GameControl.createManager(bandManagersName);

        if (manager == null) { // if unsuccessful
            System.out.println("\nError creating the manager.");
            return false;
        }
        
        // display next view
        this.displayNextView(manager);
        return true; // success !
    }

    private void displayNextView(Manager manager) {
        System.out.println("\n==========================================="
                          + "\n Welcome to the game " + manager.getName()
                          + "\n We hope you have a lot of fun!"
                          + "\n=========================================="
                          );
        
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
                
        // Display the main menu view
        mainMenuView.displayMainMenuView();
    }
}
