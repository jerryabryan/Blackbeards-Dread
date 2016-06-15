/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.View;

/**
 *
 * @author jkbry
 */
public class InventoryView extends View {
    
    
    public InventoryView(){
        super("\n"
            + "\n----------------------------"
            + "\n|        Inventory         |"
            + "\n----------------------------"
            + "\nGold    - *Amount of Gold*"
            + "\nWater   - *Amount of Water*"
            + "\nFood    - *Amount of Food*"
            + "\nWeapons - *Current Weapons*"
            + "\n"
            + "\nPress any key and hit Enter "
            + "\nto return to Game Menu"
            + "\n----------------------------");
    }
    
    @Override
    public boolean doAction(String value) {
        System.out.println("");
        
    return true;
    }
}
