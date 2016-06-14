/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackbeards.dread;

import blackBeardsDread.View.BattleSequenceView;
import blackBeardsDread.View.MoveLocationView;
import blackBeardsDread.View.StartProgramView;
import blackBeardsDread.model.Game;
import blackBeardsDread.model.Map;
import blackBeardsDread.model.Player;

/**
 *
 * @author jkbry
 */
public class BlackbeardsDread {

    private static Game currentGame = null;
    private static Player player = null;
    
    public static void main(String[] args) {
        
    StartProgramView startProgramView = new StartProgramView();
    startProgramView.displayStartProgramView();
        
//    MoveLocationView moveLocationView = new MoveLocationView();
//    moveLocationView.displayMoveLocationView(0);
            
        
        
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
