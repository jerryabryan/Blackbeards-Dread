/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.Control;

import blackBeardsDread.model.Location;
import blackBeardsDread.model.LocationScene;
import blackBeardsDread.model.Map;
import blackBeardsDread.model.Scene;
import blackBeardsDread.model.Sea;

/**
 *
 * @author jkbry
 */
public class LocationControl {

  
    

    

    public static boolean setCourse(Map map, int i) {
       Location[][] locations = map.getLocations();
       Location currentLocation = map.getCurrentLocation();
       if (currentLocation == locations[i][0]){
           return false;
       } else {
           return true;
       }
    }
}
