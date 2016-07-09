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
import blackBeardsDread.model.Location;
import blackBeardsDread.model.LocationScene;
import blackBeardsDread.model.Map;
import blackBeardsDread.model.Scene;
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
        double quantity;
        if (store == 0) {
           Ship ship = game.getShip();
           double damage = ship.getDammage();
           try {
               damage = PortControl.purchaseHealth(damage, gold, cost);
           } catch (PortControlException me) {
                System.out.println(me.getMessage());
           }
           gold = gold - cost;
           ship.setDammage(damage);
           game.setShip(ship);
        } else if (store == 1) {
            double food = inventory[Item.food.ordinal()].getQuantityInStock();
            try { 
                PortControl.purchaseFood(food, gold, 10, cost);
            } catch (PortControlException me) {
                System.out.println(me.getMessage());
            }
            gold = gold - cost;
            food = food + 10;
            inventory[Item.food.ordinal()].setQuantityInStock(food);
        } else if (store == 2) {
            double water = inventory[Item.water.ordinal()].getQuantityInStock();
            try { 
                PortControl.purchaseWater(water, gold, 10, cost);
            } catch (PortControlException me) {
                System.out.println(me.getMessage());
            }
            gold = gold - cost;
            water = water + 10;
            inventory[Item.food.ordinal()].setQuantityInStock(water);
        }
        inventory[Item.gold.ordinal()].setQuantityInStock(gold);
        game.setInventory(inventory);
        BlackbeardsDread.setCurrentGame(game);
    }
       
    
    
    public static double purchaseHealth(double damage, double gold, double cost) throws PortControlException {
        if (gold < cost) {
            throw new PortControlException("You do not have enough gold to make this purchase!");
        }
        
        if (damage == 0) {
            throw new PortControlException("Your Health is full");
        }
        
        if (damage < 10) {
            damage = 0;   
        } else {
            damage = damage - 10;
        }
    
        return damage;
    }
    
    public static void purchaseWater(double water, double gold, double desiredWater, double waterPrice) throws PortControlException {
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
    
    public static void purchaseFood(double food, double gold, double desiredFood, double foodPrice) throws PortControlException {
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

