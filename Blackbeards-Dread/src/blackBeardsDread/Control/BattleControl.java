/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.Control;

import blackBeardsDread.View.BattleResultView;
import blackBeardsDread.model.Sea;

/**
 *
 * @author jkbry
 */
public class BattleControl {

   
    public static int runAway(Sea sea) {
        System.out.println("*** runAway function called ***");
        BattleResultView battleResultView = new BattleResultView();
        battleResultView.displayBattleResultView(3, sea);
        return 3;
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

    public static int fireCannons(Sea sea) {
            BattleResultView battleResultView = new BattleResultView();
        battleResultView.displayBattleResultView(1, sea);
        return 1;
    }
    
    
    
}
