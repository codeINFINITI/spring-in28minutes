package com.jagyasi.spring01.game;

public class MarioGame implements  GamingConsole {
    private static final String name="Mario";
    @Override
    public String toString() {
        return name;
    }
    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("Go into a hole");
    }
    public void left(){
        System.out.println("Go back!");
    }
    public void right(){
        System.out.println("Accelerate!");
    }
}
