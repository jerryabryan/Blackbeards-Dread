/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.Control;

import blackBeardsDread.Exceptions.PortControlException;
import blackBeardsDread.model.Game;
import blackBeardsDread.model.Inventory;
import blackBeardsDread.model.Item;
import blackBeardsDread.model.Ship;
import blackbeards.dread.BlackbeardsDread;

/**
 *
 * @author jkbry
 */
public class PortControl {

    public static void purchase(double store, double cost) {
        Game game = BlackbeardsDread.getCurrentGame();
        Inventory[] inventory = game.getInventory();
        double gold = inventory[Item.gold.ordinal()].getQuantityInStock();
        if (store == 0) {
           Ship ship = game.getShip();
           double damage = ship.getDammage();
           try {
               PortControl.purchaseHealth(damage, gold, cost);
           } catch ()
           
          
       }
       
    }
    
    public static void purchaseHealth(double damage, double gold, double cost) {
        
    }
    
    public void purchaseWater(double water, double gold, double desiredWater, double waterPrice) throws PortControlException {
        if (desiredWater < 0 || desiredWater > 10){
            throw new PortControlException("Can not purchase negative amounts of "
                                         + "water or amounts over 10 units");
        }
        
        if (gold < (desiredWater * waterPrice)) {
            throw new PortControlException("You do not have enough gold to make "
                                         + "this purchase!");
        }
        
        double newWaterTotal = water + desiredWater;
        
        if (newWaterTotal > 100) {
            throw new PortControlException("You may not purchase more than 100 "
                                         + "units of water!");
        }
        
    }
    
    public void purchaseFood(double food, double gold, double desiredFood, double foodPrice) throws PortControlException {
        if (desiredFood < 0 || desiredFood > 10){
            throw new PortControlException("Can not purchase negative amounts of "
                                         + "food or amounts over 10 units");
        }
        
        if (gold < (desiredFood * foodPrice)) {
            throw new PortControlException("You do not have enough gold to make "
                                         + "this purchase!");
        }
        
        double newFoodTotal = food + desiredFood;
        
        if (newFoodTotal > 100) {
            throw new PortControlException("You may not purchase more than 100 "
                                         + "units of water!");
        }
        
    }
    
    public void purchaseArmory(double weapons, double gold, double desiredWeapons, double weaponsPrice) throws PortControlException {
        if (desiredWeapons < 0 || desiredWeapons > 10){
            throw new PortControlException("You can only purchase one weapon upgrade!");
        }
        
        if (gold < (desiredWeapons * weaponsPrice)) {
            throw new PortControlException("You do not have enough gold to make "
                                         + "this purchase!");
        }
        
        double newWeaponsTotal = weapons + desiredWeapons;
        
        if (newWeaponsTotal > 100) {
            throw new PortControlException("You can only purchase one weapon uprade!");
        }
        
    }

 

   
}

