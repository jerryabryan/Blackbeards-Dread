/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.model;

import java.io.Serializable;

/**
 *
 * @author jkbry
 */
public class Battle implements Serializable{
    
    //class instance variables
    
    private double reward;
    private Ship enemyShip;

    public Ship getEnemyShip() {
        return enemyShip;
    }

    public void setEnemyShip(Ship enemyShip) {
        this.enemyShip = enemyShip;
    }

    public Battle(double reward, double health, double weapons, double shipType) {
        this.reward = reward;
        this.enemyShip = new Ship();
        this.enemyShip.setHealth(health);
        this.enemyShip.setWeapons(weapons);
        this.enemyShip.setShipType(shipType);
    }

    
   
    public double getReward() {
        return reward;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }
    
}
