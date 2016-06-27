/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.Control;

import blackBeardsDread.model.Game;
import blackBeardsDread.model.Inventory;
import blackBeardsDread.model.Item;
import blackBeardsDread.model.Location;
import blackBeardsDread.model.Map;
import blackBeardsDread.model.Player;
import blackBeardsDread.model.Scene;
import blackBeardsDread.model.SceneType;
import blackBeardsDread.model.Ship;
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

    public static void createNewGame(Player player) {
        
        Game game = new Game();
        BlackbeardsDread.setCurrentGame(game);
        
        game.setPlayer(player);
        
        Inventory[] invntoryList = GameControl.createInventoryList();
        game.setInventory(invntoryList);
        
        Ship ship = new Ship();
        game.setShip(ship);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.movePlayerToStartingLocation(map);
    }

    private static Inventory[] createInventoryList() {
        
        Inventory[] inventory = 
                new Inventory[4];
        
        Inventory gold = new Inventory();
        gold.setInventoryType("Gold");
        gold.setQuantityInStock(0);
        gold.setRequiredAmount(0);
        inventory[Item.gold.ordinal()] = gold;
        
        Inventory food = new Inventory();
        food.setInventoryType("Food");
        food.setQuantityInStock(20);
        food.setRequiredAmount(20);
        inventory[Item.food.ordinal()] = food;
        
        Inventory water = new Inventory();
        water.setInventoryType("Water");
        water.setQuantityInStock(20);
        water.setRequiredAmount(20);
        inventory[Item.water.ordinal()] = water;
        
        Inventory shipUpgrade = new Inventory();
        shipUpgrade.setInventoryType("Ship Upgrade");
        shipUpgrade.setQuantityInStock(0);
        shipUpgrade.setRequiredAmount(0);
        inventory[Item.shipUpgrade.ordinal()] = shipUpgrade;
        return inventory;
    }

    static void assignScenesToLocations(Map map, Scene[] scenes) {
       Location[][] locations = map.getLocations();
       
       locations[0][0].setScene(scenes[SceneType.cove.ordinal()]);
       locations[0][0].setVisited(false);
       locations[0][1].setScene(scenes[SceneType.empty.ordinal()]);
       locations[0][1].setVisited(false);
       locations[0][2].setScene(scenes[SceneType.empty.ordinal()]);
       locations[0][2].setVisited(false);
       locations[0][3].setScene(scenes[SceneType.empty.ordinal()]);
       locations[0][3].setVisited(false);
       locations[0][4].setScene(scenes[SceneType.empty.ordinal()]);
       locations[0][4].setVisited(false);
       locations[1][0].setScene(scenes[SceneType.dryDock1.ordinal()]);
       locations[0][0].setVisited(false);
       locations[1][1].setScene(scenes[SceneType.foodStore1.ordinal()]);
       locations[0][1].setVisited(false);
       locations[1][2].setScene(scenes[SceneType.waterStore1.ordinal()]);
       locations[0][2].setVisited(false);
       locations[1][3].setScene(scenes[SceneType.armory1.ordinal()]);
       locations[0][3].setVisited(false);
       locations[1][4].setScene(scenes[SceneType.guildHall1.ordinal()]);
       locations[0][4].setVisited(false);
       locations[2][0].setScene(scenes[SceneType.dryDock2.ordinal()]);
       locations[0][0].setVisited(false);
       locations[2][1].setScene(scenes[SceneType.foodStore2.ordinal()]);
       locations[0][1].setVisited(false);
       locations[2][2].setScene(scenes[SceneType.waterStore2.ordinal()]);
       locations[0][2].setVisited(false);
       locations[2][3].setScene(scenes[SceneType.armory2.ordinal()]);
       locations[0][3].setVisited(false);
       locations[2][4].setScene(scenes[SceneType.guildHall2.ordinal()]);
       locations[0][4].setVisited(false);
       locations[3][0].setScene(scenes[SceneType.dryDock3.ordinal()]);
       locations[0][0].setVisited(false);
       locations[3][1].setScene(scenes[SceneType.foodStore3.ordinal()]);
       locations[0][1].setVisited(false);
       locations[3][2].setScene(scenes[SceneType.waterStore3.ordinal()]);
       locations[0][2].setVisited(false);
       locations[3][3].setScene(scenes[SceneType.armory3.ordinal()]);
       locations[0][3].setVisited(false);
       locations[3][4].setScene(scenes[SceneType.guildHall3.ordinal()]);
       locations[0][4].setVisited(false);
       locations[4][0].setScene(scenes[SceneType.dryDock4.ordinal()]);
       locations[0][0].setVisited(false);
       locations[4][1].setScene(scenes[SceneType.foodStore4.ordinal()]);
       locations[0][1].setVisited(false);
       locations[4][2].setScene(scenes[SceneType.waterStore4.ordinal()]);
       locations[0][2].setVisited(false);
       locations[4][3].setScene(scenes[SceneType.armory4.ordinal()]);
       locations[0][3].setVisited(false);
       locations[4][4].setScene(scenes[SceneType.guildHall4.ordinal()]);
       locations[0][4].setVisited(false);
       locations[5][0].setScene(scenes[SceneType.dryDock5.ordinal()]);
       locations[0][0].setVisited(false);
       locations[5][1].setScene(scenes[SceneType.foodStore5.ordinal()]);
       locations[0][1].setVisited(false);
       locations[5][2].setScene(scenes[SceneType.waterStore5.ordinal()]);
       locations[0][2].setVisited(false);
       locations[5][3].setScene(scenes[SceneType.armory5.ordinal()]);
       locations[0][3].setVisited(false);
       locations[5][4].setScene(scenes[SceneType.guildHall5.ordinal()]);
       locations[0][4].setVisited(false);
       locations[6][0].setScene(scenes[SceneType.finalBattle.ordinal()]);
       locations[0][0].setVisited(false);
       locations[6][1].setScene(scenes[SceneType.empty.ordinal()]);
       locations[0][1].setVisited(false);
       locations[6][2].setScene(scenes[SceneType.empty.ordinal()]);
       locations[0][2].setVisited(false);
       locations[6][3].setScene(scenes[SceneType.empty.ordinal()]);
       locations[0][3].setVisited(false);
       locations[6][4].setScene(scenes[SceneType.empty.ordinal()]);
       locations[0][4].setVisited(false);
    }

  
}
