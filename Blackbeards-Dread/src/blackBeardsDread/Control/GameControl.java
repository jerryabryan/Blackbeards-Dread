/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.Control;

import blackBeardsDread.model.Player;

/**
 *
 * @author jkbry
 */
public class GameControl {

    public static Player createPlayer(String playersName) {
        System.out.println("\n*** createplayer() function called ***");
        return new Player();
    }
    
}
