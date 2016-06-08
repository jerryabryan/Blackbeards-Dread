/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.View;

import blackBeardsDread.Control.BattleControl;
import java.util.Scanner;

/**
 *
 * @author jkbry
 */
public class BattleSequenceView {
    
    private String menu;
    
    public BattleSequenceView() {
        
        this.menu = "\n"
                  + "\n--------------------------------"
                  + "\n| Battle Menu                   |"
                  + "\n--------------------------------"
                  + "\nF - Fire"
                  + "\nR - Run back to Dead Reef Cove"
                  + "\n--------------------------------";
        
    }
    
    public void displayBattleSequenceView() {

        double enemyHealth = BattleControl.startEnemyHealth();
        double enemyLevel = BattleControl.startEnemyLevel();
        double playerHealth = BattleControl.startPlayerHealth();
        
        boolean done = false; // set flat to not done
        do {
            //prompt for option input
            String menuOption = this.getMenuOption(enemyHealth, enemyLevel, playerHealth);
            if (menuOption.toUpperCase().equals("Q")) // User wants to quit
                return; // exit game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
        } while(!done);
    
    }
       
    private String getMenuOption(double enemyHealth, double enemyLevel, double playerHealth) {
        Scanner keyboard = new Scanner(System.in); 
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println(this.menu);
            //display player health and enemy health/level          ************************************
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
        boolean done = false;
        switch (choice) {
            case "F": //Fire cannons
                this.fireCannnons();
                done = true;
                break;
            case "R": //Run back to Dead Reef Cove
                this.runToCove();
                done = true;
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
        }

        return done;
    }
    
    private void fireCannnons() {
        BattleControl.fireCannons();
    }

    private void runToCove() {
        BattleControl.runAway();
    }
    
}


/*


    
    
    
    Display Remaining Health



*/