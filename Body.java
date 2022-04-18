package com.company;

public class Body extends BasicFunctions{
    final boolean alive = true;
    void eatStart() {
        System.out.println("Initiating ingesting...");
    }
    void eatStop() {
        System.out.println("Terminating digestion...");
    }

    public static void main (String[] args) {
        Body human1 = new Body();
        System.out.println(human1.alive);
        human1.eatStart();
        human1.eatStop();
    }
}

abstract class BasicFunctions {
    abstract void eatStart();
    abstract void eatStop();
}
