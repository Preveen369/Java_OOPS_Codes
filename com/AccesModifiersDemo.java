package com;

import com.access.*;

class Current extends High{
    public void create(){
        System.out.println(voltage);
    }
}

/* Access Modifier Conventions:
 * use public for -> classes, methods
 * use private for -> instance variables
 * avoid using default (package-private)
 * use protected for -> inherited classes
 */

public class AccesModifiersDemo {
    public static void main(String[] args) {
        // High obj = new High();
        // System.out.println(obj.voltage);

        // Low obj1 = new Low();
        // System.out.println(obj1.voltage);
    }
}
