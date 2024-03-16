package com.jagyasi.driver;

import com.jagyasi.spring01.game.GameRunner;
import com.jagyasi.spring01.game.MarioGame;

public class Spring01 {
    public static void main(String[] args) {
        var marioGame=new MarioGame();
        var gameRunner=new GameRunner(marioGame);
        gameRunner.run();

    }
}
