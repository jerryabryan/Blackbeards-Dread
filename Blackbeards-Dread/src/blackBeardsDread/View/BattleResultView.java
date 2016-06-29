/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.View;

import blackBeardsDread.model.Game;
import blackBeardsDread.model.Location;
import blackBeardsDread.model.Map;
import blackBeardsDread.model.Sea;
import blackbeards.dread.BlackbeardsDread;



/**
 *
 * @author jkbry
 */
public class BattleResultView {
    private String result;


    
    public BattleResultView() {
        this.result = "\nBattle Results";
    }

    public void displayBattleResultView(int i, Sea sea) {
        
                Location location = sea.getEndLocation();
                Game game = BlackbeardsDread.getCurrentGame();
                Map map = game.getMap();
        switch (i) {
            case 1: //Success
                this.successMessage();
                
                map.setCurrentLocation(location);
                game.setMap(map);
                BlackbeardsDread.setCurrentGame(game);
                break;
            case 2: //Loss
                this.lossMessage();
                break;
            case 3: //Return back to Dead Reef Cove
                this.returnToCove();
                Location[][] locations = map.getLocations();
                map.setCurrentLocation(locations[0][0]);
                game.setMap(map);
                BlackbeardsDread.setCurrentGame(game);
                break;    
            default:
                System.out.println("\n*** Display Error in Battle Result ***");
        }
       
    }

    private void successMessage() {
        System.out.println("\n*** You Won! ***");
    }

    private void lossMessage() {
        System.out.println("\n*** You Lost! ***");
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
    }

    private void returnToCove() {
        System.out.println("\n*** You successfully fled to Dead Reef Cove!***");
        
       
    }

}
