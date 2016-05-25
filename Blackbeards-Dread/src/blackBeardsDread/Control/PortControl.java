/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.Control;

/**
 *
 * @author jkbry
 */
public class PortControl {
    public double purchaseWater(double $water, double $gold, double $desiredWater, double $waterPrice) {
        if ($desiredWater < 0 || $desiredWater > 10){
            return -1;
        }
        
        if ($gold < ($desiredWater * $waterPrice)) {
            return -2;
        }
        
        double $newWaterTotal = $water + $desiredWater;
        
        if ($newWaterTotal > 100) {
            return -3;
        }
        
        return $desiredWater;
    }
}
