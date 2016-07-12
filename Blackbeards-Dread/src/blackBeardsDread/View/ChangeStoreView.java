/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.View;

import blackBeardsDread.model.Game;
import blackBeardsDread.model.Location;
import blackBeardsDread.model.Map;
import blackbeards.dread.BlackbeardsDread;

/**
 *
 * @author Evan
 */
class ChangeStoreView extends View{
    
    
    public ChangeStoreView() {
        super("\n"
                  + "\n----------------------------"
                  + "\n| Choose Store        |"
                  + "\n----------------------------"
                  + "\n1 - Dry Dock"
                  + "\n2 - Food Store"
                  + "\n3 - Water Store"
                  + "\n4 - Armory"
                  + "\n5 - Guild Hall"
                  + "\nQ - Cancel "
                  + "\n----------------------------");
        
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        switch (value) {
            case "1": 
                this.changeStore(0);
                return true;
            case "2": 
                this.changeStore(1);
                return true;
            case "3": 
                this.changeStore(2);
                return true;
            case "4": 
               this.changeStore(3);
                return true;
                case "5": 
               this.changeStore(4);
                return true;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
        }
       return false;
    }

    private void changeStore(int i) {
         Game game = BlackbeardsDread.getCurrentGame();
         Map map = game.getMap();
         Location[][] locations = map.getLocations();
         Location currentLocation = map.getCurrentLocation();
         boolean found = false;
         int row;
         for( row = 0; found == false; row++){
        for( int column = 0; column < locations[row].length; column++){
            if (currentLocation == locations[row][column]) {
              found = true;
                }     
             }
         }
         if (locations[row][i] == currentLocation) {
             System.out.println("You are already here");
             return;
         }
         row = row - 1;
         currentLocation = locations[row][i];
         map.setCurrentLocation(currentLocation);
         game.setMap(map);
         return;
    }
}
