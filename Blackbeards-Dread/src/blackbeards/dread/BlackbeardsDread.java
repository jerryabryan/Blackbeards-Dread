/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackbeards.dread;

import blackBeardsDread.model.Battle;
import blackBeardsDread.model.Game;
import blackBeardsDread.model.Location;
import blackBeardsDread.model.Map;
import blackBeardsDread.model.Sea;
import blackBeardsDread.model.Ship;

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
    
        Battle battle1 = new Battle();
            battle1.setShipDamage(10);
            battle1.setReward(2);
            battle1.setShipDifficulty(2);
            battle1.setEscape(1);
        
            String battleInfo = battle1.toString();
            System.out.println(battleInfo);
            
        Location location1 = new Location();
            location1.setPortName("Canada");
            location1.setWaterStore(2);
            location1.setGoodStore(2);
            location1.setArmory(5);
            location1.setDryDock(7);
            location1.setGuildHall(10);
            
            String locationInfo = location1.toString();
            System.out.println(locationInfo);
            
        Ship ship1 = new Ship();
            ship1.setHealth(10);
            ship1.setDamage(6);
            ship1.setWeapons(2);
            ship1.setSails(3);
            
            String shipInfo = ship1.toString();
            System.out.println(shipInfo);
    
        Map map1 = new Map();
            map1.setCurrentLocation("London");
            
            String mapInfo = map1.toString();
            System.out.println(mapInfo);
    
        Sea sea1 = new Sea();
            sea1.setStartLocation("London");
            sea1.setEndLocation("Spain");
            
            String seaInfo = sea1.toString();
            System.out.println(seaInfo);
    }
}
