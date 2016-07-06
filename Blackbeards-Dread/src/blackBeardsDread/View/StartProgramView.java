/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.View;

import blackBeardsDread.Control.GameControl;
import blackBeardsDread.model.Player;
import java.util.Scanner;

/**
 *
 * @author Evan
 */
public class StartProgramView {

    public void displayStartProgramView() {
         boolean done = false; // set flag to not done
        do {
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q"))
                return;
            done = this.doAction(playersName);
            
        } while (!done);
    }

  
   
    
    private String promptMessage;
    
    public StartProgramView() {
        
        this.promptMessage = "\nPlease enter your name: ";
        // display the banner when view is created
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
          "\n***************************************************"
        + "\n* You are becoming the pirate all pirates fear.   *"
        + "\n* You have chosen a crew of devoted sailors all   *"
        + "\n* loyal to your command. After searching the high *"
        + "\n* seas for a haven to store your riches, you have *"
        + "\n* discovered a small island's inlet named Dead    *"
        + "\n* Reef Cove.                                      *" 
        + "\n*                                                 *"
        + "\n* As a pirate captain you have fought your way    *"
        + "\n* upward, and made a name for yourself. As you    *"
        + "\n* progress through the game you will become more  *"
        + "\n* and more renowned and RICH! Don't get too comfy *"
        + "\n* in your high state however. Your test is nigh!  *" 
        + "\n*                                                 *"
        + "\n* The game begins at 'Dead Reef Cove'. You must   *"
        + "\n* venture to find and conquer the last feared     *"
        + "\n* pirate Blackbeard. You will come across enemy   *"
        + "\n* ships to battle, ports to resupply and your     *"
        + "\n* final test, Blackbeard himself. Prepare well    *"
        + "\n* and be sure to upgrade you ship, he and his     *"
        + "\n* crew have decades before the mast! He will not  *"
        + "\n* go down without a fight!                        *"
        + "\n***************************************************"
        );
    }

    private String getPlayersName() {
        Scanner keyboard = new Scanner(System.in); 
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println("\n" + this.promptMessage);
            
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

    private boolean doAction(String playersName) {
        
        if (playersName.length() < 2) {
            System.out.println("\nInvalid players name: "
                    + "the name must be greater than one character in length");
            return false;
        }
        
        Player player = GameControl.createPlayer(playersName);
        
        if (player == null) {
            System.out.println("\nError Creating the player.");
            return false;
        }
        this.displayNextView(player);
        return true;
    }

    private void displayNextView(Player player) {
       
        //dispalys the welcome message
        System.out.println("\n======================================="
                           + "\n       Welcome to the game " + player.getName()
                           + "\n               Arrrgghh"
                           + "\n=======================================");
    
        //Creat MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
                
        // Display the main menu view
        mainMenuView.display();
    }
}
