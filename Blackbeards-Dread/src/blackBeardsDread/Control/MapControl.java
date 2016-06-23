/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.Control;

import blackBeardsDread.model.Battle;
import blackBeardsDread.model.Map;
import blackBeardsDread.model.Scene;
import blackBeardsDread.model.SceneType;

/**
 *
 * @author Evan
 */
class MapControl {

    static Map createMap() {
        Map map = new Map(7, 5);
        
        Scene[] scenes = createScenes();
        
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
    }

    static void movePlayerToStartingLocation(Map map) {
        System.out.println("movePlayerToStartingLocation function called");
    }

    private static Scene[] createScenes() {
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene cove = new Scene();
        cove.setDescription("You are at your hidden Cove");
        cove.setBattle(null);
        cove.setLocationScene(null);
        cove.setMapSymbol(" COVE ");
        scenes[SceneType.cove.ordinal()] = cove;
        
        Scene londonDryDock = new Scene();
        londonDryDock.setDescription("London Dry Dock");
        Battle battle = new Battle();
        battle.enemyShip.setHealth(50);
        londonDryDock.setBattle(battle);
        
        
        
                
        return scenes;
    }
    
}
