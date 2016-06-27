/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.View;

import blackBeardsDread.Control.BattleControl;
import blackBeardsDread.Control.LocationControl;
import blackBeardsDread.model.Game;
import blackBeardsDread.model.Inventory;
import blackBeardsDread.model.Location;
import blackBeardsDread.model.Map;
import blackbeards.dread.BlackbeardsDread;

import java.util.Scanner;

/**
 *
 * @author Evan
 */
public class MoveLocationView extends View{
  
   
    
    public MoveLocationView() {
        super("\n"
                  + "\n----------------------------"
                  + "\n| Choose Destination        |"
                  + "\n----------------------------"
                  + "\n1 - Port 1"
                  + "\n2 - Port 2"
                  + "\n3 - Port 3"
                  + "\n4 - Port 4"
                  + "\n5 - Port 5"
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
        Inventory[] inventoryItems = game.getInventory();
        Map map = game.getMap();
        Location currentLocation = map.getCurrentLocation();
        Location[][] locations = map.getLocations();
        boolean set = LocationControl.setCourse(map, i);
        if (set == false) {
            return;
        }
        this.sea.setStartLocation(currentLocation);
        this.sea.setEndLocation(locations[i][0]);
        String fCost = String.valueOf(20);
        String wCost = String.valueOf(20);
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
        System.out.println(banner);
        System.out.println("Continue? (Y/N)");
        boolean done = false; // set flat to not done
        do {
            
            String menuOption = this.getMenuOption2();
            if (menuOption.toUpperCase().equals("N")) // User wants to quit
                return; // exit game
            
            // do the requested action and dispaly the next view
            done = this.setSail(menuOption);
            
        } while(!done);    
        ArrivalView arrivalView = new ArrivalView();
        arrivalView.displayArrivalView(i);
        //GameMenuView gameMenu = new GameMenuView();
        //gameMenu.displayGameMenuView();
        return;
    }

    private boolean setSail(String choice) {
       choice = choice.toUpperCase();
       if ("Y".equals(choice)) {
          
           BattleSequenceView battleSequenceView = new BattleSequenceView();
           battleSequenceView.display();
           return true;
       } else {
           return false;
       }
    }

    private String getMenuOption2() {
        Scanner keyboard = new Scanner(System.in); 
        String value = "";
        boolean valid = false;
        
        while (!valid) {
           
            System.out.println("\nSelect Y-Yes or N-NO");
            
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
