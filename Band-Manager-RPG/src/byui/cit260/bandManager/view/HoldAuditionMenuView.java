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
class HoldAuditionMenuView {

    private String menu;
    private String promptMessage;    
    
    public HoldAuditionMenuView() {
        this.menu = "\n"
                + "\n--------------------------------------------------"
                + "\n|  Hold Audition Menu                                     |"
                + "\n--------------------------------------------------"
                + "\nD -- Drummer"
                + "\nG -- Guitarist"
                + "\nB -- Bass Player"
                + "\nK -- Keyboardist"
                + "\nS -- Singer" 
                + "\nQ -- Quit"
                + "\n--------------------------------------------------";
		         
        this.promptMessage = "\nPlease choose a Hold Audition Menu Option: ";
    }

    public void displayHoldAuditionMenuView() {
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
        int skillLevel;
        switch (choice) {
            case "D": // drummer
                skillLevel = this.drummer();
                //todo add the drummer to the band somehow
                System.out.println("Drummer's skill level is " + skillLevel);
                break;
            case "G": // guitarist
                this.guitarist();
                break;
            case "B": // bass guitarist
                this.bassGuitarist();
                break;
            case "K": // Keyboardist
                this.keyboardist();
                break;
            case "S": // singer
                this.singer();
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

    private int drummer() {     
        // display the drummer aution view
        DrummerAuditionView drummerAudition = new DrummerAuditionView();
        return drummerAudition.displayDrummerAuditionView();
    }

    private void guitarist() {
        System.out.println("*** guitarist function called ***");     
    }

    private void bassGuitarist() {
        System.out.println("*** bassGuitarist function called ***"); 
    }

    private void keyboardist() {
        System.out.println("*** keyboardist function called ***");        
    }

    private void singer() {
        System.out.println("*** singer function called ***");          
    }  
    
}
