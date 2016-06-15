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
public class MainMenuView extends View {
    
   
    public MainMenuView() {
        super("\n"
            + "\n----------------------------"
            + "\n| Main Menu                |"
            + "\n----------------------------"
            + "\nN - Start New Game"
            + "\nG - Load Saved Game"
            + "\nH - Gameplay Help"
            + "\nS - Save Game"
            + "\nQ - Quit Game"
            + "\n----------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase();
        
        switch (value) {
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
        gameMenuView.display();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
        // display help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }
    
}
