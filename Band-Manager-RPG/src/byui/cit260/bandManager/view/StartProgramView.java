/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

/**
 *
 * @author shaza
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView(){
        
        this.promptMessage = "\nPlease enter a name for the band manager: ";
        // display the banner when view is created
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        );
       
    }
     /**
      * displays the start program view
      */    
    public void displayStartProgramView() {
       
        boolean done = false; // set flag to not done
        do{
           //prompt for and get players name
           String bandManagersName = this.getBandManagersName();
           if (bandManagersName.toUpperCase().equals("Q")) // user wants to quit
               return; //exit the game
        
           // do the requested action and display the next view
           done = this.doAction(bandManagersName);
        } while (!done);
        
    }

    private String getBandManagersName() {
        System.out.println("\n*** getBandManagersName() called ***");
        return "Joe";
    }

    private boolean doAction(String bandManagersName) {
        System.out.println("\n*** doAction() called ***");
        return true;
    }
    
}
