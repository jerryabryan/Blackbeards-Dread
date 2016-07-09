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
class HelpMenuView extends View {

   
    
    public HelpMenuView() {
        super("\n"
                  + "\n----------------------------"
                  + "\n| Help Menu                |"
                  + "\n----------------------------"
                  + "\nG - Goal of the game"
                  + "\nM - How to move"
                  + "\nR - What are the resources available"
                  + "\nU - How to use available resources"
                  + "\nT - Tips"
                  + "\nQ - Quit to main menu"
                  + "\n----------------------------");
    }

    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase();
        
        switch (value) {
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
        this.console.println("\n************************************************"
                         + "\n* The goal of the game is to prepare for your  *"
                         + "\n* final battle against Blackbeard. You have    *"
                         + "\n* to purchase supplies and ship upgrades along *"
                         + "\n* your way. If you don't prepare, you risk the *"
                         + "\n* chance of being defeated.                    *"
                         + "\n************************************************");
    }

    private void howToMove() {
        this.console.println("\n************************************************"
                         + "\n* Move by simply selecting the menu option     *"
                         + "\n* that will take you to your desired location. *"
                         + "\n* However, be wary, if you venture too far     *"
                         + "\n* without preparing, you may end up meeting    *"
                         + "\n* your doom!                                   *"
                         + "\n************************************************");
    }

    private void resourcesAvailable() {
        this.console.println("\n************************************************"
                         + "\n* Resources available are water, food, and     *"
                         + "\n* weapon upgrades. Gold can can be used to     *"
                         + "\n* purchase these resources.                    *"
                         + "\n************************************************");
    }

    private void howToUseResources() {
        this.console.println("\n************************************************"
                         + "\n* Water and food are required for each journey *"
                         + "\n* to a new location, weapons are not. Remember *"
                         + "\n* to upgrade your ship. If you don't, you may  *"
                         + "\n* end up finding yourelf sinking down to meet  *"
                         + "\n* 'ol Hobb.                                    *"
                         + "\n************************************************");
    }

    private void helpTips() {
        this.console.println("\n************************************************"
                         + "\n* Don't forget to purchase your ship upgrades. *"
                         + "\n* If you don't have enough gold you can check  *"
                         + "\n* the Guild Hall for possible employment.      *"
                         + "\n* Be sure to face Blackbeard fully prepared!   *"
                         + "\n************************************************");
    }
    
}
