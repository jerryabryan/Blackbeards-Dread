/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Evan
 */
public class Inventory implements Serializable{
    
    private double food;
    private double water;
    private double gold;

    public Inventory() {
    }

    public double getFood() {
        return food;
    }

    public void setFood(double food) {
        this.food = food;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    @Override
    public String toString() {
        return "Inventory{" + "food=" + food + ", water=" + water + ", gold=" + gold + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.food) ^ (Double.doubleToLongBits(this.food) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.water) ^ (Double.doubleToLongBits(this.water) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.gold) ^ (Double.doubleToLongBits(this.gold) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Inventory other = (Inventory) obj;
        if (Double.doubleToLongBits(this.food) != Double.doubleToLongBits(other.food)) {
            return false;
        }
        if (Double.doubleToLongBits(this.water) != Double.doubleToLongBits(other.water)) {
            return false;
        }
        if (Double.doubleToLongBits(this.gold) != Double.doubleToLongBits(other.gold)) {
            return false;
        }
        return true;
    }
    
    

    public double getGold() {
        return gold;
    }

    public void setGold(double gold) {
        this.gold = gold;
    }

    
    
    
}
