package com.company;

interface GameFunctions {
    void RunStart();
    void RunStop();
    void JumpState();
    void Action1State();
    void Action2State();
}

public class BaseGame implements GameFunctions{
    public void RunStart() {
        System.out.println("Started Running...");
    }
    public void RunStop() {
        System.out.println("Stopped running");
    }
    public void JumpState() {
        System.out.println("Execute jump");
    }
    public void Action1State() {
        System.out.println("Execute action 1");
    }
    public void Action2State() {
        System.out.println("Executed action 2");
    }

    public static void main(String[] args) {
        BaseGame game = new BaseGame();
        game.RunStart();
        game.RunStop();
        game.Action1State();
        game.Action2State();
    }
}
