/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.Control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jkbry
 */
public class PortControlTest {
    
    public PortControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of purchaseWater method, of class PortControl.
     */
    @Test
    public void testPurchaseWater() {
        System.out.println("purchaseWater");
        
        /************************
            * Test Case #1
        ************************/
        System.out.println("\t Test case #1");
        
        double $water = 50;
        double $gold = 52;
        double $desiredWater = 4;
        double $waterPrice = 5;
        PortControl instance = new PortControl();
        double expResult = 4;
        double result = instance.purchaseWater($water, $gold, $desiredWater, $waterPrice);
        assertEquals(expResult, result, 0.0);
        
        /************************
            * Test Case #2
        ************************/
        System.out.println("\t Test case #2");
        
        $water = 50;
        $gold = 52;
        $desiredWater = -2;
        $waterPrice = 5;
        PortControl instance2 = new PortControl();
        expResult = -1;
        result = instance.purchaseWater($water, $gold, $desiredWater, $waterPrice);
        assertEquals(expResult, result, 0.0);
        
        /************************
            * Test Case #3
        ************************/
        System.out.println("\t Test case #3");
        
        $water = 50;
        $gold = 100;
        $desiredWater = 11;
        $waterPrice = 5;
        PortControl instance3 = new PortControl();
        expResult = -1;
        result = instance.purchaseWater($water, $gold, $desiredWater, $waterPrice);
        assertEquals(expResult, result, 0.0);
        
        /************************
            * Test Case #4
        ************************/
        System.out.println("\t Test case #4");
        
        $water = 50;
        $gold =24;
        $desiredWater = 5;
        $waterPrice = 5;
        PortControl instance4 = new PortControl();
        expResult = -2;
        result = instance.purchaseWater($water, $gold, $desiredWater, $waterPrice);
        assertEquals(expResult, result, 0.0);
        
        /************************
            * Test Case #5
        ************************/
        System.out.println("\t Test case #5");
        
        $water = 100;
        $gold = 52;
        $desiredWater = 4;
        $waterPrice = 5;
        PortControl instance5 = new PortControl();
        expResult = -3;
        result = instance.purchaseWater($water, $gold, $desiredWater, $waterPrice);
        assertEquals(expResult, result, 0.0);
        
        /************************
            * Test Case #6
        ************************/
        System.out.println("\t Test case #6");
        
        $water = 50;
        $gold = 500;
        $desiredWater = 0;
        $waterPrice = 5;
        PortControl instance6 = new PortControl();
        expResult = 0;
        result = instance.purchaseWater($water, $gold, $desiredWater, $waterPrice);
        assertEquals(expResult, result, 0.0);
    
        /************************
            * Test Case #7
        ************************/
        System.out.println("\t Test case #7");
        
        $water = 50;
        $gold = 500;
        $desiredWater = 10;
        $waterPrice = 5;
        PortControl instance7 = new PortControl();
        expResult = 10;
        result = instance.purchaseWater($water, $gold, $desiredWater, $waterPrice);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of purchaseFood method, of class PortControl.
     */
    @Test
    public void testPurchaseFood() {
        System.out.println("purchaseFood");
        
        /************************
            * Test Case #1
        ************************/
        System.out.println("\t Test case #1");
        
        double $food = 50;
        double $gold = 52;
        double $desiredFood = 4;
        double $foodPrice = 5;
        PortControl instance = new PortControl();
        double expResult = 4;
        double result = instance.purchaseWater($food, $gold, $desiredFood, $foodPrice);
        assertEquals(expResult, result, 0.0);
        
        /************************
            * Test Case #2
        ************************/
        System.out.println("\t Test case #2");
        
        $food = 50;
        $gold = 52;
        $desiredFood = -2;
        $foodPrice = 5;
        PortControl instance2 = new PortControl();
        expResult = -1;
        result = instance.purchaseWater($food, $gold, $desiredFood, $foodPrice);
        assertEquals(expResult, result, 0.0);
        
        /************************
            * Test Case #3
        ************************/
        System.out.println("\t Test case #3");
        
        $food = 50;
        $gold = 100;
        $desiredFood = 11;
        $foodPrice = 5;
        PortControl instance3 = new PortControl();
        expResult = -1;
        result = instance.purchaseWater($food, $gold, $desiredFood, $foodPrice);
        assertEquals(expResult, result, 0.0);
        
        /************************
            * Test Case #4
        ************************/
        System.out.println("\t Test case #4");
        
        $food = 50;
        $gold =24;
        $desiredFood = 5;
        $foodPrice = 5;
        PortControl instance4 = new PortControl();
        expResult = -2;
        result = instance.purchaseWater($food, $gold, $desiredFood, $foodPrice);
        assertEquals(expResult, result, 0.0);
        
        /************************
            * Test Case #5
        ************************/
        System.out.println("\t Test case #5");
        
        $food = 100;
        $gold = 52;
        $desiredFood = 4;
        $foodPrice = 5;
        PortControl instance5 = new PortControl();
        expResult = -3;
        result = instance.purchaseWater($food, $gold, $desiredFood, $foodPrice);
        assertEquals(expResult, result, 0.0);
        
        /************************
            * Test Case #6
        ************************/
        System.out.println("\t Test case #6");
        
        $food = 50;
        $gold = 500;
        $desiredFood = 0;
        $foodPrice = 5;
        PortControl instance6 = new PortControl();
        expResult = 0;
        result = instance.purchaseWater($food, $gold, $desiredFood, $foodPrice);
        assertEquals(expResult, result, 0.0);
    
        /************************
            * Test Case #7
        ************************/
        System.out.println("\t Test case #7");
        
        $food = 50;
        $gold = 500;
        $desiredFood = 10;
        $foodPrice = 5;
        PortControl instance7 = new PortControl();
        expResult = 10;
        result = instance.purchaseWater($food, $gold, $desiredFood, $foodPrice);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of purchaseArmory method, of class PortControl.
     */
    @Test
    public void testPurchaseArmory() {
        System.out.println("purchaseArmory");
        System.out.println("\t Test case #1");
        
        /************************
            * Test Case #1
        ************************/
        double $weapons = 9;
        double $gold = 100;
        double $desiredWeapons = 1;
        double $weaponsPrice = 50;
        PortControl instance = new PortControl();
        double expResult = 1;
        double result = instance.purchaseArmory($weapons, $gold, $desiredWeapons, $weaponsPrice);
        assertEquals(expResult, result, 0.0);
        
        /************************
            * Test Case #2
        ************************/
        System.out.println("\t Test case #2");
        
        $weapons = 9;
        $gold = 100;
        $desiredWeapons = -2;
        $weaponsPrice = 50;
        PortControl instance2 = new PortControl();
        expResult = -1;
        result = instance.purchaseArmory($weapons, $gold, $desiredWeapons, $weaponsPrice);
        assertEquals(expResult, result, 0.0);
        
        /************************
            * Test Case #3
        ************************/
        System.out.println("\t Test case #3");
        
        $weapons = 9;
        $gold = 100;
        $desiredWeapons = 11;
        $weaponsPrice = 50;
        PortControl instance3 = new PortControl();
        expResult = -1;
        result = instance.purchaseArmory($weapons, $gold, $desiredWeapons, $weaponsPrice);
        assertEquals(expResult, result, 0.0);
        
        /************************
            * Test Case #4
        ************************/
        System.out.println("\t Test case #4");
        
        $weapons = 9;
        $gold =24;
        $desiredWeapons = 5;
        $weaponsPrice = 50;
        PortControl instance4 = new PortControl();
        expResult = -2;
        result = instance.purchaseArmory($weapons, $gold, $desiredWeapons, $weaponsPrice);
        assertEquals(expResult, result, 0.0);
        
        /************************
            * Test Case #5
        ************************/
        System.out.println("\t Test case #5");
        
        $weapons = 9;
        $gold = 52;
        $desiredWeapons = 1;
        $weaponsPrice = 50;
        PortControl instance5 = new PortControl();
        expResult = 1;
        result = instance.purchaseArmory($weapons, $gold, $desiredWeapons, $weaponsPrice);
        assertEquals(expResult, result, 0.0);
        
        /************************
            * Test Case #6
        ************************/
        System.out.println("\t Test case #6");
        
        $weapons = 9;
        $gold = 500;
        $desiredWeapons = 0;
        $weaponsPrice = 50;
        PortControl instance6 = new PortControl();
        expResult = 0;
        result = instance.purchaseArmory($weapons, $gold, $desiredWeapons, $weaponsPrice);
        assertEquals(expResult, result, 0.0);
    }
}
