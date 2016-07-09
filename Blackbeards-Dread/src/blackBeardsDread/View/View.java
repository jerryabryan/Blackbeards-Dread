/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.View;

import blackBeardsDread.model.Sea;
import blackBeardsDread.model.Ship;
import blackbeards.dread.BlackbeardsDread;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Evan
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    protected Sea sea = null;
    
    protected final BufferedReader keyboard = BlackbeardsDread.getInFile();
    protected final PrintWriter console = BlackbeardsDread.getOutFile();
    
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
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            this.console.println(this.displayMessage);
            //this.console.println("\nSelect a Menu Option");
            try {
                value = this.keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
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
