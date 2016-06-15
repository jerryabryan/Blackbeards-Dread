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
public class BattleResultView {
    private String result;


    
    public BattleResultView() {
        this.result = "\nBattle Results";
    }

    public void displayBattleResultView(int i) {
        switch (i) {
            case 1: //Success
                this.successMessage();
                break;
            case 2: //Loss
                this.lossMessage();
                break;
            case 3: //Return back to Dead Reef Cove
                this.returnToCove();
                break;    
            default:
                System.out.println("\n*** Display Error in Battle Result ***");
        }
       
    }

    private void successMessage() {
        System.out.println("\n*** You Won! ***");
    }

    private void lossMessage() {
        System.out.println("\n*** You Lost! ***");
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
    }

    private void returnToCove() {
        System.out.println("\n*** You successfully fleed to Dead Reef Cove!***");
        
       
    }

}
