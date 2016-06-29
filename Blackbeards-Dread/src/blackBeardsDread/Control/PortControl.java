/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.Control;

import blackBeardsDread.Exceptions.PortControlException;

/**
 *
 * @author jkbry
 */
public class PortControl {

    public static void purchase(String store, int cost) {
       System.out.println("startPuchase function called");
       
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

