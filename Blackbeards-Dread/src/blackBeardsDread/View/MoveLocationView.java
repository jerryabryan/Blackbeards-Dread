/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.View;

import blackBeardsDread.Control.BattleControl;
import blackBeardsDread.Control.InventoryControl;
import blackBeardsDread.Control.LocationControl;
import blackBeardsDread.Control.MapControl;
import blackBeardsDread.Exceptions.InventoryControlException;
import blackBeardsDread.model.Battle;
import blackBeardsDread.model.Game;
import blackBeardsDread.model.Inventory;
import blackBeardsDread.model.Item;
import blackBeardsDread.model.Location;
import blackBeardsDread.model.LocationScene;
import blackBeardsDread.model.Map;
import blackBeardsDread.model.Scene;
import blackBeardsDread.model.Sea;
import blackBeardsDread.model.Ship;
import blackbeards.dread.BlackbeardsDread;
import java.util.Scanner;

/**
 *
 * @author Evan
 */
public class MoveLocationView extends View{
  
    private int currentLocation;
    private int endLocation;
    private Ship eShip;
    private Ship pShip;
    
    public MoveLocationView() {
        super("\n"
                  + "\n----------------------------"
                  + "\n| Choose Destination        |"
                  + "\n----------------------------"
                  + "\n1 - London Port"
                  + "\n2 - Canary Islands Port"
                  + "\n3 - Bahamas Port"
                  + "\n4 - Guadalajara Port"
                  + "\n5 - Florida Keys Port"
                  + "\nQ - Cancel "
                  + "\n----------------------------");
        
    }
    //computer displays a message prompting the player to enter the desired location.
    //player enters the location.
    // if the locaiton is invalid, a message is displayed and the user is prompted to reenter the location.
    // the computer will move the player to the location.
    //if an enemey ship is encountered along the way, the player is stopped at the ship's location

    
    @Override
    public boolean doAction(String value) {
            value = value.toUpperCase();
        this.currentLocation = 0;
        switch (value) {
            case "1": 
                this.setCourse(1);
                return true;
            case "2": //Load Saved Game
                this.setCourse(2);
                return true;
            case "3": //Display Help Menu
                this.setCourse(3);
                return true;
            case "4": //Save current game
               this.setCourse(4);
                return true;
                case "5": //Save current game
               this.setCourse(5);
                return true;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
        }
       return false;
    }

    private void setCourse(int i) {
        Game game = BlackbeardsDread.getCurrentGame();
        Map map = game.getMap();
        Location currentLocation = map.getCurrentLocation();
        this.currentLocation = MapControl.portToInt(currentLocation);
        this.endLocation = i;
        if (this.currentLocation == i) {
            return;
        }
        Sea sea = LocationControl.setCourse(this.currentLocation, i);
        double foodCost = LocationControl.setFoodCost(this.currentLocation, i);
        double waterCost = LocationControl.setWaterCost(this.currentLocation, i);
        String fCost = String.valueOf(foodCost);
        String wCost = String.valueOf(waterCost);
        String banner  = "\n"
                  + "\n-----------------------------"
                  + "\n|      Cost to set sail      "
                  + "\n-----------------------------"
                  + "\n - Water Cost -              "
                  + "\n " + wCost + "            "        
                  + "\n - Food Cost -              "
                  + "\n " + fCost + "            " 
                  + "\n "
                  + "\n----------------------------";
        this.console.println(banner);
        this.console.println("Continue? (Y/N)");
        boolean done = false; // set flat to not done
        do {
            
            String menuOption = this.getMenuOption2();
            if (menuOption.toUpperCase().equals("N")) // User wants to quit
                return; // exit game
            
            // do the requested action and dispaly the next view
            done = this.setSail(menuOption, foodCost, waterCost, i);
            
        } while(!done);    
       
        //GameMenuView gameMenu = new GameMenuView();
        //gameMenu.displayGameMenuView();
        return;
    }

    private boolean setSail(String choice, double wCost, double fCost, int i) {
       choice = choice.toUpperCase();
       if ("Y".equals(choice)) {
           try {
           InventoryControl.checkTravelCost(wCost, fCost);
             } catch (InventoryControlException me) {
                this.console.println(me.getMessage());
                
                 if (me != null) {
                     return true;
                 }
             }
           InventoryControl.deductSuppliesFromInventory(wCost, fCost);
           Location location = MapControl.intToPort(i);
           Scene Scene = location.getScene();
           Battle battle = Scene.getBattle();
           boolean done = false;
           this.eShip = battle.getEnemyShip();
           Game game = BlackbeardsDread.getCurrentGame();
           game.seteShip(this.eShip);
           BlackbeardsDread.setCurrentGame(game);
           this.pShip = game.getShip();
           do {
           BattleSequenceView battleSequenceView = new BattleSequenceView(location);
           battleSequenceView.display();
           Game game2 = BlackbeardsDread.getCurrentGame();
           Map map2 =game2.getMap();
           Location location2 = map2.getCurrentLocation();
           Scene scene2 = location2.getScene();
           Battle battle2 = scene2.getBattle();
           done = battle2.isDone();
           } while(!done);
           if (this.pShip.getDammage() >= this.pShip.getHealth()) {
               this.console.println("You lost");
               StartProgramView startProgramView = new StartProgramView();
               try {
               startProgramView.displayStartProgramView();
               } catch (Throwable te) {
               this.console.println(te.getMessage());
               te.printStackTrace();
               startProgramView.displayStartProgramView();
               }    
           } else {
//            Game gameUpdate = BlackbeardsDread.getCurrentGame();
//            Map mapUpdate = gameUpdate.getMap();
//            Location[][] locations = mapUpdate.getLocations();
//            Location currentLocation = mapUpdate.getCurrentLocation();
//            Scene sceneUpdate = currentLocation.getScene();
//            Battle battleUpdate = sceneUpdate.getBattle();
//            String description = sceneUpdate.getDescription();
//            this.console.println("\n--------------------------------"
//                             + "\n   You have Arrived Saftely   "
//                             + "\n   at " + description 
//                             + "\n--------------------------------");
//            double reward = battleUpdate.getReward();
//            Inventory[] inventory = gameUpdate.getInventory();
//            if (currentLocation == locations[0][0]) {
//                if (inventory[Item.food.ordinal()].getQuantityInStock() < 20) {
//                inventory[Item.food.ordinal()].setQuantityInStock(20);
//                } 
//            if (inventory[Item.water.ordinal()].getQuantityInStock() < 20) {
//                inventory[Item.water.ordinal()].setQuantityInStock(20);
//                 }}
//            double gold = inventory[Item.gold.ordinal()].getQuantityInStock();
//            double newGold = gold + reward;
//            inventory[Item.gold.ordinal()].setQuantityInStock(newGold);
//            gameUpdate.setInventory(inventory);
//            BlackbeardsDread.setCurrentGame(gameUpdate);
            
               
           
           return true;
       }
       } else {
           return false;
        }
        return false;
    }

    private String getMenuOption2() {
        Scanner keyboard = new Scanner(System.in); 
        String value = "";
        boolean valid = false;
        
        while (!valid) {
           
            this.console.println("\nSelect Y-Yes or N-NO");
            
            value = keyboard.nextLine();
            value = value.trim();
            
            if (value.length() < 1) {
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break;
        }
        
        return value;
    }

    

}
