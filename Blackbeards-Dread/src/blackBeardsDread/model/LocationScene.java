/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.model;

/**
 *
 * @author Evan
 */
public class LocationScene {
    public enum storeType {
        waterStore,
        foodStore,
        armory,
        dryDock,
        guildHall;
    }
    
    private double price;
    private boolean purchased;
    private String storeType;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isPurchased() {
        return purchased;
    }

    public void setPurchased(boolean purchased) {
        this.purchased = purchased;
    }

    public String getStoreType() {
        return storeType;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }
    
    
}
