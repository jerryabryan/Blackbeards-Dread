/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.View;

import blackBeardsDread.model.Game;
import blackBeardsDread.model.Inventory;
import blackBeardsDread.model.Location;
import blackBeardsDread.model.Map;
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
                  + "\n| Game Menu                |"
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
        System.out.println("*** changeSore function called ***");
    }

    private void purchaseSupplies() {
      

       PurchaseSupplies purchaseSupplies = new PurchaseSupplies("Water", 20);
       purchaseSupplies.display();
       
    }



    private void viewInventory() {
      StringBuilder line;
      
      Game game = BlackbeardsDread.getCurrentGame();
      Inventory[] inventory = game.getInventory();
      
      System.out.println("\n        LIST OF INVENTORY ITEMS");
      line = new StringBuilder("                                     ");
      line.insert(0, "DESCRIPTION");
      line.insert(20, "REQUIRED");
      line.insert(30, "IN STOCK");
      System.out.println(line.toString());
      
      for (Inventory item : inventory) {
          line = new StringBuilder("                                      ");
          line.insert(0, item.getInventoryType());
          line.insert(23, item.getRequiredAmount());
          line.insert(33, item.getQuantityInStock());
          
          System.out.println(line.toString());
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
    System.out.println();
    for( int row = 0; row < locations.length; row++){
      System.out.print(row + " "); // print row numbers to side of map
      for( int column = 0; column < locations[row].length; column++){
          String leftIndicator = " ";
          String rightIndicator = " ";
        //if(locations[row][column] == map.getCurrentLocation()){
          //leftIndicator = "*"; // can be stars or whatever these are indicators showing visited
         // rightIndicator = "*"; // same as above
        //} else 
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
      System.out.println("|");
    }
  }catch (Exception e) {
    System.out.println("Error");
  }
    }
}
