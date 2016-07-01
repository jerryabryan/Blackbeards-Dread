/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.Control;

import blackBeardsDread.model.Game;
import blackBeardsDread.model.Inventory;
import blackBeardsDread.model.Item;
import blackbeards.dread.BlackbeardsDread;

/**
 *
 * @author jkbry
 */
public class InventoryControl {

    public static int checkTravelCost(double wCost, double fCost) {
        Game game = BlackbeardsDread.getCurrentGame();
        Inventory[] inventory = game.getInventory();
        double foodAmount = inventory[Item.food.ordinal()].getQuantityInStock();
        double waterAmount = inventory[Item.water.ordinal()].getQuantityInStock();
        if (foodAmount >= fCost || waterAmount >= wCost) {
            return 1;
        } else {
            return 0;
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
