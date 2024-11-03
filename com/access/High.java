package com.access;


class InnerHigh {
    public void create(){
        High obj = new High();
        System.out.println(obj.voltage);
    }
}

public class High {
    // public int voltage = 220;
    protected int voltage = 220;
}
