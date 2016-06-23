/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.Control;

import blackBeardsDread.model.Game;
import blackBeardsDread.model.Inventory;
import blackBeardsDread.model.Item;
import blackBeardsDread.model.Map;
import blackBeardsDread.model.Player;
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

  
}
