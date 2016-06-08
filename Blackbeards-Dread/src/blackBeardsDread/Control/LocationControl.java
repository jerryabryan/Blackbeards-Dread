/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.Control;

import blackBeardsDread.model.Sea;

/**
 *
 * @author jkbry
 */
public class LocationControl {

    public static Sea setCourse(int currentLocation, int i) {
          Sea sea = new Sea();
         sea.setStartLocation(currentLocation);
         sea.setEndLocation(i);
         
         return sea;
         
    }

    public static double setFoodCost(int currentLocation, int i) {
        int dist = i - currentLocation;
        if (dist < 0) {
            dist = dist * -1;
        }
        double cost = dist * 30;
        return cost;
    }

    public static double setWaterCost(int currentLocation, int i) {
        int dist = i - currentLocation;
        if (dist < 0) {
            dist = dist * -1;
        }
        double cost = dist * 30;
        return cost;
    }
}
