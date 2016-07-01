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
    
    private Ship ship;
    private double saveCurrentLocation;
    private Inventory[] inventory;
    private Player player;
    private Map map;
    private Ship eShip;

    public Ship geteShip() {
        return eShip;
    }

    public void seteShip(Ship eShip) {
        this.eShip = eShip;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Inventory[] getInventory() {
        return inventory;
    }

    public void setInventory(Inventory[] inventory) {
        this.inventory = inventory;
    }
    
    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public Game() {
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    
    

   
    public double getSaveCurrentLocation() {
        return saveCurrentLocation;
    }

    public void setSaveCurrentLocation(double saveCurrentLocation) {
        this.saveCurrentLocation = saveCurrentLocation;
    }

 
    
    
    
}
