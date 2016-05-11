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
public class Location implements Serializable{
    
    //class instance vaiables
    private String portName;
    private double waterStore;
    private double goodStore;
    private double armory;
    private double dryDock;
    private double guildHall;

    public Location() {
    }
    

    public String getPortName() {
        return portName;
    }

    public void setPortName(String portName) {
        this.portName = portName;
    }

    public double getWaterStore() {
        return waterStore;
    }

    public void setWaterStore(double waterStore) {
        this.waterStore = waterStore;
    }

    public double getGoodStore() {
        return goodStore;
    }

    public void setGoodStore(double goodStore) {
        this.goodStore = goodStore;
    }

    public double getArmory() {
        return armory;
    }

    public void setArmory(double armory) {
        this.armory = armory;
    }

    public double getDryDock() {
        return dryDock;
    }

    public void setDryDock(double dryDock) {
        this.dryDock = dryDock;
    }

    public double getGuildHall() {
        return guildHall;
    }

    public void setGuildHall(double guildHall) {
        this.guildHall = guildHall;
    }

    @Override
    public String toString() {
        return "Location{" + "portName=" + portName + ", waterStore=" + waterStore + ", goodStore=" + goodStore + ", armory=" + armory + ", dryDock=" + dryDock + ", guildHall=" + guildHall + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.portName);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.waterStore) ^ (Double.doubleToLongBits(this.waterStore) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.goodStore) ^ (Double.doubleToLongBits(this.goodStore) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.armory) ^ (Double.doubleToLongBits(this.armory) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.dryDock) ^ (Double.doubleToLongBits(this.dryDock) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.guildHall) ^ (Double.doubleToLongBits(this.guildHall) >>> 32));
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
        final Location other = (Location) obj;
        if (Double.doubleToLongBits(this.waterStore) != Double.doubleToLongBits(other.waterStore)) {
            return false;
        }
        if (Double.doubleToLongBits(this.goodStore) != Double.doubleToLongBits(other.goodStore)) {
            return false;
        }
        if (Double.doubleToLongBits(this.armory) != Double.doubleToLongBits(other.armory)) {
            return false;
        }
        if (Double.doubleToLongBits(this.dryDock) != Double.doubleToLongBits(other.dryDock)) {
            return false;
        }
        if (Double.doubleToLongBits(this.guildHall) != Double.doubleToLongBits(other.guildHall)) {
            return false;
        }
        if (!Objects.equals(this.portName, other.portName)) {
            return false;
        }
        return true;
    }
    
    
}
