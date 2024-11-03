package com.tools;

public class AdvCalc extends Calc{
    // Single-level Inheritance
    // AdvCalc -> Subclass; Calc -> Superclass
    // NOTE: Inheritance usually contains: "is a", "has a" relationship.
    // also contains add() and sub() method from "Calc" class
    public int mul(int n1, int n2){
        return n1*n2;
    }
    public int div(int n1, int n2){
        return n1/n2;
    }
    public static void main(String[] args) {
        
    }
}
