/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.View;

import blackBeardsDread.Control.BattleControl;
import blackBeardsDread.Control.LocationControl;
import blackBeardsDread.model.Sea;
import java.util.Scanner;

/**
 *
 * @author Evan
 */
public class MoveLocationView {
    private String menu;
    private int currentLocation;
    
    public MoveLocationView() {
        this.menu = "\n"
                  + "\n----------------------------"
                  + "\n| Choose Desination        |"
                  + "\n----------------------------"
                  + "\n1 - Port 1"
                  + "\n2 - Port 2"
                  + "\n3 - Port 3"
                  + "\n4 - Port 4"
                  + "\n5 - Port 5"
                  + "\nC - Cancel "
                  + "\n----------------------------";
       
    }
    //computer displays a message prompting the player to enter the desired location.
    //player enters the location.
    // if the locaiton is invalid, a message is displayed and the user is prompted to reenter the location.
    // the computer will move the player to the location.
    //if an enemey ship is encountered along the way, the player is stopped at the ship's location

    public void displayMoveLocationView(int currentLocation) {
        this.currentLocation = currentLocation;
        boolean done = false; // set flat to not done
        do {
            
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("C")) // User wants to quit
                return; // exit game
            
            // do the requested action and dispaly the next view
            done = this.doAction(menuOption);
            
        } while(!done);    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); 
        String value = "";
        boolean valid = false;
        
        while (!valid) {
            System.out.println(this.menu);
            System.out.println("\nSelect a Menu Option");
            
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

    private boolean doAction(String choice) {
            choice = choice.toUpperCase();
        
        switch (choice) {
            case "1": 
                this.setCourse(1);
                break;
            case "2": //Load Saved Game
                this.setCourse(2);
                break;
            case "3": //Display Help Menu
                this.setCourse(3);
                break;
            case "4": //Save current game
               this.setCourse(4);
                break;
                case "5": //Save current game
               this.setCourse(5);
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");
        }
       return false;
    }

    private void setCourse(int i) {
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
        System.out.println(banner);
        System.out.println("Continue? (Y/N)");
        boolean done = false; // set flat to not done
        do {
            
            String menuOption = this.getMenuOption2();
            if (menuOption.toUpperCase().equals("N")) // User wants to quit
                return; // exit game
            
            // do the requested action and dispaly the next view
            done = this.setSail(menuOption, i);
            
        } while(!done);    
        ArrivalView arrivalView = new ArrivalView();
        arrivalView.displayArrivalView(i);
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private boolean setSail(String choice, int i) {
       choice = choice.toUpperCase();
       if ("Y".equals(choice)) {
          
           BattleSequenceView battleSequenceView = new BattleSequenceView();
           battleSequenceView.displayBattleSequenceView();
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
