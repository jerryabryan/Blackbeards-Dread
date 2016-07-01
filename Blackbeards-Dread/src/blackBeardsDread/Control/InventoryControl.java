/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.Control;

import blackBeardsDread.Exceptions.InventoryControlException;
import blackBeardsDread.model.Game;
import blackBeardsDread.model.Inventory;
import blackBeardsDread.model.Item;
import blackbeards.dread.BlackbeardsDread;

/**
 *
 * @author jkbry
 */
public class InventoryControl {

    public static void checkTravelCost(double wCost, double fCost) throws InventoryControlException {
        Game game = BlackbeardsDread.getCurrentGame();
        Inventory[] inventory = game.getInventory();
        double foodAmount = inventory[Item.food.ordinal()].getQuantityInStock();
        double waterAmount = inventory[Item.water.ordinal()].getQuantityInStock();
        if (foodAmount >= fCost || waterAmount >= wCost) {
            return;
        } else {
            throw new InventoryControlException("You do not have enough supplies.");
        }
        
    }

    public static void deductSuppliesFromInventory(double wCost, double fCost) {
        Game game = BlackbeardsDread.getCurrentGame();
        Inventory[] inventory = game.getInventory();
        double foodAmount = inventory[Item.food.ordinal()].getQuantityInStock();
        double waterAmount = inventory[Item.water.ordinal()].getQuantityInStock();
        double newFood = foodAmount - fCost;
        double newWater = waterAmount - wCost;
        inventory[Item.food.ordinal()].setQuantityInStock(newFood);
        inventory[Item.water.ordinal()].setQuantityInStock(newWater);
        game.setInventory(inventory);
        BlackbeardsDread.setCurrentGame(game);
    }
    
    
}
