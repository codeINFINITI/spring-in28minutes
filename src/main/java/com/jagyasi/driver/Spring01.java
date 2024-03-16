package com.jagyasi.driver;

import com.jagyasi.spring01.game.ContraGame;
import com.jagyasi.spring01.game.GameRunner;
import com.jagyasi.spring01.game.MarioGame;
import com.jagyasi.spring01.game.PacManGame;


public class Spring01 {
    public static void main(String[] args) {
        var marioGame=new MarioGame();
        var contraGame =new ContraGame();
        var pacmanGame=new PacManGame();


        var gameRunner=new GameRunner(contraGame);
        gameRunner.run();
        gameRunner=new GameRunner(marioGame);
        gameRunner.run();
        gameRunner=new GameRunner(pacmanGame);
        gameRunner.run();

    }
}
