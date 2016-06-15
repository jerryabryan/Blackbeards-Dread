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
public class BattleSequenceView extends View{
    
    
    public BattleSequenceView() {
        
        super("\n"
                  + "\n--------------------------------"
                  + "\n| Battle Menu                   |"
                  + "\n--------------------------------"
                  + "\nF - Fire"
                  + "\nR - Run back to Dead Reef Cove"
                  + "\n--------------------------------");
        
    }
    
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase();
        boolean done = false;
        switch (value) {
            case "F": //Fire cannons
                done = this.fireCannnons();
                
                break;
            case "R": //Run back to Dead Reef Cove
                done = this.runToCove();
                
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
       
        }
        return done;
    }

    private boolean runToCove() {
        int results = BattleControl.runAway();
        if (results == 3) {
            return true;
            
        } else
            return false;
    }

  

    private boolean fireCannnons() {
        int results = BattleControl.fireCannons();
            if (results == 1) {
              return true;
            } else
                return false;    }
    
}


/*


    
    
    
    Display Remaining Health



*/