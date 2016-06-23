/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackBeardsDread.model;

import java.io.Serializable;
/**
 *
 * @author jkbry
 */
public enum Location implements Serializable{
    
    //port one
    one(5),
    two(10),
    three(15),
    four(20),
    five(25),
    
    //port two
    six(30),
    seven(35),
    eight(40),
    nine(45),
    ten(50),
    
    //port three
    eleven(55),
    twelve(60),
    thirteen(65),
    fourteen(70),
    fifteen(75),
    
    //port four
    sixteen(80),
    seventeen(85),
    eighteen(90),
    nineteen(95),
    twenty(100),
    
    //port five
    twentyone(105),
    twentytwo(110),
    twentythree(115),
    twentyfour(120),
    twentyfive(125),
    
    //port six
    twentysix(130),
    twentyeseven(135),
    twentyeight(140),
    twentynine(145),
    thirty(150);
    
    private final int price;

    Location(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
    
}