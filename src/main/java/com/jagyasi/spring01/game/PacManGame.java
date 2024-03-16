package com.jagyasi.spring01.game;

public class PacManGame implements  GamingConsole{
    private static final String name="PacMan";
    @Override
    public String toString() {
        return name;
    }

    @Override
    public void up() {
        System.out.println("Go UP");
    }

    @Override
    public void down() {
        System.out.println("Go DOWN");
    }

    @Override
    public void left() {
        System.out.println("Go LEFT");
    }

    @Override
    public void right() {
        System.out.println("Go RIGHT");
    }
}
