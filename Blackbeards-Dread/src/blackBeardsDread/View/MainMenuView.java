/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.View;
import blackBeardsDread.Control.GameControl;
import blackbeards.dread.BlackbeardsDread;
import java.util.Scanner;


/**
 *
 * @author jkbry
 */
public class MainMenuView {
    
    private String menu;
    
    public MainMenuView() {
        this.menu = "\n"
                  + "\n----------------------------"
                  + "\n| Main Menu                |"
                  + "\n----------------------------"
                  + "\nN - Start New Game"
                  + "\nG - Load Saved Game"
                  + "\nH - Gameplay Help"
                  + "\nS - Save Game"
                  + "\nQ - Quit Game"
                  + "\n----------------------------";
    }
    
    void displayMainMenuView() {
        
        boolean done = false; // set flat to not done
        do {
            //prompt for and get player name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // User wants to quit
                return; // exit game
            
            // do the requested action and display the next view
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
            case "N": //New Game
                this.startNewGame();
                break;
            case "G": //Load Saved Game
                this.startExistingGame();
                break;
            case "H": //Display Help Menu
                this.displayHelpMenu();
                break;
            case "S": //Save current game
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
        }

        return false;
    }

    private void startNewGame() {
            // create a new game
        GameControl.createNewGame(BlackbeardsDread.getPlayer());
    
        // display game menu
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.displayGameMenuView();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
        // display help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenuView();
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }
    
}
