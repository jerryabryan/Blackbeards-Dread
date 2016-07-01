/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.View;

import blackBeardsDread.Control.BattleControl;
import blackBeardsDread.Control.MapControl;
import blackBeardsDread.model.Game;
import blackBeardsDread.model.Location;
import blackBeardsDread.model.Map;
import blackBeardsDread.model.Ship;
import blackbeards.dread.BlackbeardsDread;
import java.util.Scanner;

/**
 *
 * @author jkbry
 */
public class BattleSequenceView extends View{
    private final Location location;
    private Ship pShip;
    private Ship eShip;
    
    
    
    public BattleSequenceView(Location location) {
        
        super("\n"
                  + "\n--------------------------------"
                  + "\n|   You've met an enemy ship!  |"
                  + "\n--------------------------------");
        Game game = BlackbeardsDread.getCurrentGame();
        this.pShip = game.getShip();
        this.eShip = game.geteShip();
        double playerHealth = this.pShip.getHealth();
        double playerDamage = this.pShip.getDammage();
        double enemyHealth = this.eShip.getHealth();
        double enemyDamage = this.eShip.getDammage();
        double playerLife = playerHealth - playerDamage;
        double enemyLife = enemyHealth - enemyDamage;
        String pLife = String.valueOf(playerLife);
        String eLife = String.valueOf(enemyLife);
        this.location =location;
        this.displayMessage +=   "\n Your Health   " + pLife
                               + "\n Enemey Health " + eLife
                               + "\n--------------------------------"
                               + "\nF - Fire"
                               + "\nR - Run back to Dead Reef Cove"
                               + "\n--------------------------------";
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
        Game game = BlackbeardsDread.getCurrentGame();
        Map map = game.getMap();
        Location[][] locations = map.getLocations();
        map.setCurrentLocation(locations[0][0]);
        game.setMap(map);
        BlackbeardsDread.setCurrentGame(game);
        return true;
    }

  

    private boolean fireCannnons() {
        double playerAttack = this.pShip.getWeapons();
        double enemyHealth = this.eShip.getHealth();
        double enemyDammage = this.eShip.getDammage();
        enemyDammage = enemyDammage + playerAttack;
        if (enemyHealth <= enemyDammage) {
            this.eShip.setDammage(enemyDammage);
            return true;
        }
        double enemyAttack = this.eShip.getWeapons();
        double playerHealth = this.pShip.getHealth();
        double playerDammage = this.pShip.getDammage();
        playerDammage = playerDammage + enemyAttack;
        this.eShip.setDammage(enemyDammage);
        this.pShip.setDammage(playerDammage);
        Game game = BlackbeardsDread.getCurrentGame();
        Map map = game.getMap();
        map.setCurrentLocation(this.location);
        game.setMap(map);
        BlackbeardsDread.setCurrentGame(game);
        return true;
    
}

}

/*


    
    
    
    Display Remaining Health



*/
