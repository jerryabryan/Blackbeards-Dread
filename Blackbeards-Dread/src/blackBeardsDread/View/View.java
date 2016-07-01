/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.View;

import blackBeardsDread.model.Sea;
import blackBeardsDread.model.Ship;
import java.util.Scanner;

/**
 *
 * @author Evan
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    protected Sea sea = null;
    
    
    public View(){ 
    }
    
    public View(String message) {
        this.displayMessage = message;
    }
    
    @Override
    public void display() {
         boolean done = false; // set flat to not done
        do {
            //prompt for and get player name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) // User wants to quit
                return; // exit game
            
            // do the requested action and display the next view
            done = this.doAction(value);
            
        } while(!done);
    }
    
    @Override
    public String getInput() {
         Scanner keyboard = new Scanner(System.in); 
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println(this.displayMessage);
            //System.out.println("\nSelect a Menu Option");
            
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

    public Sea getSea() {
        return sea;
    }

    public void setSea(Sea sea) {
        this.sea = sea;
    }
    
    
}
