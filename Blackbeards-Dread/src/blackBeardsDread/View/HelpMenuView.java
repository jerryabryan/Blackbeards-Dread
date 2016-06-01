/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.View;
import java.util.Scanner;

/**
 *
 * @author jkbry
 */
class HelpMenuView {

    private String menu;
    
    public HelpMenuView() {
        this.menu = "\n"
                  + "\n----------------------------"
                  + "\n| Help Menu                |"
                  + "\n----------------------------"
                  + "\nG - Goal of the game"
                  + "\nM - How to move"
                  + "\nR - What are the resources available"
                  + "\nU - How to use available resources"
                  + "\nT - Tips"
                  + "\nQ - Quit to main menu"
                  + "\n----------------------------";
    }
    
    void displayHelpMenuView() {
        
        boolean done = false; // set flat to not done
        do {
            //prompt for and get player name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // User wants to quit
                return; // return to main menu
            
            // do the requested action and dispaly the next view
            done = this.doAction(menuOption);
            
        } while(!done);
    
    }   

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); 
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println(this.menu);
            System.out.println("\nSelect a Menu Option");
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break;
        }
        
        return value;
    }

    private boolean doAction(String choice) {
        
        choice = choice.toUpperCase();
        
        switch (choice) {
            case "G": //Goal of the game
                this.goalOfGame();
                break;
            case "M": //How to move
                this.howToMove();
                break;
            case "R": //Resources available
                this.resourcesAvailable();
                break;
            case "U": //How to use available resources
                this.howToUseResources();
                break;
            case "T": //Tips
                this.helpTips();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
        }

        return false;
    
    }

    private void goalOfGame() {
        System.out.println("\n*** goalOfGame() called *** Try again");
    }

    private void howToMove() {
        System.out.println("\n*** howToMove() called *** Try again");
    }

    private void resourcesAvailable() {
        System.out.println("\n*** resourcesAvailable() called *** Try again");
    }

    private void howToUseResources() {
        System.out.println("\n*** howToUseResources() called *** Try again");
    }

    private void helpTips() {
        System.out.println("\n*** helpTips() called *** Try again");
    }
    
}
