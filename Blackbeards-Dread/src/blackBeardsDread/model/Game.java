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
public class Game implements Serializable{
    
    //class instance variables
    private String playerName;
    private double saveShip;
    private double saveCurrentLocation;

    public Game() {
    }

    
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public double getSaveShip() {
        return saveShip;
    }

    public void setSaveShip(double saveShip) {
        this.saveShip = saveShip;
    }

    public double getSaveCurrentLocation() {
        return saveCurrentLocation;
    }

    public void setSaveCurrentLocation(double saveCurrentLocation) {
        this.saveCurrentLocation = saveCurrentLocation;
    }
    
    @Override
    public String toString() {
        return "Game{" + "playerName=" + playerName + ", saveShip=" + saveShip + ", saveCurrentLocation=" + saveCurrentLocation + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.playerName);
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.saveShip) ^ (Double.doubleToLongBits(this.saveShip) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.saveCurrentLocation) ^ (Double.doubleToLongBits(this.saveCurrentLocation) >>> 32));
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.saveShip) != Double.doubleToLongBits(other.saveShip)) {
            return false;
        }
        if (Double.doubleToLongBits(this.saveCurrentLocation) != Double.doubleToLongBits(other.saveCurrentLocation)) {
            return false;
        }
        if (!Objects.equals(this.playerName, other.playerName)) {
            return false;
        }
        return true;
    }
    
    
    
}
