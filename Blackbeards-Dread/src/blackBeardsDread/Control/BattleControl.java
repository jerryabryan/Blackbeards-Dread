/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.Control;

import blackBeardsDread.View.BattleResultView;

/**
 *
 * @author jkbry
 */
public class BattleControl {

    public static void fireCannons() {
        System.out.println("*** fireCannons function called ***");
        BattleResultView battleResultView = new BattleResultView();
        battleResultView.displayBattleResultView(1);
    }

    public static void runAway() {
        System.out.println("*** runAway function called ***");
        BattleResultView battleResultView = new BattleResultView();
        battleResultView.displayBattleResultView(3);
    }

    public static double startEnemyHealth() {
        System.out.println("*** startEnemyHealth function called ***");
        return 25;
    }

    public static double startEnemyLevel() {
        System.out.println("*** startEnemyLevel function called ***");
        return 10;
    }

    public static double startPlayerHealth() {
        System.out.println("*** startPlayerHealth function called ***");
        return 20;
    }
    
    
    
}
