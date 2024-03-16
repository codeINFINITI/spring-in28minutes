package com.jagyasi.driver;

import com.jagyasi.spring01.game.ContraGame;
import com.jagyasi.spring01.game.GameRunner;


public class Spring01 {
    public static void main(String[] args) {
        //var marioGame=new MarioGame();
        var contraGame =new ContraGame();

        var gameRunner=new GameRunner(contraGame);
        gameRunner.run();

    }
}
