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
       System.out.println("*** purchaseSupplies function called ***");
    }

    private void map() {
       System.out.println("*** map function called ***");
    }

    private void viewInventory() {
        System.out.println("*** viewInventory function called ***");
    }
}
