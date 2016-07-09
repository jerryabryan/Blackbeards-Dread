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
    private  double store;
    private double cost;

    PurchaseSupplies(String store, double cost, double storeType) {
        super(store);
        this.cost = cost;
        this.store = storeType;
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
