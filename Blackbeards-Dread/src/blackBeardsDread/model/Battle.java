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
    private double shipDamage;
    private double reward;
    private double shipDifficulty;
    private double escape;

    public Battle() {
    }

    
    public double getShipDamage() {
        return shipDamage;
    }

    public void setShipDamage(double shipDamage) {
        this.shipDamage = shipDamage;
    }

    public double getReward() {
        return reward;
    }

    public void setReward(double reward) {
        this.reward = reward;
    }

    public double getShipDifficulty() {
        return shipDifficulty;
    }

    public void setShipDifficulty(double shipDifficulty) {
        this.shipDifficulty = shipDifficulty;
    }

    public double getEscape() {
        return escape;
    }

    public void setEscape(double escape) {
        this.escape = escape;
    }

    @Override
    public String toString() {
        return "Battle{" + "shipDamage=" + shipDamage + ", reward=" + reward + ", shipDifficulty=" + shipDifficulty + ", escape=" + escape + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.shipDamage) ^ (Double.doubleToLongBits(this.shipDamage) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.reward) ^ (Double.doubleToLongBits(this.reward) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.shipDifficulty) ^ (Double.doubleToLongBits(this.shipDifficulty) >>> 32));
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.escape) ^ (Double.doubleToLongBits(this.escape) >>> 32));
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
        final Battle other = (Battle) obj;
        if (Double.doubleToLongBits(this.shipDamage) != Double.doubleToLongBits(other.shipDamage)) {
            return false;
        }
        if (Double.doubleToLongBits(this.reward) != Double.doubleToLongBits(other.reward)) {
            return false;
        }
        if (Double.doubleToLongBits(this.shipDifficulty) != Double.doubleToLongBits(other.shipDifficulty)) {
            return false;
        }
        if (Double.doubleToLongBits(this.escape) != Double.doubleToLongBits(other.escape)) {
            return false;
        }
        return true;
    }
    
    
}
