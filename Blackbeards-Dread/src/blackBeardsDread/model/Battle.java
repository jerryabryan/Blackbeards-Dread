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
    public Ship enemyShip;

    public Ship getEnemyShip() {
        return enemyShip;
    }

    public void setEnemyShip(Ship enemyShip) {
        this.enemyShip = enemyShip;
    }

    public Battle() {
        Ship ship = new Ship();
        this.enemyShip = ship;
    }

    
   
    public double getReward() {
        return reward;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }
    
}
