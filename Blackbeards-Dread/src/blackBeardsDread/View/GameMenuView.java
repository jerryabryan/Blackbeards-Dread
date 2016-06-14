/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.View;

import java.util.Scanner;

/**
 *
 * @author jkbry
 */
public class GameMenuView {
    private final String menu;

    
    public GameMenuView() {
        this.menu = "\n"
                  + "\n----------------------------"
                  + "\n| Game Menu                |"
                  + "\n----------------------------"
                  + "\nM - Map"
                  + "\nS - Purchase supplies"
                  + "\nC - Change Store"
                  + "\nP - Move Port Location"
                  + "\nI - Inventory"
                  + "\nQ - Back To Main Menu"
                  + "\n----------------------------";
    }
    
    void displayGameMenuView() {
        
        boolean done = false; // set flat to not done
        do {
            //prompt for and get player name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) 
                // User wants to quit
                return; // exit game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
            
        } while(!done);
    
    }   

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
            case "M": //map
                this.map();
                break;
            case "S": //purchase supplies
                this.purchaseSupplies();
                break;
            case "C": //Change Store
                this.changeStore();
                break;
            case "P": //move port Location
                MoveLocationView moveLocationView = new MoveLocationView();
                moveLocationView.displayMoveLocationView(0);
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
       System.out.println("*** purchaseSupplies function called ***");
    }

    private void map() {
       System.out.println("*** map function called ***");
    }

    private void viewInventory() {
        System.out.println("*** viewInventory function called ***");
    }
}
