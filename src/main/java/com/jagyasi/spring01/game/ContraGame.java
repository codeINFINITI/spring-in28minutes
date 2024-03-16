package com.jagyasi.spring01.game;

public class ContraGame implements GamingConsole{
   private static final String name="Contra";
    @Override
    public void up(){
        System.out.println("Jump");
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void down(){
        System.out.println("Sit");
    }
    @Override
    public void left(){
        System.out.println("Go back!");
    }
    @Override
    public void right(){
        System.out.println("Accelerate & Shoot!");
    }

}

