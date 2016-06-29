/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.View;

/**
 *
 * @author Evan
 */
class ArrivalView {
    private String banner;
    
    public ArrivalView() {
         this.banner = "\n"
                  + "\n--------------------------------"
                  + "\n|   You have Arrived Saftely   |"
                  + "\n--------------------------------";
    }

    public void displayArrivalView(int location) {
        System.out.println(this.banner);
        System.out.println("you are at port" + location);
        
    }
}
