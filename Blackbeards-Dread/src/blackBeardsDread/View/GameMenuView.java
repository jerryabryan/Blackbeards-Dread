/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.View;

import blackBeardsDread.model.Game;
import blackBeardsDread.model.Inventory;
import blackBeardsDread.model.Location;
import blackBeardsDread.model.LocationScene;
import blackBeardsDread.model.LocationScene.StoreType;
import blackBeardsDread.model.Map;
import blackBeardsDread.model.Scene;
import blackbeards.dread.BlackbeardsDread;
import java.util.Scanner;

/**
 *
 * @author jkbry
 */
public class GameMenuView extends View {
   
  

    
    public GameMenuView() {
        super("\n"
                  + "\n----------------------------"
                  + "\n|        Game Menu         |"
                  + "\n----------------------------"
                  + "\nM - Map"
                  + "\nS - Purchase supplies"
                  + "\nC - Change Store"
                  + "\nP - Move Port Location"
                  + "\nI - Inventory"
                  + "\nQ - Back To Main Menu"
                  + "\n----------------------------");
    }
    
    
    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        
        switch (value) {
            case "M": //map
                this.displayMap();
                break;
            case "S": //purchase supplies
                this.purchaseSupplies();
                break;
            case "C": //Change Store
                this.changeStore();
                break;
            case "P": //move port Location
                MoveLocationView moveLocationView = new MoveLocationView();
                moveLocationView.display();
                break;
            case "I":
                this.viewInventory();
                break;    
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
        }

        return false;
    }

    private void changeStore() {
        this.console.println("*** changeStore function called ***");
    }

    private void purchaseSupplies() {
       Game game = BlackbeardsDread.getCurrentGame();
       Map map = game.getMap();
       Location currentLocation = map.getCurrentLocation();
       Location[][] locations = map.getLocations();
       if (currentLocation == locations[0][0]) {
           System.out.println("Purchase supplies is not available at this location");
           return;
       }
       Scene scene = currentLocation.getScene();
       LocationScene locationScene = scene.getLocationScene();
       double storeType = locationScene.getStoreType();
       String store;
       if (storeType == 0) {
          store = "\n"
                  + "\n----------------------------"
                  + "\n Dry Dock            "
                  + "\n----------------------------"
                  + "\n Price for 10 health"
                  + "\n "+locationScene.getPrice()+" Pieces of Gold"
                  + "\n"
                  + "\n Confirm Purchase?"
                  + "\nY - Yes"
                  + "\nN - No"
                  + "\n----------------------------";
       } else if (storeType == 1) {
           store = "\n"
                  + "\n----------------------------"
                  + "\n Food Store            "
                  + "\n----------------------------"
                  + "\n Price for 10 food"
                  + "\n "+locationScene.getPrice()+" Pieces of Gold"
                  + "\n"
                  + "\n Confirm Purchase?"
                  + "\nY - Yes"
                  + "\nN - No"
                  + "\n----------------------------";
       } else if (storeType == 2) {
           store = "\n"
                  + "\n----------------------------"
                  + "\n Water Store            "
                  + "\n----------------------------"
                  + "\n Price for 10 health"
                  + "\n "+locationScene.getPrice()+" Pieces of Gold"
                  + "\n"
                  + "\n Confirm Purchase?"
                  + "\nY - Yes"
                  + "\nN - No"
                  + "\n----------------------------";
          
       } else if (storeType == 3) {
           store = "\n"
                  + "\n----------------------------"
                  + "\n Armory            "
                  + "\n----------------------------"
                  + "\n Price for 1 ship upgrade"
                  + "\n "+locationScene.getPrice()+" Pieces of Gold"
                  + "\n"
                  + "\n Confirm Purchase?"
                  + "\nY - Yes"
                  + "\nN - No"
                  + "\n----------------------------";
       } else if (storeType == 4) {
           store = "\n"
                  + "\n----------------------------"
                  + "\n Guild Hall            "
                  + "\n----------------------------"
                  + "\n Do a job and earn"
                  + "\n "+locationScene.getPrice()+" Pieces of Gold"
                  + "\n"
                  + "\n Confirm?"
                  + "\nY - Yes"
                  + "\nN - No"
                  + "\n----------------------------";
       } else {
           System.out.println("Purchase supplies is not available at this location");
           return;
       }
       

       PurchaseSupplies purchaseSupplies = new PurchaseSupplies(store, locationScene.getPrice(), storeType);
       purchaseSupplies.display();
       
    }



    private void viewInventory() {
      StringBuilder line;
      
      Game game = BlackbeardsDread.getCurrentGame();
      Inventory[] inventory = game.getInventory();
      
      this.console.println("\n        LIST OF INVENTORY ITEMS");
      line = new StringBuilder("                                     ");
      line.insert(0, "DESCRIPTION");
      line.insert(20, "REQUIRED");
      line.insert(30, "IN STOCK");
      this.console.println(line.toString());
      
      for (Inventory item : inventory) {
          line = new StringBuilder("                                      ");
          line.insert(0, item.getInventoryType());
          line.insert(23, item.getRequiredAmount());
          line.insert(33, item.getQuantityInStock());
          
          this.console.println(line.toString());
      }
              
        
        
      //  InventoryView InventoryView = new InventoryView();
      //  InventoryView.display();
    }

    private void displayMap() {
        Game game = BlackbeardsDread.getCurrentGame();
        Map map = game.getMap();
        Location[][] locations = map.getLocations();
        try { 
    System.out.print("  |");
    for( int column = 0; column < locations[0].length; column++){
      System.out.print("    " + column + "    |"); // print col numbers to side of map
    }
    this.console.println();
    for( int row = 0; row < locations.length; row++){
      System.out.print(row + " "); // print row numbers to side of map
      for( int column = 0; column < locations[row].length; column++){
          String leftIndicator = " ";
          String rightIndicator = " ";
        if(locations[row][column] == map.getCurrentLocation()){
          leftIndicator = "*"; // can be stars or whatever these are indicators showing visited
          rightIndicator = "*"; // same as above
        } else 
        if(locations[row][column].isVisited()){
           leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
           rightIndicator = "<"; // same as above
        }
        System.out.print("|"); // start map with a |
        if(locations[row][column].getScene() == null)
          System.out.print(leftIndicator + "??" + rightIndicator);
        else
          System.out.print(leftIndicator + locations[row][column].getScene().getMapSymbol() + rightIndicator);
      }
      this.console.println("|");
    }
  }catch (Exception e) {
    System.out.println("Error");
  }
    }

}
