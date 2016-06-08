/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackbeards.dread;

import blackBeardsDread.View.BattleSequenceView;
import blackBeardsDread.View.StartProgramView;
import blackBeardsDread.model.Game;
import blackBeardsDread.model.Player;

/**
 *
 * @author jkbry
 */
public class BlackbeardsDread {

    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {
        
    BattleSequenceView battleSequenceView = new BattleSequenceView();
    battleSequenceView.displayBattleSequenceView();    
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        BlackbeardsDread.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        BlackbeardsDread.player = player;
    }
}
