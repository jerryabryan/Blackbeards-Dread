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
public class BattleSequence {
    
    private String menu;
    
    public BattleSequence() {
        this.menu = "\n"
                  + "\n--------------------------------"
                  + "\n| Battle Menu                   |"
                  + "\n--------------------------------"
                  + "\nF - Fire"
                  + "\nR - Run back to Dead Reef Cove"
                  + "\n--------------------------------";
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
            case "F": //Fire cannons
                this.fireCannnons();
                break;
            case "R": //Run back to Dead Reef Cove
                this.runToCove();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
        }

        return false;
    }

    private void fireCannnons() {
        System.out.println("*** fireCannons function called ***");    }

    private void runToCove() {
        System.out.println("*** runToCove function called ***");    }
        
}
