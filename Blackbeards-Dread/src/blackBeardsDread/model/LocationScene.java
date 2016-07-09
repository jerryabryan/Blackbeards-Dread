/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.model;

import java.io.Serializable;

/**
 *
 * @author Evan
 */
public class LocationScene implements Serializable  {
    public enum StoreType {
        dryDock,
        foodStore,
        waterStore,
        armory,
        guildHall;
    }
    
    private double price;
    private boolean purchased;
    private double storeType;

    public LocationScene(double price, double storeType) {
        this.purchased = false;
        this.price = price;
        this.storeType = storeType;
    }
    

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean getPurchased() {
        return purchased;
    }

    public void setPurchased(boolean purchased) {
        this.purchased = purchased;
    }

    public double getStoreType() {
        return storeType;
    }

    public void setStoreType(double storeType) {
        this.storeType = storeType;
    }
    
    
}
