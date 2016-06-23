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
 * @author jkbry
 */
public class Ship implements Serializable{
    public enum ShipType {
    playerShip,
    levelOne,
    levelTwo,
    levelThree,
    levelFour,
    blackbeard;
    }
    //class instance vaiables
    private double health;
    private double dammage;
    private double weapons;
    private double shipType;

    public Ship() {
        this.dammage = 0;
        this.health = 100;
        this.weapons = 20;
        this.shipType = ShipType.playerShip.ordinal();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.health) ^ (Double.doubleToLongBits(this.health) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.weapons) ^ (Double.doubleToLongBits(this.weapons) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.shipType);
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
        final Ship other = (Ship) obj;
        if (Double.doubleToLongBits(this.health) != Double.doubleToLongBits(other.health)) {
            return false;
        }
        if (Double.doubleToLongBits(this.weapons) != Double.doubleToLongBits(other.weapons)) {
            return false;
        }
        if (!Objects.equals(this.shipType, other.shipType)) {
            return false;
        }
        return true;
    }

    public double getDammage() {
        return dammage;
    }

    public void setDammage(double dammage) {
        this.dammage = dammage;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getWeapons() {
        return weapons;
    }

    public void setWeapons(double weapons) {
        this.weapons = weapons;
    }

    public double getShipType() {
        return shipType;
    }

    public void setShipType(double shipType) {
        this.shipType = shipType;
    }

    @Override
    public String toString() {
        return "Ship{" + "health=" + health + ", weapons=" + weapons + ", shipType=" + shipType + '}';
    }

}