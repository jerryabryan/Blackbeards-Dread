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
public class Ship implements Serializable{
    
    //class instance vaiables
    private double health;
    private double damage;
    private double weapons;
    private double sails;

    public Ship() {
    }

    
    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getWeapons() {
        return weapons;
    }

    public void setWeapons(double weapons) {
        this.weapons = weapons;
    }

    public double getSails() {
        return sails;
    }

    public void setSails(double sails) {
        this.sails = sails;
    }

    @Override
    public String toString() {
        return "Ship{" + "health=" + health + ", damage=" + damage + ", weapons=" + weapons + ", sails=" + sails + '}';
    }

    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.health) ^ (Double.doubleToLongBits(this.health) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.damage) ^ (Double.doubleToLongBits(this.damage) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.weapons) ^ (Double.doubleToLongBits(this.weapons) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.sails) ^ (Double.doubleToLongBits(this.sails) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ship other = (Ship) obj;
        if (Double.doubleToLongBits(this.health) != Double.doubleToLongBits(other.health)) {
            return false;
        }
        if (Double.doubleToLongBits(this.damage) != Double.doubleToLongBits(other.damage)) {
            return false;
        }
        if (Double.doubleToLongBits(this.weapons) != Double.doubleToLongBits(other.weapons)) {
            return false;
        }
        if (Double.doubleToLongBits(this.sails) != Double.doubleToLongBits(other.sails)) {
            return false;
        }
        return true;
    }
    
    
    
}
