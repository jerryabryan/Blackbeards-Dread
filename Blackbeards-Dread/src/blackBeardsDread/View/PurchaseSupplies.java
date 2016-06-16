/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.View;

import blackBeardsDread.Control.PortControl;

/**
 *
 * @author Evan
 */
public class PurchaseSupplies extends View {
    private  String store;
    private int cost;

    PurchaseSupplies(String store, int cost) {
        super("\n"
                  + "\n----------------------------"
                  + "\n  "+store+" Store           "
                  + "\n----------------------------"
                  + "\n Price for 10 Units"
                  + "\n "+cost+" Pieces of Gold"
                  + "\n"
                  + "\n Purchase "+store+"?"
                  + "\nY - Yes"
                  + "\nN - No"
                  + "\n----------------------------");
        this.store = store;
        this.cost = cost;
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase();
        boolean done = false;
        switch(value){
            case "N":
                done = true;
                break;
            case "Y":
               PortControl.purchase(this.store, this.cost);
                done = true;
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again");    
                
                
        }
        return done;
    }
}
