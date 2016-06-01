/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.Control;

import blackBeardsDread.model.Player;
import blackbeards.dread.BlackbeardsDread;

/**
 *
 * @author jkbry
 */
public class GameControl {

    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name); 
        
        BlackbeardsDread.setPlayer(player); //save the player
        
        return player;
    }
}
