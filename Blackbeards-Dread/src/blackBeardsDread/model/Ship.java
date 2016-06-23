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
public enum Ship implements Serializable{
    
    levelOne(1),
    levelTwo(2),
    levelThree(3),
    levelFour(4),
    blackbeard(5);
    
    //class instance vaiables
    private final double health;
    private final double weapons;

    Ship(double health, double weapons) {
        this.health = health;
        this.weapons = weapons;
    }
    
    public double getHealth() {
        return health;
    }

    public double getWeapons() {
        return weapons;
    }

    @Override
    public String toString() {
        return "Ship{" + "health=" + health + ", weapons=" + weapons"}";
    }   

}