/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackbeards.dread;

import blackBeardsDread.model.Game;

/**
 *
 * @author jkbry
 */
public class BlackbeardsDread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game game1 = new Game();
        
        game1.setPlayerName("Joe");
        game1.setSaveShip(12);
        game1.setSaveCurrentLocation(2);
        
        String gameInfo = game1.toString();
        System.out.println(gameInfo);
    
    }
    
}
